import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public class Laraib {

    static String[][] SEEfinal =new String[5][8];
    static String[][] TEEfinal =new String[5][8];
    static String[][] BEEfinal =new String[5][8];

    String[][] newBEproff =new String[5][7];
    String[][] newSEproff =new String[5][7];
    String[][] SEfinal =new String[5][7];
    // String[][] SEEfinal =new String[5][7];
    // String[][] TEEfinal =new String[5][7];
    // String[][] BEEfinal =new String[5][7];
    String[][] BEfinal =new String[5][7];
    String[][] TEfinal =new String[5][7];
    String[][] ST =new String[5][7];
    String[][] TT =new String[5][7];
    String[][] BT =new String[5][7];


    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {






        Laraib um=new Laraib();

        methods met=new methods();
        collision co=new collision();
        collisionRemoval cor=new collisionRemoval();
        source su=new source();
        um.gen();
       // um.upload();
        practical prac=new practical();
        prac.assignprac();
        proftimetable pro=new proftimetable();
        pro.filler();
        um.upload();
       
      /*  Splash fa=new Splash();
        fa.setVisible(true);

        try{

            for(int i=0;i<30;i++){

                Thread.sleep(50);

                if(i==29){
                        fa.dispose();
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                           // fa.setVisible(false);
                            new MENU().setVisible(true);
                        }
                    });
                }

            }


        }

        catch(Exception e){




        }*/

      practicalNewTimetable pee=new practicalNewTimetable();
      pee.setVisible(true);



     }


    public  static String SEE[][]=new String[5][8];
    public static String TEE[][]=new String[5][8];
    public static String BEE[][]=new String[5][8];





    public   void matrix(String[][] SE,String[][] TE,String[][] BE){

        for(int i=0;i<5;i++){

            for(int j=0;j<8;j++){

                SEE[i][j]=SE[i][j];
                TEE[i][j]=TE[i][j];
                BEE[i][j]=BE[i][j];
            }

        }
        //methods met=new methods();
        // met.print2(SEE,"love");



        // return SE;


    }

    void gen(){

        int flag=0; int x=0;

        Laraib um=new Laraib();
        methods met=new methods();
        collision co=new collision();
        collisionRemoval cor=new collisionRemoval();
        source su=new source();



        met.assignTE();

        met.shift(met.assign, 0);

        met.assignBE();
        met.shift(met.assignBE, 0);

        met.assignSE();
        met.shift(met.assignSE,0);

        co.proff_TE(met.assign);
        co.proff_SE(met.assignSE);
        co.proff_BE(met.assignBE);



        newBEproff=cor.colli(co.proffTE,co.proffBE);
        newSEproff=cor.colli2(newBEproff,co.proffSE,co.proffTE);


        //Conversion proffesor to their subjects
        SEfinal=cor.proff_SE_sub(newSEproff);
        TEfinal=cor.proff_TE_sub(co.proffTE);
        BEfinal= cor.proff_BE_sub(newBEproff);


        //SEEfinal=su.tre(SEfinal);
        //TEEfinal=su.tre1(met.assign);
       // BEEfinal=su.tre2(BEfinal);

        ST=su.tre(SEfinal);
        TT=su.tre1(met.assign);
        BT=su.tre2(BEfinal);

        SEEfinal=met.change(ST);
        TEEfinal=met.change(TT);
        BEEfinal=met.change(BT);

        SEEfinal=met.change1(SEEfinal);
        TEEfinal=met.change1(TEEfinal);
        BEEfinal=met.change1(BEEfinal);

        SEEfinal=met.change2(SEEfinal);
        TEEfinal=met.change2(TEEfinal);
        BEEfinal=met.change2(BEEfinal);





        met.print2(SEEfinal,"TIMETABLE OF SE");
        met.print2(TEEfinal,"TIMETABLE OF TE");
        met.print2(BEEfinal,"TIMETABLE OF BE");
        //matrix(SEEfinal,TEEfinal,BEEfinal);
        um.matrix(SEEfinal,TEEfinal,BEEfinal);







    }


     void upload()throws IOException, ExecutionException, InterruptedException{



         FileInputStream fileInputStream =new FileInputStream("./timetable.json");



         FirebaseOptions firebaseOptions= new FirebaseOptions.Builder().setCredentials(GoogleCredentials.fromStream(fileInputStream)).build();

         try{
             FirebaseApp.getInstance();
         }catch (IllegalStateException c){

             FirebaseApp.initializeApp(firebaseOptions);


         }

         //FirebaseApp.initializeApp(firebaseOptions);

         Firestore db = FirestoreClient.getFirestore();

        // String[] tak={"WQ","WQ","WQ","WQ","WQ","WQ","WQ","WQ"};

         ArrayList<String> num=new ArrayList<String>();
         ArrayList<String> num1=new ArrayList<String>();
         ArrayList<String> num2=new ArrayList<String>();
         ArrayList<String> num3=new ArrayList<String>();
         ArrayList<String> num4=new ArrayList<String>();
         Laraib um=new Laraib();



         ArrayList<String> SEmon = new ArrayList<String>();
         ArrayList<String> SEtue = new ArrayList<String>();
         ArrayList<String> SEwen = new ArrayList<String>();
         ArrayList<String> SEthur = new ArrayList<String>();
         ArrayList<String> SEfri = new ArrayList<String>();

         ArrayList<String> TEmon = new ArrayList<String>();
         ArrayList<String> TEtue = new ArrayList<String>();
         ArrayList<String> TEwen = new ArrayList<String>();
         ArrayList<String> TEthur = new ArrayList<String>();
         ArrayList<String> TEfri = new ArrayList<String>();

         ArrayList<String> BEmon = new ArrayList<String>();
         ArrayList<String> BEtue = new ArrayList<String>();
         ArrayList<String> BEwen = new ArrayList<String>();
         ArrayList<String> BEthur = new ArrayList<String>();
         ArrayList<String> BEfri = new ArrayList<String>();




         ArrayList<String> PSEmon; //= new ArrayList<String>();
         ArrayList<String> PSEtue ;//= new ArrayList<String>();
         ArrayList<String> PSEwen ;//= new ArrayList<String>();
         ArrayList<String> PSEthur;// = new ArrayList<String>();
         ArrayList<String> PSEfri;// = new ArrayList<String>();

         ArrayList<String> PTEmon = new ArrayList<String>();
         ArrayList<String> PTEtue = new ArrayList<String>();
         ArrayList<String> PTEwen = new ArrayList<String>();
         ArrayList<String> PTEthur = new ArrayList<String>();
         ArrayList<String> PTEfri = new ArrayList<String>();

         ArrayList<String> PBEmon = new ArrayList<String>();
         ArrayList<String> PBEtue = new ArrayList<String>();
         ArrayList<String> PBEwen = new ArrayList<String>();
         ArrayList<String> PBEthur = new ArrayList<String>();
         ArrayList<String> PBEfri = new ArrayList<String>();


         ArrayList<String> pmon,ptue,pwen,pthur,pfri,dmon,dtue,dwen,dthur,dfri,dmmon,dmtue,dmwen,dmthur,dmfri,smon,stue,swen,sthur,sfri,cmon,ctue,cwen,cthur,cfri
                 ,samon,satue,sawen,sathur,safri,gmon,gtue,gwen,gthur,gfri,demon,detue,dewen,dethur,defri,kmon,ktue,kwen,kthur,kfri,amon,atue,awen,athur,afri,
                 emon,etue,ewen,ethur,efri=






         SEmon =Array(um.SEE,8);
         SEtue= Array1(um.SEE,8);
         SEwen=Array2(um.SEE,8);
         SEthur= Array3(um.SEE,8);
         SEfri=Array4(um.SEE,8);

         TEmon =Array(um.TEE,8);
         TEtue= Array1(um.TEE,8);
         TEwen=Array2(um.TEE,8);
         TEthur= Array3(um.TEE,8);
         TEfri=Array4(um.TEE,8);

         BEmon =Array(um.BEE,8);
         BEtue= Array1(um.BEE,8);
         BEwen=Array2(um.BEE,8);
         BEthur= Array3(um.BEE,8);
         BEfri=Array4(um.BEE,8);


         PSEmon =Array(practical.PracSE,4);
         PSEtue= Array1(practical.PracSE,4);
         PSEwen=Array2(practical.PracSE,4);
         PSEthur= Array3(practical.PracSE,4);
         PSEfri=Array4(practical.PracSE,4);



         PTEmon =Array(practical.PracTE,4);

         PTEtue= Array1(practical.PracTE,4);
         PTEwen=Array2(practical.PracTE,4);
         PTEthur= Array3(practical.PracTE,4);
         PTEfri=Array4(practical.PracTE,4);

         PBEmon =Array(practical.PracBE,4);
         PBEtue= Array1(practical.PracBE,4);
         PBEwen=Array2(practical.PracBE,4);
         PBEthur= Array3(practical.PracBE,4);
         PBEfri=Array4(practical.PracBE,4);


         dmon =Array(proftimetable.changeto2,8);
         dtue= Array1(proftimetable.changeto2,8);
         dwen=Array2(proftimetable.changeto2,8);
         dthur= Array3(proftimetable.changeto2,8);
         dfri=Array4(proftimetable.changeto2,8);

         dmmon =Array(proftimetable.Prof1,8);
         dmtue= Array1(proftimetable.Prof1,8);
         dmwen=Array2(proftimetable.Prof1,8);
         dmthur= Array3(proftimetable.Prof1,8);
         dmfri=Array4(proftimetable.Prof1,8);



         pmon =Array(proftimetable.changeto,8);
         ptue= Array1(proftimetable.changeto,8);
         pwen=Array2(proftimetable.changeto,8);
         pthur= Array3(proftimetable.changeto,8);
         pfri=Array4(proftimetable.changeto,8);

         smon =Array(proftimetable.changeto3,8);
         stue= Array1(proftimetable.changeto3,8);
         swen=Array2(proftimetable.changeto3,8);
         sthur= Array3(proftimetable.changeto3,8);
         sfri=Array4(proftimetable.changeto3,8);

         samon =Array(proftimetable.changeto6,8);
         satue= Array1(proftimetable.changeto6,8);
         sawen=Array2(proftimetable.changeto6,8);
         sathur= Array3(proftimetable.changeto6,8);
         safri=Array4(proftimetable.changeto6,8);


         gmon =Array(proftimetable.changeto4,8);
         gtue= Array1(proftimetable.changeto4,8);
         gwen=Array2(proftimetable.changeto4,8);
         gthur= Array3(proftimetable.changeto4,8);
         gfri=Array4(proftimetable.changeto4,8);

         cmon =Array(proftimetable.changeto5,8);
         ctue= Array1(proftimetable.changeto5,8);
         cwen=Array2(proftimetable.changeto5,8);
         cthur= Array3(proftimetable.changeto5,8);
         cfri=Array4(proftimetable.changeto5,8);

         demon =Array(proftimetable.changeto7,8);
         detue= Array1(proftimetable.changeto7,8);
         dewen=Array2(proftimetable.changeto7,8);
         dethur= Array3(proftimetable.changeto7,8);
         defri=Array4(proftimetable.changeto7,8);

         kmon =Array(proftimetable.changeto8,8);
         ktue= Array1(proftimetable.changeto8,8);
         kwen=Array2(proftimetable.changeto8,8);
         kthur= Array3(proftimetable.changeto8,8);
         kfri=Array4(proftimetable.changeto8,8);

         amon =Array(proftimetable.changeto9,8);
         atue= Array1(proftimetable.changeto9,8);
         awen=Array2(proftimetable.changeto9,8);
         athur= Array3(proftimetable.changeto9,8);
         afri=Array4(proftimetable.changeto9,8);


         emon =Array(proftimetable.changeto10,8);
         etue= Array1(proftimetable.changeto10,8);
         ewen=Array2(proftimetable.changeto10,8);
         ethur= Array3(proftimetable.changeto10,8);
         efri=Array4(proftimetable.changeto10,8);






         SeTimetable seTimetablewen =new SeTimetable("SUBJECTS ",SEmon,SEtue
                 ,SEwen,SEthur,SEfri);
         SeTimetable TeTimetablewen =new SeTimetable("SUBJECTS ",TEmon,TEtue
                 ,TEwen,TEthur,TEfri);
         SeTimetable BeTimetablewen =new SeTimetable("SUBJECTS  ",BEmon,BEtue
                 ,BEwen,BEthur,BEfri);





         SeTimetable QseTimetablewen =new SeTimetable("PRACTICAL",PSEmon,PSEtue
                 ,PSEwen,PSEthur,PSEfri);
         SeTimetable QTeTimetablewen =new SeTimetable("PRACTICAL ",PTEmon,PTEtue
                 ,PTEwen,PTEthur,PTEfri);
         SeTimetable QBeTimetablewen =new SeTimetable("PRACTICAL  ",PBEmon,PBEtue
                 ,PBEwen,PBEthur,PBEfri);


         SeTimetable dmTimetablewen =new SeTimetable("DESHMUKH MAM",dmmon,dmtue
                 ,dmwen,dmthur,dmfri);
         SeTimetable dTimetablewen =new SeTimetable("DESHMUKH SIR",dmon,dtue
                 ,dwen,dthur,dfri);
         SeTimetable pTimetablewen =new SeTimetable("PARERA SIR",pmon,ptue
                 ,pwen,pthur,pfri);
         SeTimetable smTimetablewen =new SeTimetable("SNEHAL",smon,stue
                 ,swen,sthur,sfri);
         SeTimetable saTimetablewen =new SeTimetable("SURBE",samon,satue
                 ,sawen,sathur,safri);
         SeTimetable gTimetablewen =new SeTimetable("GHUMRAI",gmon,gtue
                 ,gwen,gthur,gfri);
         SeTimetable cTimetablewen =new SeTimetable("CN",cmon,ctue
                 ,cwen,cthur,cfri);
         SeTimetable deTimetablewen =new SeTimetable("DELD",demon,detue
                 ,dewen,dethur,defri);
         SeTimetable kTimetablewen =new SeTimetable("KANCHAN",kmon,ktue
                 ,kwen,kthur,kfri);
         SeTimetable aTimetablewen =new SeTimetable("AIR-P",amon,atue
                 ,awen,athur,afri);
         SeTimetable eTimetablewen =new SeTimetable("EL-P",emon,etue
                 ,ewen,ethur,efri);






         ApiFuture<WriteResult> future3 = db.collection("SE_Timetable").document(seTimetablewen.getClassName()).set(seTimetablewen);
         ApiFuture<WriteResult> future4 = db.collection("TE_Timetable").document(TeTimetablewen.getClassName()).set(TeTimetablewen);
         ApiFuture<WriteResult> future5 = db.collection("BE_Timetable").document(BeTimetablewen.getClassName()).set(BeTimetablewen);




         ApiFuture<WriteResult> future9 = db.collection("SE_Timetable").document(QseTimetablewen.getClassName()).set(QseTimetablewen);
         ApiFuture<WriteResult> future11 = db.collection("TE_Timetable").document(QTeTimetablewen.getClassName()).set(QTeTimetablewen);
         ApiFuture<WriteResult> future12 = db.collection("BE_Timetable").document(QBeTimetablewen.getClassName()).set(QBeTimetablewen);

         ApiFuture<WriteResult> future13 = db.collection("PROFESSOR").document(dmTimetablewen.getClassName()).set(dmTimetablewen);
         ApiFuture<WriteResult> future14 = db.collection("PROFESSOR").document(dTimetablewen.getClassName()).set(dTimetablewen);
         ApiFuture<WriteResult> future15 = db.collection("PROFESSOR").document(pTimetablewen.getClassName()).set(pTimetablewen);
         ApiFuture<WriteResult> future16 = db.collection("PROFESSOR").document(smTimetablewen.getClassName()).set(smTimetablewen);
         ApiFuture<WriteResult> future17 = db.collection("PROFESSOR").document(saTimetablewen.getClassName()).set(saTimetablewen);
         ApiFuture<WriteResult> future18 = db.collection("PROFESSOR").document(gTimetablewen.getClassName()).set(gTimetablewen);
         ApiFuture<WriteResult> future19 = db.collection("PROFESSOR").document(cTimetablewen.getClassName()).set(cTimetablewen);
         ApiFuture<WriteResult> future20 = db.collection("PROFESSOR").document(deTimetablewen.getClassName()).set(deTimetablewen);
         ApiFuture<WriteResult> future21 = db.collection("PROFESSOR").document(kTimetablewen.getClassName()).set(kTimetablewen);
         ApiFuture<WriteResult> future22 = db.collection("PROFESSOR").document(aTimetablewen.getClassName()).set(aTimetablewen);
         ApiFuture<WriteResult> future23 = db.collection("PROFESSOR").document(eTimetablewen.getClassName()).set(eTimetablewen);


         future3.get();
         future4.get();
         future5.get();

         future9.get();
         future11.get();
         future12.get();
         future13.get();
         future14.get();
         future15.get();
         future16.get();
         future17.get();
         future18.get();
         future19.get();
         future20.get();
         future21.get();
         future22.get();
         future23.get();

         System.out.println("Succsessfully updated   " +  future3.get().getUpdateTime());



     }


   // ArrayList<String> num1 = new ArrayList<String>();
  //  ArrayList<String> num2 = new ArrayList<String>();
  //  ArrayList<String> num3 = new ArrayList<String>();
   // ArrayList<String> num4 = new ArrayList<String>();
    //Laraib um = new Laraib();
     public ArrayList<String> Array(String[][] qw,int n) {
         ArrayList<String> num = new ArrayList<String>();
         for (int i = 0; i < n; i++) {

             num.add(qw[0][i]);


         }
         return num;
     }
         public ArrayList<String> Array1(String[][] qw,int n){
             ArrayList<String> num1 = new ArrayList<String>();
             for (int i = 0; i < n; i++) {


                 num1.add(qw[1][i]);

             }
             return num1;
         }
             public ArrayList<String> Array2(String[][] qw,int n){
                 ArrayList<String> num2 = new ArrayList<String>();

             for (int i = 0; i < n; i++) {


                 num2.add(qw[2][i]);


             }
                 return num2;
         }

         public ArrayList<String> Array3(String[][] qw,int n){
             ArrayList<String> num3 = new ArrayList<String>();
         for(int i=0;i<n;i++) {


             num3.add(qw[3][i]);
             ;
         }
             return num3;
         }

         public ArrayList<String> Array4(String[][] qw,int n) {
             ArrayList<String> num4 = new ArrayList<String>();
             for (int i = 0; i < n; i++) {


                 num4.add(qw[4][i]);


             }
             return num4;
         }






}
