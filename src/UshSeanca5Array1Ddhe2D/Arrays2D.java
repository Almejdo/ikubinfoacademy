package UshSeanca5Array1Ddhe2D;

import java.util.*;


public class Arrays2D {

    public static void main(String[] args){

        /*int[][] shumaEkolonave = {{1,2,4}, {3,6,4}, {2,6,2}};
        int shuma = 0;

        for(int i = 0; i < shumaEkolonave[i].length; i++){
            for(int j = 0; j < shumaEkolonave.length; j++){

                shuma += shumaEkolonave[i][j];

            }
            System.out.println("Shuma e kolones " + Arrays.toString(shumaEkolonave[i]));
            System.out.println("Eshte " + shuma);
            shuma = 0;

        }*/


        Scanner input = new Scanner(System.in);
        int[] elementet = {5,6,7,9};
        int numratMeTeMedhenj = 0;
        System.out.println("Jepni numrin : ");
        int inputiperdoruesit = input.nextInt();

        for(int i = 0; i < elementet.length; i++){
            if(elementet[i] > inputiperdoruesit ){
               numratMeTeMedhenj += 1;

            }



        } System.out.println("Numrat me te medhenj se numri i dhene nga perdoruesi eshte : " + numratMeTeMedhenj);



        int[] array1D = {4,6,2,9,7,17,37,-1};
        int meIvogli = array1D[0];
        int index = 0;

        for(int i = 0; i < array1D.length; i++){
            if(array1D[i] < meIvogli ){
                meIvogli = array1D[i];
                {
                    if(array1D[i] == meIvogli){
                        index = i;
                    }
                }
            }
        }
        System.out.println("Numri me i vogel eshte: " + meIvogli + " dhe indexi i tij eshte: " + index);


        Scanner put = new Scanner(System.in);

        int[][] matricaNotave = new int[5][10];
        int notat=0;
        int mesatarja = 0;
        int[] mesatarjaNotave = new int[5];
        int mesatarjaMeElarte = mesatarjaNotave[0];

        for(int i = 0; i < matricaNotave.length; i++){
            notat = 0;
            for( int j = 0; j < 10; j++){
                System.out.println("Jepni notat: ");
                matricaNotave[i][j] = put.nextInt();
                notat += matricaNotave[i][j];

            }mesatarja = notat / 10;
            System.out.println("Pedagogu " + i + " vlesreson studentet me notat " + notat);
            mesatarjaNotave[i]=mesatarja;
            System.out.println("Mesatarja e tyre eshte: " + mesatarjaNotave[i]);

        }
        for(int i = 0; i < mesatarjaNotave.length; i++){
            if(mesatarjaNotave[i] > mesatarjaMeElarte ){
               mesatarjaMeElarte = mesatarjaNotave[i];
            }

        }
        System.out.println("Mesatarja me e larte eshte : " + mesatarjaMeElarte);


    }
}
