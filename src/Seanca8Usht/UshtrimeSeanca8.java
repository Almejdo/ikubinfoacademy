package Seanca8Usht;
import java.util.*;

public class UshtrimeSeanca8 {

    // Ushtrimi 1
    public static String km_ne_m(double shpejtesia){
        double mS = shpejtesia / 3.6;
        return "Shpejtesi ne m/s eshte: " + mS;

    }
    // Ushtrimi 9
    public static void temperatura(){
        Scanner input = new Scanner(System.in);
        System.out.println("Jepni Temperaturen: ");
        int temperatura = input.nextInt();

        if(temperatura >= 25)
            System.out.println("Aktiviteti A");
        else if(temperatura >= 18)
            System.out.println("Aktiviteti B");
        else if(temperatura >= 10)
            System.out.println("Aktiviteti C");
        else
            System.out.println("Aktiviteti D");

    }
    // Ushtrimi 7
    public static void shumaSerise(){
        Scanner input = new Scanner(System.in);
        System.out.println("Jepni numrin n: ");
        int n = input.nextInt();
       double shuma = 0;

        for(int i = 1; i <= n;i = i + 2){
            for(int j = i + 1; j > i;j--) {

                shuma += (1 / i) - (1 / j);

                System.out.println(i + " " + j);
            }

        }
        System.out.println("Shuma: " + shuma);



    }

    //Ushtrimi 5
    public static void notat(){
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[5];
        int count = 0;
        for(int i = 0; i < array1.length;i++) {
            System.out.println("Jepni notat: ");
            array1[i] = input.nextInt();
            if(array1[i] == 4){

                System.out.println("Ju nuk mund të kaloni në vitin pasardhës");
            }
            if(array1[i] > 7){
                count++;
            }
            if(count == 4)
                System.out.println("Urime!");


        }

    }
    // Ushtrimi 6
    public static void vitiLindjes(){
        Scanner input = new Scanner(System.in);

            System.out.println("Jepni vitin e lindjes: ");
            if(input.nextInt() % 4 == 0){
                System.out.println("Ju keni lindur ne vitin e brishte ");
            }
            else
                System.out.println("Nuk keni lindur ne vitin e brishte");
    }

    public static void karakteretSpeciale(String tekst){
        char[] charArray = tekst.toCharArray();
        Arrays.sort(charArray);
        int l = 0;
        int count = 1;

        for(int i = 0; i < charArray.length; i++){
            while(count > 1){
                i++;
                count--;
            }

            for(int j = i +1; j< charArray.length; j++) {

                if (tekst.charAt(i) == tekst.charAt(j)) {
                    count++;
                }

            }
            charArray[l] = charArray[i];
            l++;
            System.out.println(charArray[l] + " perseritet: " + count);
        }
    }
   // Ushtrimi 4
    public static void veprimet(){
        Scanner input = new Scanner(System.in);
        System.out.println("Jepni 2 numrat");
        int a = input.nextInt();
        int b = input.nextInt();

        int mbledhja = 0;
        int zbritja = 0;
        float pjesetimi = 0;
        int shumezimi = 0;

        mbledhja = a + b;
        zbritja = a - b;
        shumezimi = a * b;
        if( b == 0 ){
            System.out.println(" Pjesetimi Nuk lejohet");
        }
        else
            pjesetimi = a / b ;

        if(a == b)
            System.out.println("A eshte baraz me B");
        else if(a > b)
            System.out.println("A eshte me e madhe se B");
        else
            System.out.println("A eshte me e vogel se B");


        System.out.println("Veprimet e dy numrave te dhena nga perdoruesi jane: mbledhja: " +mbledhja + " zbritja: " + zbritja + " shumezimi: " + shumezimi + " pjesetimi:" + pjesetimi);


    }
     // Ushtrimi 3
    public static void matrica2DShumaSiperDiagonales() {
        int[][] array ={{2,7,3,4},{3,73,734,75},{2,36,31,74},{3,7,4,2}};
        int sum = 0;

        for(int i = 0; i < array.length - 1; i++){
            for(int j = i +1; j < array.length; j++){
                sum += array[i][j];
            }
        }
        System.out.println("Shuma e elemnteve siper diagonales kryesore eshte: " + sum);

        // Ushtrimi 3 kerkesa b
       int meImadhi = array[0][0];
       int meIvogli = array[0][0];

        for (int i = 1 ; i < array.length ; i++){
            for (int j = 3 ; j >= array[1].length-i ; j--) {
                if(array[i][j] > meImadhi){
                    meImadhi = array[i][j];
                }

                if(array[i][j] < meIvogli){
                    meIvogli = array[i][j];
                }


            }

        }
        System.out.println("Me i vogli eshte: " + meIvogli + " ,dhe me i madhi eshte: " + meImadhi);

    }


    public static void main(String[] args){
      // String a =  km_ne_m(200);
       // System.out.println(a);
       // temperatura();
       // shumaSerise();
        //notat();
       // vitiLindjes();
       // String b = "Bootcamp Java 2022";
       // karakteretSpeciale(b);
        //veprimet();
       // matrica2DShumaSiperDiagonales();

      // ushtrimi 8
        for (int i = 1; i <= 4; i++)
        {
            int n = 4;

            for (int j = 1; j<= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--)
        {
            System.out.print(k);
        }
           for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }


    }
}
