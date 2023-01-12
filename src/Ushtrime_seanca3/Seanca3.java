package Ushtrime_seanca3;
import java.util.Scanner;

public class Seanca3 {
    private Scanner input = new Scanner(System.in);


    /**
     * 1. Shkruaj një program që llogarit shumën e numrave tek dhe
     * çift që janë më të vegjël se 100 dhe më të mëdhenj se 35.
     */
    public static void shumaNumraveTekDheCift() {
        int shumaNumraveTek = 0;
        int shumaNumraveCift = 0;
        for (int i = 35; i <= 100; i++) {
            if (i % 2 == 0) {
                shumaNumraveCift += i;
            } else {
                shumaNumraveTek += i;
            }
        }
        System.out.println("Shuma e numrave tek eshte : " + shumaNumraveTek + " Shuma e numrave cift eshte : " + shumaNumraveCift);

    }

    //Ushtrimi 5 kerkesa a ,
    public static void rreshtatMe5yje() {

        for (int i = 0; i < 6; i++) {
            System.out.println("*****");
        }
    }

    /**
     * 3.  Shkruaj një program që lexon dhe printon numrat e dhënë nga një përdorues
     * derisa ai të japë një input tjetër tekst, jo numër.
     * Në përfundim të programit, duhet që të printohet totali i numrave me dy shifra.
     */
    public void numratEdheneNgaPerdoruesi() {
        int shuma = 0;
        int inputNumber;

        System.out.println("Jepni numrat : ");
        while (input.hasNextInt() ) {
            inputNumber = input.nextInt();


            System.out.println("Numrat e dhene nga perdoruesi jane : " + inputNumber );
            if (inputNumber > 9) {
                shuma += inputNumber;
            }
            System.out.println("Vendosni nje simbol ose karakter tjeter ndryshe nga numrat nese nuk deshironi te vazhdoni");
            System.out.println("Shuma e numrave me te medhenj se 10 te dhene nga perdoresi eshte : " + shuma);

        }
        System.out.println("Perfundoi procesi i leximit te numrave");

    }


    /**
     * 6. Duke u bazuar në programin e Java Bootcamp 2022, kërkoni nga useri që tju japë numrin e seancës
     * dhe në bazë të tij printoni në console temën që do të trajtohet në atë seancë.
     * Nëse numri i dhënë nuk përfshihet në totalin e seancave, printoni mesazhin:
     * "Moduli i parë nuk përmban një temë për seancën që ju kërkuat!"
     */
    public void switchSeancat() {
        int n = input.nextInt();

        switch (n) {
            case 1:
                System.out.println("Seanca 1");
                break;
            case 2:
                System.out.println("Seanca 2");
                break;
            case 3:
                System.out.println("Seanca 3");
                break;
            default:
                System.out.println("Moduli i parë nuk përmban një temë për seancën që ju kërkuat!");

        }
    }


    public static void numratSeri(){
        double shumaSerise = 0;
        for(double i=0.25 ; i > (i/1605); i = i * i ){
            shumaSerise = 1 + (1/i);
        }
        System.out.println("Shuma e serise eshte : " + shumaSerise);
    }


    public static void main(String[] args) {
        //shumaNumraveTekDheCift();
        // rreshtatMe5yje();
        //rightTriangle(5);

       /* Seanca3 ushtrimi3 = new Seanca3();

        //ushtrimi3.numratEdheneNgaPerdoruesi();
        System.out.println("Jepni numrin : ");
        ushtrimi3.switchSeancat();*/

        // Ushtrimi 5 kerkesa b
        /*int i, j;
        for (i = 0; i < 9; i = i + 2) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        // ushtrimi 5 kerkesa c
        int x, y;

        for (x = 0; x < 6; x++) {
            for (y = 6 - x; y > 1; y--) {
                System.out.print(" ");
            }
            for (y = 0; y <= x; y++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        //8. Shkruaj një program që lexon emrin e përdoruesit dhe afishon në console emrin e tij mbrapsht,
        // psh nëse emri i përdoruesit është Amir, të printohet në console "rimA"

        /**System.out.println("Vendosni emrin:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String mbrapsht = "";


        for(int i = str.length() - 1; i >= 0; i--)
        {
            mbrapsht = mbrapsht + str.charAt(i);
        }

        System.out.println("Emri mbrapsht eshte:" + mbrapsht);*/

       //10. Shkruaj një program që kërkon nga përdoruesi dy numra të plotë.
        // Krijon një metodë që kalon si parametra këto dy numra
        // dhe brenda saj llogarit numrin e parë në fuqi të numrit të dytë.
        /*int numer1, fuqia, rezulatati = 1;
       Scanner numratEperdoruesit = new Scanner(System.in);
        System.out.println("Vendosni numrin e pare : " );

         numer1 = numratEperdoruesit.nextInt();
        System.out.println("Vendosni numrin e fuqise : ");
         fuqia = numratEperdoruesit.nextInt();

        for(int i = 1; i <= fuqia ;i++){
            rezulatati = rezulatati * numer1;

        }
        System.out.println("Rezultati i fuqise i dhene si numer 2 nga perdoruesi eshte : " + rezulatati);*/

        int numerInt;
        double numerDouble;
        double shuma;
        Scanner numratEperdoruesit = new Scanner(System.in);
        String answer = "Po";
       do {
           System.out.println("Jepni numrin Int : ");

           numerInt = numratEperdoruesit.nextInt();
           System.out.println("Numri Int eshte : " + numerInt);
           System.out.println("Jepni numrin double : ");
           numerDouble = numratEperdoruesit.nextDouble();
           System.out.println("Numri double eshte : " + numerDouble);
           shuma = numerInt + numerDouble;
           System.out.println("Shuma e numrave te dhene nga perdoruesi eshte : " + shuma);
           System.out.println("Doni te jepni me numra? Po/Jo ");
           answer = numratEperdoruesit.next();

       }
       while(answer.equals("Po"));
        System.out.println("Faleminderit");


    }
}

