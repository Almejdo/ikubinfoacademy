package UshtNEKlase;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Vendosni depoziten: ");
        Llogaria llogaria = new Llogaria();
        llogaria.depozitim(input.nextDouble());
        System.out.println(llogaria.getBalanca());

        System.out.println("-------------------------------");


        LlogariKursimesh llogariKursimesh = new LlogariKursimesh(200);
        System.out.println(llogariKursimesh.interesi(0.30));
        System.out.println(llogariKursimesh.getInteresi());

        System.out.println("-----------------------------");


        LlogariCasti llogariCasti = new LlogariCasti(200);

        double vleraMbetur = llogariCasti.terhiqShumen(300);
        System.out.println("Vlera e mbetur eshte: " + vleraMbetur);
        System.out.println("Shuma e OverDraftit eshte: " + llogariCasti.getLimitOverdrafti());














    }





}
