package Ushtrime_seanca4;
import java.util.Scanner;
public class Seanca4 {


    //7. Krijo një metodë që merr si parametër dy array dhe printon nëse arratt janë të “barabarta” apo jo.

    public static String krahasimiDyArrayve(int[] array1, int[] array2){

         /* if(array1.length != array2.length){
              return false;
          }
        for(int i = 0; i < array1.length; i++){
            if(array1[i] != array2[i]){
                return false;
            }

        }
        return true;*/
        if(array1.length != array2.length){
            return "Nuk jane te barabarte";
        }
        for(int i = 0; i < array1.length; i++){
            for(int j = i + 0; j<array2.length;j++){
                if(array1[i] == array2[j]){
                    return "Jane te barabarte";
                } else if (array1[i] != array2[j]) {
                    return "Nuk jane te barabarte";

                }

            }
            }
           return " Nuk jane te barabarte";


    }

    // 4. Shkruaj një program që fshin elementin e parë të një array pa përdorur një array tjetër ndihmës.
    public static void hiqElementinEpare(int[] b ){
        for(int i = 0; i < b.length - 1; i++){
            b[i] = b[i + 1];

        }
        for(int j = 0; j < b.length; j++){
            System.out.println(b[j]);
        }

        System.out.println("Elementi i pare eshte: " + b[0] +" Dhe elementi i dyte eshte: " + b[1] );
        System.out.println("Elementi i trete eshte: " + b[2] +" Dhe elementi i katert eshte: " + b[3] );
    }







    public static void main(String[] args){
        //5. Shkruaj një program që gjen elementet e dublikuara në një array
        int[] a = {2,5,6,4,2,7,5};
        for(int i = 0; i < a.length-1; i++){
            for(int j = i + 1; j < a.length;j++){
                if(a[i] == a[j]) {
                    System.out.println("Elementi i duplikuar eshte: " + a[j]);
                }

            }

        }
      // Thirrja ne main e metodes hiq Elementin e Pare,
        int[] c = {3, 5, 7, 8};
        hiqElementinEpare(c);




        int[] arrayPare = {2, 4, 5, 6};
        int[] arrayDyte = {2, 3, 5, 6};
        krahasimiDyArrayve(arrayPare, arrayDyte);

        /** if (equals(arrayPare, arrayDyte)){
            System.out.println("Arrayt jane te barabarte");
        }
        else{
            System.out.println("Nuk jane te barabarte");
        }*/


       /**1. Shkruaj një program që gjen mesataren e elementeve të një array 1D.
       Të dhënat e arrayt dhe madhësia e arrayt të merren si input nga përdoruesi.
        */

        /*Scanner put = new Scanner(System.in);

        System.out.println("Jepni madhesine e Arrayt: ");
        double mesatarja= 0 ;
        double shuma = 0;

        int madhesiaArrayt = put.nextInt();
        double[] teDhenat = new double[madhesiaArrayt];

        for(int i = 0; i < madhesiaArrayt; i++) {
            System.out.println("Vendosni te dhenat " + (i + 1));
          teDhenat[i] = put.nextInt();
            shuma += teDhenat[i];
            mesatarja = shuma / madhesiaArrayt;

        }

        System.out.println("Mesatarja eshte: " + mesatarja);*/

// 6. Shkruaj një program që gjen elementin e dytë më të madh në një array 1D.
        int max;
        int i,j = 0;
        int[] b = new int[]{4,72,7,8,13};
        for( i = 0; i < b.length;i++){
            for( j = i+1; i < b.length; j++){
                if(b[i] < b[j]){
                    max = b[i];
                    a[i] = a[j];
                    a[j] = max ;
                }
            }
        }
        System.out.println(a[1]);



    }
}
