package UshtrimeSeanca2;
import PajisjeElektronike.Laptop;

import java.util.Scanner;

public class Main {

    public static int rectangleArea(int width, int length){ return width * length;}

    public static double circleArea(int radius){ return Math.PI * radius * radius;}

   public static boolean compareIntegers(int a, int b){
        return a == b;

        /** menyre tjeter
         *if ( a == b){
            return true;
       }
       return false; */




   }
    static void shumaE10numrave(){
        int sum = 0;
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            sum += i; //sum = sum + i;
            i++;


        }
        System.out.println("Shuma e 10 numrave eshte : " + sum);
    }
   public static boolean lessThan10(int number){
        if(number < 10){
            return true;
        }
        return false;

       /** menyre tjeter
        * if return number < 10;
        */
   }

   public static int doubleThenumber(int x){ return x * 2;}

    public static void printCombinations(){

        String firstExpression = "Numri 25 eshte me i vogel se numri 24";
        String secondExpression = "Numri 8 eshte numer cift";

        String invertedSecondExpression = "Numri 8 nuk eshte numer cift";
        String invertedFirstExpression = "Numri 25 nuk eshte me i vogel se numri 24";

        boolean firstExpressionBool =  25<24;
        boolean secondExpressionBool = 8 % 2 == 0;

        System.out.println(firstExpression + "DHE" + secondExpression + ": " + (!firstExpressionBool && secondExpressionBool ));
        System.out.println(firstExpression + "DHE" + secondExpression + ": " + (firstExpressionBool || secondExpressionBool ));
        System.out.println(firstExpression + "DHE" + invertedSecondExpression + ": " + (firstExpressionBool && !secondExpressionBool ));
        System.out.println(invertedFirstExpression + "DHE" + secondExpression + ": " + (!firstExpressionBool || secondExpressionBool ));
        System.out.println(invertedFirstExpression + "DHE" + invertedSecondExpression + ": " + (firstExpressionBool && secondExpressionBool ));
    }


public static void main(String[] args) {
   /*int minutesInYear = 60 * 24 * 365;

    Scanner input = new Scanner(System.in);

    System.out.print("Ju lutem jepni numrin e minutave: ");

    int min = input.nextInt();

    long years = min / minutesInYear;
    int days = ( min / 60 / 24) % 365;

    System.out.println(min + " minuta perktehet ne " + years + " years and " + days + " days");

    input.close();

    Scanner numberInput = new Scanner(System.in);
    System.out.println("Jep 5 numra : ");
     System.out.println("Jep numrin e pare : ");
     int nr1 = numberInput.nextInt();
    System.out.println("Jep numrin e dyte : ");
    int nr2 = numberInput.nextInt();
    System.out.println("Jep numrin e trete : ");
    int nr3 = numberInput.nextInt();
    System.out.println("Jep numrin e kater : ");
    int nr4 = numberInput.nextInt();
    System.out.println("Jep numrin e peste : ");
    int nr5 = numberInput.nextInt();
    numberInput.close();

    double average = Laptop.averageOfFiveNumbers(nr1, nr2, nr3, nr4, nr5);
    System.out.println("Mesatarja e 5 numrave te dhene nga perdoruesi eshte : " + average);*/

    //shumaE10numrave();
    Autori autor1 = new Autori("Millosh", "Nikolla", 27, "migjeni01@gmail.com");
    Libri libri1 = new Libri("Poezi", 90, 950.55, autor1);
    System.out.println(libri1.getAutor().getEmri());
    System.out.println(libri1);

}




}


