package OOP;

public class Fletore {

    private String tipi;
    private int nrFaqeve;

    public Fletore(){

    }
    public Fletore(String type, int faqet){
        this(faqet);

    }
    public Fletore(int Numrifaqeve){
        this.nrFaqeve = Numrifaqeve;
        System.out.println("Fletorja ka "+ nrFaqeve + " nr faqesh.");
    }

    public static void shkruaj(String tipi){

        System.out.println("Une shkruaj ne nje fletore me " + tipi);

    }
    public static void grisFletoren(boolean veprimi){
        if(veprimi){
            System.out.println("Gris Fletoren!");
        }
        else{
            System.out.println("Nuk e gris Fletoren");
        }



        }
    public  void setTipi(String tipiFletores){
       this.tipi = tipiFletores;

    }
    public int getNrFaqeve(){
        return this.nrFaqeve;
    }

}
