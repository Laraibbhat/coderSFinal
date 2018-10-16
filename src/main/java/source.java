/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author laraib
 */
public  class source {

    //public static    String[] subject={"DBMS","TOC","ISEE","SEPM","CN","SDl tut(1)","SDl tut(2)","Free"};
    String[] subject={"DBMS   ","TOC    ","ISEE   ","SEPM   ","CN     ","SDl(1) ","SDl(2) ","Free   "};
    String[] subjectBE={"AIR","DA","EL-1","EL-2","HPC","FREE"};
    String[] subjectSE={"DM","DELD","COA","DSA","OOP","FREE"};
    String[][] love=new String[5][8];
    String[][] love1=new String[5][8];
    String[][] love2=new String[5][8];
    String[] Days={"MONDAY","Tuesday","Wensday","Thurs","Friday"};
    // String SEQ[][]=new String[5][8];



    String[][] tre(String[][] SE){

        for (int i = 0, l = 0; i < 5&&l<5; i++, l++){

            for(int j = 0,k=0;j<8 && k<5;j++,k++){


              /*  if(j==0){
                System.out.println(k);
                love[i][j]=Days[i];
               // k--;
                System.out.println(k);
                }*/




                if(j==3){

                    love[i][j]="BREAK  ";
                    k--;

                } else         if(j==4||j==5){

                    love[i][j]="Prac   ";
                    k--;



                }
                else{


                    love[i][j]=SE[l][k];


                }
            }




        }


        return love;
    }

    String[][] tre1(String[][] TE){

        for (int i = 0, l = 0; i < 5&&l<5; i++, l++){

            for(int j = 0,k=0;j<8 && k<7;j++,k++){

                if(j==3){

                    love1[i][j]="BREAK";
                    k--;

                } else         if(j==6||j==7){

                    love1[i][j]="Prac   ";
                    k--;



                }
                else{


                    love1[i][j]=TE[l][k];


                }
            }




        }


        return love1;
    }



    String[][] tre2(String[][] TE){

        for (int i = 0, l = 0; i < 5&&l<5; i++, l++){

            for(int j = 0,k=0;j<8 && k<7;j++,k++){


                if(j==3){

                    love2[i][j]="BREAK  ";
                    k--;

                } else         if(j==1||j==2){

                    love2[i][j]="prac   ";
                    k--;


                }
                else{


                    love2[i][j]=TE[l][k];


                }





            }




        }





        return love2;
    }




}







