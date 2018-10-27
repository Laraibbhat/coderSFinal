/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author laraib
 */






public class practical {


    //    public static String[] TEPractical = {"SDL1 ", "SDL2 ", "DBMS", "DBMS","CNL ", "SDL1 ", "SDL2 ", "DBMS", "DBMS", "CNL ", "SDL1 ", "SDL2 ", "DBMS", "DBMS", "CNL ", "SDL1 ", "SDL2 ", "DBMS", "DBMS", "CNL ","FREE"};
//public static String[] TEPractical = ;
    static String[][] PracTE = new String[5][4];
    static String[][] PracSE = new String[5][4];
    static String[][] PracBE = new String[5][4];


    Scanner s = new Scanner(System.in);
    public static String[] TEPractical = {"DBMS ", "DBMS ", "SDL 1", "SDL 2", "CNL  ", "DBMS ", "DBMS ", "SDL 1", "SDL 2", "CNL  ", "DBMS ", "DBMS ", "SDL 1", "SDL 2", "CNL  ", "DBMS ", "DBMS ", "SDL 1", "SDL 2", "CNL  ","FREE"};
    public static String[] SEPractical = {"DSA1 ", "DSA2 ", "OOP  ", "DELD ", "SS   ", "DSA1 ", "DSA2 ", "OOP  ", "DELD ", "SS   ", "DSA1 ", "DSA2 ", "OOP  ", "DELD ", "SS   ", "DSA1 ", "DSA2 ", "OOP  ", "DELD ", "SS   ","FREE"};
    public static String[] BEPractical = {"LP-1 ", "LP-1 ", "LP-2 ", "LP-2 ", "LP-2 ", "LP-1 ", "LP-1 ", "LP-2", "LP-2  ", "LP-2", "LP-1  ", "LP-1", "LP-1  ", "LP-2 ", "LP-2", "LP-1  ", "proj ", "proj ", "proj ","proj  ","FREE"};


    public void assignprac() {

        int k = 1;
        int q = 3;
        int l = 0;
        int w = 0;
        int t = 0;
        int r = 3;
        int qw = 3;
        int y = 3;
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){

                while (k > 0) {
                    // System.out.println("TE PRACTIcal\t"+TEPractical[l]+"\ti  j\t"+i+j);
                    PracTE[i][j] = TEPractical[l];
                    k--;
                    break;
                }
                if (k == 0) {
                    if (TEPractical[l + 1] == "FREE" && q != 0) {
                        k = 16;
                        l++;
                        q = 0;
                        continue;

                    }
                    k = 1;
                    l++;
                }

            }
        }
        k=1;
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 4; j++) {

                while (k > 0) {
                    // System.out.println("TE PRACTIcal\t"+TEPractical[l]+"\ti  j\t"+i+j);
                    PracSE[i][j] = SEPractical[w];
                    k--;
                    break;
                }
                if (k == 0) {
                    if (SEPractical[w + 1] == "FREE" && q != 0) {
                        k = 16;
                        l++;
                        q = 0;
                        continue;

                    }
                    k = 1;
                    w++;
                }

            }
        }

        k=1;
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 4; j++) {

                while (k > 0) {
                    // System.out.println("TE PRACTIcal\t"+TEPractical[l]+"\ti  j\t"+i+j);
                    PracBE[i][j] = BEPractical[t];
                    k--;
                    break;
                }
                if (k == 0) {
                    if (BEPractical[t + 1] == "FREE" && q != 0) {
                        k = 16;
                        l++;
                        q = 0;
                        continue;

                    }
                    k = 1;
                    t++;
                }

            }
        }


        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(PracBE[i][j] + " \t");
            }
            System.out.println();
        }


        System.out.println("\n\nBREAK");

        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(PracTE[i][j] + " \t");
            }
            System.out.println();
        }


        System.out.println("\n\nBREAK");


        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(PracSE[i][j] + " \t");
            }
            System.out.println();
        }


        System.out.println("\n\nBREAK");

        shuffling();


    }

    public void shuffling() {
        int ans = 0;

        //do {
        // if (s.hasNextLine()) {
        //if(ans==0){

        while(ans==0){
            ans=1;
            for (int i = 0; i < 4; i++) {
                String temp = PracTE[0][i];
                PracTE[0][i] = PracTE[4][i];
                PracTE[4][i] = temp;

                String temp1 = PracTE[0][i];
                PracTE[0][i] = PracTE[1][i];
                PracTE[1][i] = temp1;



                String temp2 = PracTE[2][i];
                PracTE[2][i] = PracTE[3][i];
                PracTE[3][i] = temp2;


                String temp3 = PracSE[0][i];
                PracSE[0][i] = PracSE[3][i];
                PracSE[3][i] = temp3;

                String temp4 = PracSE[2][i];
                PracSE[2][i] = PracSE[1][i];
                PracSE[1][i] = temp4;



                String temp5 = PracSE[2][i];
                PracSE[2][i] = PracSE[4][i];
                PracSE[4][i] = temp5;

                String temp6 = PracBE[0][i];
                PracBE[0][i] = PracBE[3][i];
                PracBE[3][i] = temp6;

                String temp7 = PracBE[2][i];
                PracBE[2][i] = PracBE[1][i];
                PracBE[1][i] = temp7;



                String temp8 = PracBE[2][i];
                PracBE[2][i] = PracBE[4][i];
                PracBE[4][i] = temp8;


            }


            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(PracTE[i][j] + " \t"+" \t");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(PracSE[i][j] + " \t"+" \t");
                }
                System.out.println();
            }

            System.out.println();
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(PracBE[i][j] + " \t"+" \t");
                }
                System.out.println();
            }

            // System.out.println("press enter to continue  ");
            //ans=s.nextInt();

        }


    } //while (ans == 1);

}

/*
 practical prac;
        prac=new practical();
        prac.assignprac();
 */

       