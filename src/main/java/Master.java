/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laraib
 */
public class Master extends javax.swing.JFrame {


     String[][] SEESUBJ=new String[5][5];
     String[][] TEESUBJ=new String[5][5];
     String[][] BEESUBJ=new String[5][5];

    String[][] SEnewFinalSUB=new String[5][5];
    String[][] TEnewFinalSUB=new String[5][5];
    String[][] BEnewFinalSUB=new String[5][5];



    String[][] shufflesSEprof=new String[5][5];
    String[][] shufflesTEprof=new String[5][5];
    String[][] shufflesBEprof=new String[5][5];

    String[][] ST=new String[5][8];
    String[][] TT=new String[5][8];
    String[][] BT=new String[5][8];

    String[][] changedFinalSE=new String[5][8];
    String[][] changedFinalTE=new String[5][8];
    String[][] changedFinalBE=new String[5][8];

    String[][] newSEESUBJ=new String[5][5];
    String[][] newBEESUBJ=new String[5][5];


     methods met=new methods();
     collision co=new collision();
     collisionRemoval cor=new collisionRemoval();
     source su=new source();
     newTime ne=new newTime();
    newTIMETablemethods newT=new newTIMETablemethods();


    ArrayList<SeTimetable> retrievedSEsubjects=new ArrayList<>();
    ArrayList<SeTimetable> retrievedTEsubjects=new ArrayList<>();
    ArrayList<SeTimetable> retrievedBEsubjects=new ArrayList<>();

    /**
     * Creates new form Master
     */
    public Master(String[][] SE,String[][] TE,String[][] BE) {
        initComponents();

        Laraib um=new Laraib();
        String column[]={"10:15","11:15","12:15","1.15","1:45","2.45","3.45","4.45"};
        String batchTE[]={"T1","T2","T3","T4"};
        String batchSE[]={"S1","S2","S3","S4"};
        String batchBE[]={"B1","B2","B3","B4"};

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        DefaultTableModel model=new  DefaultTableModel(SE,column);
        tableMaster1.setModel(model);
        tableMaster1.setFillsViewportHeight(true);
        tableMaster1.setOpaque(true);
        tableMaster1.setShowGrid(false);
        tableMaster1.setRowHeight(40);
        // jTable1.setBackground(Color.WHITE);
        tableMaster1.setFont(new Font("serif",Font.BOLD,15));
        // jTable1.setFont("serif");
        tableMaster1.setForeground(Color.BLACK);


        DefaultTableModel model1=new  DefaultTableModel(TE,column);
        tablemaster2.setModel(model1);
        tablemaster2.setFillsViewportHeight(true);
        tablemaster2.setOpaque(true);
        tablemaster2.setShowGrid(false);
        tablemaster2.setRowHeight(40);
        // jTable1.setBackground(Color.WHITE);
        tablemaster2.setFont(new Font("serif",Font.BOLD,15));
        // jTable1.setFont("serif");
        tablemaster2.setForeground(Color.BLACK);


        DefaultTableModel model2=new  DefaultTableModel(BE,column);
        tablemaster3.setModel(model2);
        tablemaster3.setFillsViewportHeight(true);
        tablemaster3.setOpaque(true);
        tablemaster3.setShowGrid(false);
        tablemaster3.setRowHeight(40);
        // jTable1.setBackground(Color.WHITE);
        tablemaster3.setFont(new Font("serif",Font.BOLD,15));
        // jTable1.setFont("serif");
        tablemaster3.setForeground(Color.BLACK);


        DefaultTableModel model3=new  DefaultTableModel(practical.PracSE,batchSE);
        tableMaster11.setModel(model3);
        tableMaster11.setFillsViewportHeight(true);
        tableMaster11.setOpaque(true);
        tableMaster11.setShowGrid(false);
        tableMaster11.setRowHeight(40);
        // jTable1.setBackground(Color.WHITE);
        tableMaster11.setFont(new Font("serif",Font.BOLD,15));
        // jTable1.setFont("serif");
        tableMaster11.setForeground(Color.BLACK);


        DefaultTableModel model4=new  DefaultTableModel(practical.PracTE,batchTE);
        tablemaster22.setModel(model4);
        tablemaster22.setFillsViewportHeight(true);
        tablemaster22.setOpaque(true);
        tablemaster22.setShowGrid(false);
        tablemaster22.setRowHeight(40);
        // jTable1.setBackground(Color.WHITE);
        tablemaster22.setFont(new Font("serif",Font.BOLD,15));
        // jTable1.setFont("serif");
        tablemaster22.setForeground(Color.BLACK);


        DefaultTableModel model5=new  DefaultTableModel(practical.PracBE,batchBE);
        tablemaster33.setModel(model5);
        tablemaster33.setFillsViewportHeight(true);
        tablemaster33.setOpaque(true);
        tablemaster33.setShowGrid(false);
        tablemaster33.setRowHeight(40);
        // jTable1.setBackground(Color.WHITE);
        tablemaster33.setFont(new Font("serif",Font.BOLD,15));
        // jTable1.setFont("serif");
        tablemaster33.setForeground(Color.BLACK);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableMaster1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMaster11 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablemaster2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablemaster3 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablemaster33 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablemaster22 = new javax.swing.JTable();
        btnHodGen = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hodmenBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        uploadbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Master Timetable");
        setAutoRequestFocus(false);

        tableMaster1.setBackground(new java.awt.Color(215, 231, 144));
        tableMaster1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 17, 43), 1, true));
        tableMaster1.setForeground(new java.awt.Color(246, 5, 5));
        tableMaster1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        jScrollPane1.setViewportView(tableMaster1);

        tableMaster11.setBackground(new java.awt.Color(215, 231, 144));
        tableMaster11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 2, 2), 1, true));
        tableMaster11.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        jScrollPane2.setViewportView(tableMaster11);

        tablemaster2.setBackground(new java.awt.Color(215, 231, 144));
        tablemaster2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 11, 11), 1, true));
        tablemaster2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        jScrollPane3.setViewportView(tablemaster2);

        tablemaster3.setBackground(new java.awt.Color(215, 231, 144));
        tablemaster3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(247, 4, 4), 1, true));
        tablemaster3.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        jScrollPane5.setViewportView(tablemaster3);

        tablemaster33.setBackground(new java.awt.Color(215, 231, 144));
        tablemaster33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 9, 9), 1, true));
        tablemaster33.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        jScrollPane6.setViewportView(tablemaster33);

        tablemaster22.setBackground(new java.awt.Color(215, 231, 144));
        tablemaster22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(244, 7, 7), 1, true));
        tablemaster22.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        jScrollPane7.setViewportView(tablemaster22);

        btnHodGen.setFont(new java.awt.Font("URW Palladio L", 0, 15)); // NOI18N
        btnHodGen.setText("GENERATE");
        btnHodGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnHodGenActionPerformed(evt);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        jLabel1.setFont(new java.awt.Font("URW Chancery L", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 121, 152));
        jLabel1.setText("SE TIMETABLE");

        jLabel2.setFont(new java.awt.Font("URW Chancery L", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(47, 121, 147));
        jLabel2.setText("SE PRACTICAL TIMETABLE");

        hodmenBtn.setText("MENU");
        hodmenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hodmenBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("URW Chancery L", 2, 24)); // NOI18N
        jLabel3.setText("TE TIMETABLE");

        jLabel4.setFont(new java.awt.Font("URW Chancery L", 3, 24)); // NOI18N
        jLabel4.setText("TE PRACTICAL TIMETABLE");

        jLabel5.setFont(new java.awt.Font("URW Chancery L", 3, 24)); // NOI18N
        jLabel5.setText("BE TIMETABLE");

        jLabel6.setFont(new java.awt.Font("URW Chancery L", 3, 24)); // NOI18N
        jLabel6.setText("BE TPRACTICLA  TIMETABLE");

        jLabel7.setFont(new java.awt.Font("URW Chancery L", 3, 36)); // NOI18N
        jLabel7.setText("MASTER TIMETABLE");

        uploadbtn.setText("UPLOAD");
        uploadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(518, 518, 518)
                                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(uploadbtn)
                                .addGap(262, 262, 262)
                                .addComponent(hodmenBtn)
                                .addGap(165, 165, 165)
                                .addComponent(btnHodGen, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(568, 568, 568))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(181, 181, 181))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(769, 769, 769)
                                .addComponent(jLabel7)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnHodGen)
                                        .addComponent(hodmenBtn)
                                        .addComponent(uploadbtn))
                                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>

    private void btnHodGenActionPerformed(java.awt.event.ActionEvent evt) throws InterruptedException, ExecutionException, IOException {
        // TODO add your handling code here:
        Laraib um=new Laraib();
        um.gen();
        newTime newTime=new newTime();


        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<QuerySnapshot> future1 =db.collection("BE5_Timetable").get();

        List<QueryDocumentSnapshot> documents=future1.get().getDocuments();
        for(QueryDocumentSnapshot document:documents){
            retrievedBEsubjects.add(document.toObject(SeTimetable.class));

            System.out.println(document.getId());
        }
        BEESUBJ=newTIMETablemethods.arraylisttostring5(retrievedBEsubjects);


       // System.out.println("#############################!!!!!!!!!!!!!!!!!!!!!!!!!###########################");

        ApiFuture<QuerySnapshot> future2 =db.collection("TE5_Timetable").get();

        List<QueryDocumentSnapshot> documentsT=future2.get().getDocuments();
        for(QueryDocumentSnapshot document:documentsT){
            retrievedTEsubjects.add(document.toObject(SeTimetable.class));

            System.out.println(document.getId());
        }
        TEESUBJ=newTIMETablemethods.arraylisttostring5(retrievedTEsubjects);


       // System.out.println("#############################!!!!!!!!!!!!!!!!!!!!!!!!!###########################");
       // System.out.println("#############################!!!!!!!!!!!!!!!!!!!!!!!!!###########################");

        ApiFuture<QuerySnapshot> future3 =db.collection("SE5_Timetable").get();

        List<QueryDocumentSnapshot> documentsS=future3.get().getDocuments();
        for(QueryDocumentSnapshot document:documentsS){
            retrievedSEsubjects.add(document.toObject(SeTimetable.class));

            System.out.println(document.getId());
        }
        SEESUBJ=newTIMETablemethods.arraylisttostring5(retrievedSEsubjects);


      //  System.out.println("#############################!!!!!!!!!!!!!!!!!!!!!!!!!###########################");


       // newT.printmenu(SEESUBJ);

        shufflesSEprof=met.shift(SEESUBJ,0);
        shufflesTEprof=met.shift(TEESUBJ,0);
        shufflesBEprof=met.shift(BEESUBJ,0);

       // newT.printmenu(shufflesSEprof);
       // newT.printmenu(shufflesTEprof);
       // newT.printmenu(shufflesBEprof);

       // System.out.println("ASD2222222222222222222222222222222222222222222222");
        newBEESUBJ=cor.colli(TEESUBJ,BEESUBJ);

        newSEESUBJ=cor.colli2(newBEESUBJ,SEESUBJ,TEESUBJ);
        ne.retrievedSub();
       // System.out.println("BEForeASD2222222222222222222222222222222222222222222222\t"+ne.retrievedSEproff.size());
      //  for (int i = 0; i < ne.retrievedSEproff.size(); i++) {
         //   System.out.println("ASD222222222hfjfjfgjfghf44444444444444442222222222222222222222222222222222222");
         //   if (ne.retrievedSEproff.get(i).containsKey(ne.retrievedSEsub.get(i))) {
           //     System.out.println(ne.retrievedSEproff.get(i).get(ne.retrievedSEsub.get(i)) + "####################################");
          //  }

      //  }
        System.out.println("AFTERASD2222222222222222222222222222222222222222222222");
       // ne.retrievedSub();
        SEnewFinalSUB = newT.mapprofSEtosub(ne.retrievedSEproff, newSEESUBJ);
        TEnewFinalSUB = newT.mapprofTEtosub(ne.retrievedTEproff, shufflesTEprof);
        BEnewFinalSUB = newT.mapprofBEtosub(ne.retrievedBEproff, newBEESUBJ);

        //newT.printmenu(SEnewFinalSUB);
       // newT.printmenu(TEnewFinalSUB);
       // newT.printmenu(BEnewFinalSUB);


        ST=su.tre(SEnewFinalSUB);
        TT=su.tre1(TEnewFinalSUB);
        BT=su.tre2(BEnewFinalSUB);

        //ST=su.tre(newSEESUBJ);
       // TT=su.tre1(TEESUBJ);
       // BT=su.tre2(newBEESUBJ);

        changedFinalSE=met.change(ST);
        changedFinalTE=met.change(TT);
        changedFinalBE=met.change(BT);

        changedFinalSE=met.change1(changedFinalSE);
        changedFinalTE=met.change1(changedFinalTE);
        changedFinalBE=met.change1(changedFinalBE);

        changedFinalSE=met.change2(changedFinalSE);
        changedFinalTE=met.change2(changedFinalTE);
        changedFinalBE=met.change2(changedFinalBE);

        met.print2(changedFinalSE,"TIMETABLE OF SE  in new TIME");
        met.print2(changedFinalTE,"TIMETABLE OF TE in new TIME");
       met.print2(changedFinalBE,"TIMETABLE OF BE in new TIME");
       // um.upload(MENU.SEESUBJECTS,MENU.TEESUBJECTS,MENU.BEESUBJECTS);
       newT.upload(changedFinalSE,changedFinalTE,changedFinalBE);




       // newTime.newtimeMenuActionPerformed();
        //newTime.gennewTime();
       // practical pa=new practical();
       // pa.shuffling();
        MENU me=new MENU();
        me.setVisible(true);
        //this.setVisible(false); //this will close frame i.e. NewJFrame
       // this.invalidate();
       // this.validate();
        //this.repaint();
        //this.setVisible(true);

       // MENU me=new MENU();
       // me.setVisible(true);
        this.dispose();



    }

    private void hodmenBtnActionPerformed(java.awt.event.ActionEvent evt) {
        MENU me=new MENU();
        me.setVisible(true);
        this.dispose();
    }

    private void uploadbtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        newTIMETablemethods newT=new newTIMETablemethods();
        try {
           // um.upload();
            newT.upload(changedFinalSE,changedFinalTE,changedFinalBE);
            MENU me=new MENU();
            me.setVisible(true);
            this.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Master().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnHodGen;
    private javax.swing.JButton hodmenBtn;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tableMaster1;
    private javax.swing.JTable tableMaster11;
    private javax.swing.JTable tablemaster2;
    private javax.swing.JTable tablemaster22;
    private javax.swing.JTable tablemaster3;
    private javax.swing.JTable tablemaster33;
    private javax.swing.JButton uploadbtn;
    // End of variables declaration
}
