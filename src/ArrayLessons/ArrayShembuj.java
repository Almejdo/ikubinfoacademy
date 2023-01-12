package ArrayLessons;

import java.util.Scanner;

public class ArrayShembuj {

    static int[] dyfishoVleratArray(int[] numrat){

        for(int i = 0; i < numrat.length; i++){
            System.out.println("Vlera pare eshte: " + numrat[i]);
            numrat[i] *= 2;
            System.out.println("Vlera mbas eshte: " + numrat[i]);
        }

        return numrat;
    }

    public static void main(String[] args){
        int[] notat = new int[4];
       /* notat[0] = 2;
        notat[1] = 5;
        notat[2] = 7;
        notat[3] = 10;
        */
        int shuma = 0;

        // ose keshtu po pak me e gjate
        Scanner nota = new Scanner(System.in);
        /*System.out.println("Jepni numrin: ");
        notat[0] = nota.nextInt();
        System.out.println("Jepni numrin: ");
        notat[1] = nota.nextInt();
        System.out.println("Jepni numrin: ");
        notat[2] = nota.nextInt();
        System.out.println("Jepni numrin: ");
        notat[3] = nota.nextInt();*/

        for(int i = 0; i < 4; i++){
            System.out.println("Jepni numrin: ");
            // ose me kodin me poshte me shkurter de me paster
            notat[i] = nota.nextInt();

            /*System.out.println("Elementi i " + i + " eshte " + notat[i]);
            shuma += notat[i];
            System.out.println("Shuma eshte : " + shuma);*/
        }
        //int[] notat = new int[]{1,2,3,4,5,6,7,8,9,0,};
        //System.out.println("Elemeti i pare ne array eshte: " + notat[0]);

        int[] numrat = {4,5,7,9};
        /**int[] numrat = new int[]{4,5,7,9};
        int[] numrat = new int[4];*/

        dyfishoVleratArray(numrat);

        // {1, 4, 5} -- sintaksa e nje array 1D
        // { {1, 4, 5}, {7, 8, 9}} -- sintaksa e nje array 2D
    }
}
