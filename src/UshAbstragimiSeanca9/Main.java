package UshAbstragimiSeanca9;

public class Main {

    public static void main(String[] args){
        SasiaEKarbonit ndertese = new Ndertese();
        SasiaEKarbonit makine = new Makine();
        SasiaEKarbonit biciklete = new Biciklete();

        System.out.println(ndertese.getCarbonEmission());
        System.out.println(makine.getCarbonEmission());
        System.out.println(biciklete.getCarbonEmission());




        Banke banke1 = new Banke("Miri", 3526,0627247,345.3);
        Banke banke2 = new Banke("Liri", 1234,0246246,54.2);

        banke1.commission(32);
        banke1.withdraw(23);
        System.out.println(banke1);
        System.out.println("--------------------");
        banke2.commission(13);
        banke2.withdraw(15);
        System.out.println(banke2);
    }
}
