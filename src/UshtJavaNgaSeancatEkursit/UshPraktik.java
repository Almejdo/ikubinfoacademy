package UshtJavaNgaSeancatEkursit;


import java.util.*;

public class UshPraktik {


    public static int maxI2numrave(int a , int b){


                if(a > b){

                    System.out.println("Maximumi i dy numrave te dhene eshte: " + a);
                } else{

                    System.out.println("Maximumi i dy numrave te dhene eshte: " + b);
                }

        return 0;
    }

    public static int elementiMeIvogel(){

        int[] matrica = {4,6,-1,7,9,3};
        int meIvogel = matrica[0];
        int indexi = 0;
        for(int i = 0; i < matrica.length; i++){
            for(int j = i + 1; j < matrica.length; j++){
                if(matrica[i] < meIvogel){
                    meIvogel = matrica[i];
                    indexi = i;

                }
            }
        } System.out.println("Elementi me i vogel eshte: " + meIvogel + " dhe indexi i tij eshte: " + indexi);

        return 0;
    }

    public static int elementiMeIvogelArray2D(){
        int[][] matrica = {{5,1,7}, {2,-2,12},{-1,6,3}};
        int meIvogli = matrica[0][0];
        int indexiRreshtit = 0;
        int indexiKolones = 0;
        for(int i = 0; i < matrica.length;i++){
            for(int j = 0; j < matrica[i].length; j++){
                if(matrica[i][j] < meIvogli){
                    meIvogli = matrica[i][j];
                    indexiRreshtit = i;
                    indexiKolones = j;
                }
            }
        }
        System.out.println("Elementi me i vogel ne arrayn 2d eshte: " + meIvogli + " dhe indexi i tij eshte: " + "["+indexiRreshtit+"] "+"["+indexiKolones+"]");

        return meIvogli;


    }

    public static void rreshtatNekolonaDheanasjelltas(){
        int[][] matrica2D = {{1,2},{3,4},{5,6}};
        int[][] matrica2 = new int[2][3];
        int x;
        int y;

        for(  x = 0; x <= 2  ; x++){
            for( y = 0; y <= 1   ; y++){
                  matrica2[y][x] = matrica2D[x][y];


            }


        }
        for(int c = 0; c < matrica2.length; c++){
            for(int d = 0; d < matrica2[c].length; d++){
                System.out.print( matrica2[c][d] + " ");


            }
            System.out.println();
        }




    }

    public static void merrNgaPerdoruesi2matrica2Ddhe1D(){
        Scanner input = new Scanner(System.in);
        System.out.println("Jepni madhesine e matrices 1D.");
        int a = input.nextInt();
        int[] matrica1D = new int[a];
        for(int i = 0; i < a; i++){
            System.out.println("Jepni elementet e matrices 1D: ");
            matrica1D[i] = input.nextInt();

        }
        for(int i = 0; i < a; i++){
            System.out.print(matrica1D[i] + " ");

        } System.out.println();


        System.out.println("Jepni madhesine e rreshtave te matrices 2D: ");
        int b = input.nextInt();
        System.out.println("Jepni madhesine e kolonave te matrices 2D: ");
        int c = input.nextInt();
        int[][] matrica2D = new int[b][c];
        for(int i = 0; i < b; i++){
            for(int j = 0; j < c; j++){
                System.out.println("Jepni elementet e matrices 2D: ");
                matrica2D[i][j] = input.nextInt();

            }

        }

        for(int i = 0; i < b; i++){
            for(int j = 0; j < c; j++){
                System.out.print(matrica2D[i][j] + " ");
            }
            System.out.println();
        }





    }

    public static void gjejElementetMeTemedhenjRreshtKolone(){
        Scanner input = new Scanner(System.in);
        System.out.println("Jepni madhesine e kolonave dhe rreshtave: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int[][] matrica = new int[a][b];
        int krahasimiRreshtitKolones = matrica[0][0];
        int l = 0;
        int meImadhiRreshtit = 0;
        int meImadhiKolones = 0;
        int indexi = 0;
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++) {
                System.out.println("Jepni elementet e matrices: ");
                matrica[i][j] = input.nextInt();

            }
        }
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < a; i++){
            if(matrica[i][l] > krahasimiRreshtitKolones){
                meImadhiRreshtit = matrica[i][l];
                l++;

            }
            for(int j = 0; j < b; j++){
                if(matrica[i][j] > krahasimiRreshtitKolones){
                    meImadhiKolones = matrica[i][j];


                }

            }
        }
        System.out.println("Elementi me i madh i rreshtit eshte: " + meImadhiRreshtit + " dhe me i madhi kolones eshte: " + meImadhiKolones);

    }

    public static void numriMeImadhTekDheCift(){
        int[][] matrica = new int[][]{
                { 4,2,5},
                {7,23,5},
                {232,3,72}
        };
        int numriMeImadhTek = matrica[0][0];
        int numriMeImadhCift = 0;
        for(int i = 0; i < matrica.length; i++){
            for(int j = 0 ; j < matrica[0].length; j++){
                if(matrica[i][j] % 2 == 0 ) {
                    if(matrica[i][j] > numriMeImadhCift){
                        numriMeImadhCift = matrica[i][j];
                    }
                }
                else if(matrica[i][j] % 2 != 0){
                    if(matrica[i][j] > numriMeImadhTek){
                        numriMeImadhTek = matrica[i][j];
                    }

                }
            }
        }
        System.out.println("Elementi me i madh tek eshte: " + numriMeImadhTek + " dhe me i madhi cift eshte: " + numriMeImadhCift);
    }

    public static void ush1Seanca5_2() {
        Scanner input = new Scanner(System.in);
        int[][] matrica2D = {
                {3,4,8},
                {6,34,2},
                {3,5,2}
        };
        System.out.println("Jepni numrin: ");
        int inputiPerdoruesit = input.nextInt();
        int indexi1 = 0;
        int indexi2 = 0;
        for(int i = 0; i < matrica2D.length; i++){
            for(int j = 0; j < matrica2D[i].length; j++){
                if(matrica2D[i][j] == inputiPerdoruesit){
                    indexi1 = i;
                    indexi2 = j;
                }
            }
        }
        int[] matrica1D = {indexi1,indexi2};

        System.out.println("Array eshte: " + Arrays.toString(matrica1D));

    }

    public static boolean usht7Seanca5(){
        int[][] matrica = {{2,5,5},{5,2,5},{2,2,6}};
        int shuma1 = 0;
        int shuma2 = 0;
        for(int i = 0; i < matrica.length;i++){
            for(int j = 0; j<matrica[i].length; j++){
                if(i == j){
                shuma1 += matrica[i][j]; }
                /* ose if(j == matrica.length-i-1){
                shuma += matrica[i][j];
                 */
                // menyre me e shkurte dhe nuk ka nevoje per ciklin for posht,
            }
        }

        for(int i = matrica.length; i >= 0; i--){
            for(int j = matrica.length - i- 1; j >=0; j--){
               if(j == matrica.length-i-1){
                shuma2 += matrica[i][j];}

            }
        }
        if(shuma1 != shuma2){
            return false;
        }
        else
            return true;
        // ose return shuma1 == shuma2;
    }




    public static void main(String[] args){
        /*Scanner input = new Scanner(System.in);
        int inputiPerdoruesit ;
        int inputiiPerdoruesit;
        System.out.println("Jepni numrin a: ");
        inputiPerdoruesit = input.nextInt();
        System.out.println("Jepni numrin b");
        inputiiPerdoruesit = input.nextInt();
      maxI2numrave(inputiPerdoruesit, inputiiPerdoruesit);


      elementiMeIvogel();

      elementiMeIvogelArray2D();

      //rreshtatNekolonaDheanasjelltas();

        merrNgaPerdoruesi2matrica2Ddhe1D();
        gjejElementetMeTemedhenjRreshtKolone();*/
       // numriMeImadhTekDheCift();
        //ush1Seanca5_2();
        /*rreshtatNekolonaDheanasjelltas();
        boolean rezultati = usht7Seanca5();
        System.out.println("Vlera te rezulatati eshte: " + rezultati );
        if(rezultati){
            System.out.println("Shuma e diagonaleve te matrices eshte e barabarte");
        } else
            System.out.println("Shuma e diagonaleve te matrices nuk eshte e barabarte.");*/
   /* int[] a = { 3,61,97,8,62};
     boolean flag = false;
     usht5Seanca5_2.usht5();
        usht5Seanca5_2.usht2Seanca5_2(a,flag);*/
        int[] array = {1,2,3,5,7,2,4,7,5};


        int[][] array2D = usht5Seanca5_2.ush4Seanca5_2(array);
        for(int i = 0; i < array2D.length; i++){
            for(int j = i +1; j < 2; j++)
                if(array2D[i][j] == 0){
                    continue;
                }
            else{
                    System.out.println(array2D[i][j] + " ");
                }
        }

    }
}
