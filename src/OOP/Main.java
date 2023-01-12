package OOP;
import java.util.*;

public class Main {

    public static void main(String[] args){
        System.out.println("***** Klasa Boks *****");
        Boks boksiRi = new Boks("Samsung", 123);
        Boks boksiobjekt2 = new Boks();
        System.out.println("Objekti 1: volume " + boksiRi.ngrejVolumin());// volume = 1;
        System.out.println("Objekti 1: volume " + boksiRi.ngrejVolumin());// volume = 2;
        System.out.println("Objekti 1: volume " + boksiRi.ngrejVolumin());// volume = 3;
        System.out.println("Objekti 1: volume " + boksiRi.ngrejVolumin());// volume = 4;
        System.out.println("Objekti 1: volume " + boksiRi.ngrejVolumin());// volume = 5;
        System.out.println("Objekti 1: volume " + boksiRi.ulVolumin());// volume = 4;
        System.out.println("Objekti 2: volume " + boksiobjekt2.ngrejVolumin());// volume = 1
        System.out.println("Objekti 2: volume " + boksiobjekt2.ulVolumin());// volume = 0
        System.out.println("Objekti 2: volume " + boksiobjekt2.ulVolumin());// volume= 0;
        boksiobjekt2.getVolumi();
        boksiobjekt2.setMarka("Apple");
        System.out.println("-------------------------------");
        System.out.println("***** Klasa laps *****");

        Laps lapsRi = new Laps("kuqe", 345);
        Laps lapsiObjekt2 = new Laps(678);
        System.out.println(lapsRi.shkruan());
        System.out.println(lapsRi.nukShkruan());
        System.out.println(lapsiObjekt2.getNgjyra());
         lapsiObjekt2.setNgjyra("jeshile");
        System.out.println(lapsiObjekt2.ngjyra);
        System.out.println("-------------------------------");
        System.out.println("***** Klasa Celsa *****");
        Celsa celsatEshpise = new Celsa("KALE");
        Celsa celsatEzyres = new Celsa(372447, "ITALY");

        celsatEshpise.hapDeren();
        celsatEzyres.mbyllDeren();
        System.out.println("-------------------------------");
        System.out.println("***** Klasa Fletore *****");
        Fletore fletoreObjekt = new Fletore("kuadrate", 45);
        Fletore fletoreObjekt2 = new Fletore(45);
        fletoreObjekt.shkruaj("kuadrate");
        Scanner input = new Scanner(System.in);
        System.out.println("Shkruani 'PO' ose 'JO' ");
        String inputi = input.next();

        if(inputi.equals("PO")){
            Fletore.grisFletoren(true);

        }
        else{
            Fletore.grisFletoren(false);
        }
        System.out.println("-------------------------------");
        System.out.println("***** Klasa ShisheUji *****");
        ShisheUji shisheUjiobjekt = new ShisheUji(0.5);
        ShisheUji shisheUjiobjekt2 = new ShisheUji();
        shisheUjiobjekt2.hedhShishen();
        shisheUjiobjekt2.piUje();
        shisheUjiobjekt2.setKompania("Glina");
        System.out.println(shisheUjiobjekt2.getKompania());



    }
}
