/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;

public class methods {


    String[][] assignSE =new String[5][5];
    String[][] assign =new String[5][5];
    String[][] assignBE =new String[5][5];


    source su=new source();
    String[][] assignTE(){

        int k=3;int q=3;
        int l=0;int w=3;
        int t=3;int r=3;
        int qw=3;int y=3;

        for(int i=0;i<5;i++){

            for(int j=0;j<5;j++){

                while(k>0){

                    assign[i][j]=su.subject[l];
                    k--;
                    break;
                }
                if(k==0 ){
                    if(su.subject[l+1]=="CN     "&& y!=0){
                        k=4;
                        l++;
                        y=0;
                        continue;
                    }


                    if(su.subject[l+1]=="SDl(1) "&& r!=0){
                        k=1;
                        l++;
                        r=0;
                        continue;
                    }
                    if(su.subject[l+1]=="SDl(2) "&& w!=0){
                        k=1;
                        l++;
                        w=0;
                        continue;
                    }
                    if(su.subject[l+1]=="Free   "&& q!=0){
                        k=8;
                        l++;
                        q=0;
                        continue;

                    }
                    k=3;
                    l++;
                }
            }

        }

        return assign;

    }

    String[][] assignBE(){
        int k=3;int q=3;
        int l=0;int w=3;
        int t=3;int r=3;
        int qw=3;int y=3;
        int m=3;

        for(int i=0;i<5;i++){

            for(int j=0;j<5;j++){
                //System.out.println("i\t"+i+j+"\t" +source.subjectBE[l]);

                while(k>0){
                    assignBE[i][j]=su.subjectBE[l];
                    k--;
                    break;

                }
                if(k==0 ){
                    if(su.subjectBE[l+1]=="HPC"&& y!=0){
                        k=4;
                        l++;
                        y=0;
                        continue;

                    }


                    if(su.subjectBE[l+1]=="FREE"&& q!=0){
                        // System.out.println("IN THE ---------ly------- menu\tk=15");
                        k=10;
                        l++;
                        q=0;
                        continue;

                    }
                    k=3;
                    l++;
                }
            }

        }
        return assignBE;

    }



    String[][] assignSE(){
        int k=4;int q=3;
        int l=0;int w=3;
        int t=3;int r=3;
        int qw=3;int y=3;
        int m=3;

        for(int i=0;i<5;i++){

            for(int j=0;j<5;j++){

                while(k>0){
                    // System.out.println(j+i+"\t" +source.subjectSE[l]);
                    assignSE[i][j]=su.subjectSE[l];
                    k--;
                    break;
                }
                if(k==0){

                    if(su.subjectSE[l+1]=="FREE"&& q!=0){
                        k=6;
                        l++;
                        q=0;
                        continue;
                    }
                    k=4;
                    l++;
                }
            }
        }
        return assignSE;

    }






    void print2(String[][] love,String heading){

        int l=0;
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\t\t\t\t"+heading+"\n\n");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        for(int i=0;i<5;i++){
            System.out.println("\n");
            System.out.print(su.Days[i]+"\t\t");
            for(int j=0;j<8;j++){
                /* if(i==l &&j==3){

                            System.out.print("\tBREAK\t\t");
                            l++;
                 }*/

                System.out.print(love[i][j]+"      ");
            }
            //System.out.print("\tPrac\t\tPrac");

        }

    }







    String[][] shift(String[][] love,int y){
        int l=0;
        // System.out.println("CheckPoint shift");
        Random random = new Random();
        // System.out.println(love.length+"\t"+love[0].length);
        int numberOfValues = love.length * love[0].length;
        for (int i = numberOfValues - 1; i > 0; i--) {
            int index = random.nextInt(i);
            int row = i / love[0].length;
            int column = i - row * love[0].length;
            int randomRow = index / love[0].length;
            int randomColumn = index - randomRow * love[0].length;
            String temp = love[row][column];
            love[row][column] = love[randomRow][randomColumn];
            love[randomRow][randomColumn] = temp;
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){

                if(love[i][1]=="TOC    "||love[i][1]=="ISEE   "||love[i][2]=="TOC    "
                        ||love[i][2]=="ISEE   "||love[i][1]=="SDl(2) "||love[i][2]=="SDl(2) "){
                    // l++;
                    shift(love,0);

                }

                if(love[i][1]=="DESHMUKH-M"||love[i][2]=="DESHMUKH-M"){
                    if(y==2){

                        // l++;
                        shift(love,2);

                    }

                }

                if(love[i][1]=="DSA"||love[i][2]=="DSA"){

                    // l++;
                    shift(love,2);

                }

            }


        }


        return love;
    }


    String[][] change(String[][] take){
        String temp;



        //  System.out.println("take[0][1]\t"+take[0][1]+"take 04\t\t"+take[0][4]);

        temp=take[0][1];
        take[0][1]=take[0][4];
        take[0][4]=temp;

        temp=take[0][2];
        take[0][2]=take[0][5];
        take[0][5]=temp;

        temp=take[3][1];
        take[3][1]=take[3][4];
        take[3][4]=temp;

        temp=take[3][2];
        take[3][2]=take[3][5];
        take[3][5]=temp;







        methods met=new methods();
        //  met.print2(take,"#@#@###@@@@@@@@@@@@@@@@@@@@@@@@@@@###@#");





        return take;
    }



    String[][] change1(String[][] take){
        String temp;



        //  System.out.println("take[0][1]\t"+take[0][1]+"take 04\t\t"+take[0][4]);

        temp=take[1][5];
        take[1][5]=take[1][7];
        take[1][7]=temp;

        temp=take[1][6];
        take[1][6]=take[1][4];
        take[1][4]=temp;

        temp=take[4][5];
        take[4][5]=take[4][7];
        take[4][7]=temp;

        temp=take[4][6];
        take[4][6]=take[4][4];
        take[4][4]=temp;







        methods met=new methods();
        //  met.print2(take,"#@#@###@@@@@@@@@@@@@@@@@@@@@@@@@@@###@#");





        return take;
    }


    String[][] change2(String[][] take){
        String temp;



        //  System.out.println("take[0][1]\t"+take[0][1]+"take 04\t\t"+take[0][4]);

        temp=take[2][1];
        take[2][1]=take[2][6];
        take[2][6]=temp;

        temp=take[2][2];
        take[2][2]=take[2][7];
        take[2][7]=temp;









        methods met=new methods();
        //  met.print2(take,"#@#@###@@@@@@@@@@@@@@@@@@@@@@@@@@@###@#");





        return take;
    }



}


