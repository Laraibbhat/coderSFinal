/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class collision {
    String[][] proffTE=new String[5][5];
    String[][] proffSE=new String[5][5];
    String[][] proffBE=new String[5][5];




    String[][] proff_TE(String[][] love){

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                //System.out.println("in the prof TE\t"+love[i][j]);
                if(love[i][j]=="DBMS   "){

                    proffTE[i][j]="Snehal";
                    // System.out.println(" snehal\t"+profTE[i][j]);

                }else if (love[i][j]=="TOC    "||love[i][j]=="SDl(2) "){

                    proffTE[i][j]="Pareara";

                }else if (love[i][j]=="ISEE   "){

                    proffTE[i][j]="DESHMUKH";

                }else if (love[i][j]=="SEPM   "){

                    proffTE[i][j]="GHUMRAI";

                }else if (love[i][j]=="CN     "){

                    proffTE[i][j]="legend";

                }else if (love[i][j]=="SDl(1) "){

                    proffTE[i][j]="TANNU";

                }else if (love[i][j]=="Free   "){

                    proffTE[i][j]="ENJOY";

                }

            }

        }

        return proffTE;
    }


    String[][] proff_SE(String[][] love1){

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                //System.out.println("in the prof E\t"+love1[i][j]);
                if(love1[i][j]=="DM"){

                    proffSE[i][j]="SURBHI";
                    //  System.out.println(" snehal\t"+profTE[i][j]);

                }else if (love1[i][j]=="DELD"){

                    proffSE[i][j]="DELD-p";

                }else if (love1[i][j]=="COA"){

                    proffSE[i][j]="Pareara";

                }else if (love1[i][j]=="DSA"){

                    proffSE[i][j]="DESHMUKH-M";

                }else if (love1[i][j]=="OOP"){

                    proffSE[i][j]="KANCHAN";

                }else if (love1[i][j]=="FREE"){

                    proffSE[i][j]="ENJOY-S";

                }

            }

        }

        return proffSE;
    }





    String[][] proff_BE(String[][] love1){

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(love1[i][j]=="AIR"){

                    proffBE[i][j]="AIR-p";

                }else if (love1[i][j]=="DA"){

                    proffBE[i][j]="DESHMUKH-M";

                }else if (love1[i][j]=="EL-1"){

                    proffBE[i][j]="DESHMUKH";

                }else if (love1[i][j]=="EL-2"){

                    proffBE[i][j]="El-2-p";

                }else if (love1[i][j]=="HPC"){

                    proffBE[i][j]="Pareara";

                }else if (love1[i][j]=="FREE"){

                    proffBE[i][j]="ENJOY-BE";

                }



            }


        }

        return proffBE;
    }





}


