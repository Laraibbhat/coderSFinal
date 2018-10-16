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


    public static void main(String[] args){// throws InterruptedException, ExecutionException, IOException {






        Laraib um=new Laraib();

        methods met=new methods();
        collision co=new collision();
        collisionRemoval cor=new collisionRemoval();
        source su=new source();
        um.gen();
       // um.upload();
        practical prac=new practical();
        prac.assignprac();
     //   for (int i = 0; i < 5; i++) {
      //      for (int j = 0; j < 4; j++) {
     //           System.out.print("############################################"+practical.PracTE[i][j] + " \t"+" \t");
       //     }
       //     System.out.println();
      //  }
        Splash fa=new Splash();
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




        }



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


        SEEfinal=su.tre(SEfinal);
        TEEfinal=su.tre1(met.assign);
        BEEfinal=su.tre2(BEfinal);

      /*  ST=su.tre(SEfinal);
        TT=su.tre1(met.assign);
        BT=su.tre2(BEfinal);

        SEEfinal=met.change(ST);
        TEEfinal=met.change(TT);
        BEEfinal=met.change(BT);

        SEEfinal=met.change1(SEEfinal);
        SEEfinal=met.change1(SEEfinal);
        SEEfinal=met.change1(SEEfinal);

        SEEfinal=met.change2(SEEfinal);
        SEEfinal=met.change2(SEEfinal);
        SEEfinal=met.change2(SEEfinal);*/



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

       /*  for(int i=0;i<8;i++){


             num.add(um.SEE[0][i]);


         }
         for(int i=0;i<8;i++){


             num1.add(um.SEE[1][i]);


         }
         for(int i=0;i<8;i++){


             num2.add(um.SEE[2][i]);


         }
         for(int i=0;i<8;i++){


             num3.add(um.SEE[3][i]);


         }
         for(int i=0;i<8;i++){


             num4.add(um.SEE[4][i]);


         }*/

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




         ArrayList<String> PSEmon = new ArrayList<String>();
         ArrayList<String> PSEtue = new ArrayList<String>();
         ArrayList<String> PSEwen = new ArrayList<String>();
         ArrayList<String> PSEthur = new ArrayList<String>();
         ArrayList<String> PSEfri = new ArrayList<String>();

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





        // SeTimetable seTimetable =new SeTimetable("SE Comp ",new ArrayList<String>(Arrays.asList("COA","DSA","DELD","OOPS")),new ArrayList<String>(Arrays.asList("DSAL","DELDL","OOPL"))
                // ,new ArrayList<String>(Arrays.asList("COA","DSA","DELD","OOPS")),new ArrayList<String>(Arrays.asList("COA","DSA","DELD","OOPS")),SEfri);
         //SeTimetable seTimetableMon =new SeTimetable("Mon ",new ArrayList<String>(Arrays.asList("COA","DSA","DELD","OOPS")),new ArrayList<String>(Arrays.asList("DSAL","DELDL","OOPL"))
                 //,new ArrayList<String>(Arrays.asList("COA","DSA","DELD","OOPS")),new ArrayList<String>(Arrays.asList("COA","DSA","DELD","OOPS")),SEfri);

         //SeTimetable seTimetabletue =new SeTimetable("SUBJECTS ",new ArrayList<String>(Arrays.asList("COA","DSA","DELD","OOPS")),new ArrayList<String>(Arrays.asList("DSAL","DELDL","OOPL"))
                 //,new ArrayList<String>(Arrays.asList("COA","DSA","DELD","OOPS")),new ArrayList<String>(Arrays.asList("COA","DSA","DELD","OOPS")),SEfri);

         SeTimetable seTimetablewen =new SeTimetable("SUBJECTS ",SEmon,SEtue
                 ,SEwen,SEthur,SEfri);
         SeTimetable TeTimetablewen =new SeTimetable("SUBJECTS ",TEmon,TEtue
                 ,TEwen,TEthur,TEfri);
         SeTimetable BeTimetablewen =new SeTimetable("SUBJECTS  ",BEmon,BEtue
                 ,BEwen,BEthur,BEfri);

         SeTimetable PseTimetablewen =new SeTimetable("SUBJECTS   ",SEmon,SEtue
                 ,SEwen,SEthur,SEfri);
         SeTimetable PTeTimetablewen =new SeTimetable("SUBJECTS   ",TEmon,TEtue
                 ,TEwen,TEthur,TEfri);
         SeTimetable PBeTimetablewen =new SeTimetable("SUBJECTS   ",BEmon,BEtue
                 ,BEwen,BEthur,BEfri);


        // ApiFuture<WriteResult> future = db.collection("SE_Timetable").document(seTimetable.getClassName()).set(seTimetable);
        // ApiFuture<WriteResult> future1 = db.collection("SE_Timetable").document(seTimetableMon.getClassName()).set(seTimetableMon);
        // ApiFuture<WriteResult> future2 = db.collection("SE_Timetable").document(seTimetabletue.getClassName()).set(seTimetabletue);
         ApiFuture<WriteResult> future3 = db.collection("SE_Timetable").document(seTimetablewen.getClassName()).set(seTimetablewen);
         ApiFuture<WriteResult> future4 = db.collection("TE_Timetable").document(TeTimetablewen.getClassName()).set(TeTimetablewen);
         ApiFuture<WriteResult> future5 = db.collection("BE_Timetable").document(BeTimetablewen.getClassName()).set(BeTimetablewen);

         ApiFuture<WriteResult> future6 = db.collection("SE_Timetable").document(PseTimetablewen.getClassName()).set(PseTimetablewen);
         ApiFuture<WriteResult> future7 = db.collection("TE_Timetable").document(PTeTimetablewen.getClassName()).set(PTeTimetablewen);
         ApiFuture<WriteResult> future8 = db.collection("BE_Timetable").document(PBeTimetablewen.getClassName()).set(PBeTimetablewen);
        // future.get();
         //future1.get();
         //future2.get();
         future3.get();
         future4.get();
         future5.get();
         future6.get();
         future7.get();
         future8.get();




         System.out.println("Succsessfully updated   " +  future3.get().getUpdateTime());
        // System.out.println("Succsessfully updated   " +  future4.get().getUpdateTime());
        // System.out.println("Succsessfully updated   " +  future5.get().getUpdateTime());
        // System.out.println("Succsessfully updated   " +  future6.get().getUpdateTime());
        // System.out.println("Succsessfully updated   " +  future7.get().getUpdateTime());
        // System.out.println("Succsessfully updated   " +  future8.get().getUpdateTime());
        // System.out.println("Succsessfully updated   " +  future3.get().getUpdateTime());








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
