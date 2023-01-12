package LabForWhileArrays;
import java.util.*;

public class Ush5 {

    public static int elementiIdyteMeImadh(int[] a){
        int max = 0;
        int max2 = 0;
        int i,j;

        for( i = 0; i < a.length;i++){
            if(a[i] > max){
                max = a[i];

            }

        }
        for( j = 1; j< a.length; j++){
            if(max2 < a[j] && a[j]<max )
                max2 = a[j];


        }
        System.out.println("Elementi i dyte me i madh eshte: " + max2);
        return max2;
    }

    public static void main(String[] args){
       /* Scanner a1 = new Scanner(System.in);
        System.out.println("Vendos numrin: " );
         int a = a1.nextInt();
         int b = 0;
         int c = 0;*/
        int[] c = {4,5,2,7,1,6};

        System.out.println(elementiIdyteMeImadh(c));




        float shuma = 1;

        for(float i = 4; i < 1606 ; i*=2){

            shuma += 1 / (i);
        }
        System.out.println(shuma);





    }
}
