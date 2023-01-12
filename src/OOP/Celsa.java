package OOP;

public class Celsa {
    private int seria;
    private String marka;

    public Celsa(){

    }
    public Celsa(String marka){
        this(61723, "KALE");
        System.out.println("Konstruktori i pare ka marke " + marka);

    }
    public Celsa(int seria, String markaCelsit){
        this.seria = seria;
        this.marka = markaCelsit;
        System.out.println("Konstruktori dyte ka seri: " + seria + " dhe marke: " + marka);

    }

    public static void hapDeren(){
        System.out.println("Dera u hap");
    }
    public static void mbyllDeren(){
        System.out.println("Dera u mbyll");
    }

    public int getSeria(){
    return this.seria;
    }

    public void setSeria(int seriaRe){
        this.seria = seriaRe;
    }
}
