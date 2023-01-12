package UshtJavaNgaSeancatEkursit;
import java.util.*;

 class usht5Seanca5_2 {


     public static int[][] ush4Seanca5_2(int[] array){
         int[][] matrica2D = new int[array.length][2];
         int count = 1;
         int i0 = 0, j0= 0;
         Arrays.sort(array);

         for(int i = 0; i < array.length - 1; i++){
             while(count > 1){
                 i++;
                 count--;
             }
             j0 = 0;
             count = 1;

             for(int j = i+1; j< array.length;j++){
                 if(array[j] == array[i]){
                     count++;
                 }
             }
             matrica2D[i0][j0] = array[i];
             j0++;
             matrica2D[i0][j0]= count;
             i0++;
         }

         return matrica2D;
         }


    public static void usht5() {
        int[][] matrica = {
                {6, 2, 6},
                {7, 3, 9},
                {32, 6, 843}
        };

        int meiMadhikolones = matrica[0][0];
        int meiMadhiRreshtit = matrica[0][0];
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                System.out.print(matrica[i][j] + " ");
                if (matrica[i][j] > meiMadhikolones) {
                    meiMadhikolones = matrica[i][j];
                }

            }
            System.out.println();
            if (matrica[i][0] > meiMadhiRreshtit) {
                meiMadhiRreshtit = matrica[i][0];
            }
        }
        System.out.println("Elementi me i madh i kolones eshte: " + meiMadhikolones + " dhe me i madhi i rreshtit eshte: " + meiMadhiRreshtit);
    }


    public static int[] usht2Seanca5_2(int[] a, boolean flag) {
        int vleratRritese;
        int vleratUlese;
        if (flag) {
            for (int i = 0; i < a.length; i++) {
                for (int j = i; j < a.length; j++) {
                    if (a[i] > a[j]) {
                        vleratRritese = a[i];
                        a[i] = a[j];
                        a[j] = vleratRritese;


                    }

                }
            }
            for(int i = 0; i < a.length; i++){
                System.out.print(a[i] + " ");
            }
        }
        else {
                for (int i = 0; i < a.length; i++) {
                    for (int j = i + 1; j < a.length; j++) {
                        if (a[i] < a[j]) {
                            vleratUlese = a[i];
                            a[i] = a[j];
                            a[j] = vleratUlese;




                        }

                    }
                }
            for(int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");

            }
            }
            return a;
        }



    }


