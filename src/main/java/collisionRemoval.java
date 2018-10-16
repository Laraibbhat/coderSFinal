/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import  umeed.collision.proffBE
//import  umeed.collision.proffSE;
//import  umeed.collision.proffTE;

public class collisionRemoval {
    String[][] colu=new String[5][5];
    String[][] colu1=new String[5][5];
    String[][] newproffBE=new String[5][5];
    String[][] newproffSE=new String[5][5];
    String[][] finalSE=new String[5][5];
    String[][] finalTE=new String[5][5];
    String[][] finalBE=new String[5][5];
    static int flag=0;

    methods met=new methods();

    public  String[][] colli(String[][] proffTE,String[][] newproffBE){
        //System.out.println("CHECKPOINT 1");
        // methods.print(proffBE," \n\n\ncolli shiftZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ\n");

        for(int i=0;i<5;i++){
            //System.out.println("CHECKPOINT 2");
            for(int j=0;j<5;j++){
                //System.out.println("CHECKPOINT 3");

                if(proffTE[i][j]==newproffBE[i][j]){


                    // colu[i][j]="ColliSion";
                    flag=1;
                    // System.out.println("CHECKPOINT 4");

                }

                //else
                //    colu[i][j]=proffBE[i][j];
                //System.out.println("CHECKPOINT 5");

            }

        }

        if(flag==1){
            //System.out.println("\n\nCHECKPOINT 6\n\n");
            //  methods.print(newproffBE,"\n\n\n\n BEfore shift\n");
            newproffBE =met.shift(newproffBE,4);
            // met.print4(newproffBE,"After Shift in \n");
            flag=0;
            colli(proffTE,newproffBE);

        }



        return newproffBE;
    }


    public  String[][] colli2(String[][] proffBE,String[][] newproffSE,String[][] TE){
        int flag=0;

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){

                if(proffBE[i][j]==newproffSE[i][j]||TE[i][j]==newproffSE[i][j]){

                    flag=1;

                }

            }

        }

        if(flag==1){

            newproffSE =met.shift(newproffSE,2);

            flag=0;
            colli2(proffBE,newproffSE,TE);

        }

        return newproffSE;
    }


    String[][] proff_TE_sub(String[][] love){

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){

                if(love[i][j]=="Snehal"){

                    finalTE[i][j]="DBMS   ";


                }else if (love[i][j]=="Pareara"){

                    finalTE[i][j]="TOC    ";

                }else if (love[i][j]=="DESHMUKH"){

                    finalTE[i][j]="ISEE   ";

                }else if (love[i][j]=="GHUMRAI"){

                    finalTE[i][j]="SEPM   ";

                }else if (love[i][j]=="legend"){

                    finalTE[i][j]="CN     ";

                }else if (love[i][j]=="TANNU"){

                    finalTE[i][j]="SDl(1) ";

                }else if (love[i][j]=="ENJOY"){

                    finalTE[i][j]="Free   ";

                }

            }


        }

        return finalTE;
    }




    String[][] proff_SE_sub(String[][] love1){

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(love1[i][j]=="SURBHI"){

                    finalSE[i][j]="DM     ";
                }else if (love1[i][j]=="DELD-p"){

                    finalSE[i][j]="DELD   ";

                }else if (love1[i][j]=="Pareara"){

                    finalSE[i][j]="COA    ";

                }else if (love1[i][j]=="DESHMUKH-M"){

                    finalSE[i][j]="DSA    ";

                }else if (love1[i][j]=="KANCHAN"){

                    finalSE[i][j]="OOP   ";

                }else if (love1[i][j]=="ENJOY-S"){

                    finalSE[i][j]="FREE   ";

                }

            }


        }

        return finalSE;
    }



    String[][] proff_BE_sub(String[][] love1){

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){

                if(love1[i][j]=="AIR-p"){

                    finalBE[i][j]="AIR    ";


                }else if (love1[i][j]=="DESHMUKH-M"){

                    finalBE[i][j]="DA     ";

                }else if (love1[i][j]=="DESHMUKH"){

                    finalBE[i][j]="EL-1   ";

                }else if (love1[i][j]=="El-2-p"){

                    finalBE[i][j]="El-2   ";

                }else if (love1[i][j]=="Pareara"){

                    finalBE[i][j]="HPC    ";

                }else if (love1[i][j]=="ENJOY-BE"){

                    finalBE[i][j]="FREE   ";

                }

            }


        }

        return finalBE;
    }


}

