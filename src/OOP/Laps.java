package OOP;

public class Laps {
     String ngjyra;
    private int seria;


    public Laps(){
this.ngjyra = "blu";
    }

    public Laps(int seria){
        this.seria = seria;
        System.out.println("Lapsi ka seri: " + seria);

    }
    public Laps(String ngjyra, int seria){
        this(45);
        this.ngjyra = ngjyra;
        this.seria = seria;
        System.out.println("Lapsi ka ngjyre: " + ngjyra + " dhe seri: " + seria);
    }

    public  boolean shkruan(){
        return true;

    }
    public boolean nukShkruan(){
        return false;
    }
    public  void setNgjyra(String ngjyraLapsit){
        this.ngjyra = ngjyraLapsit;
    }
    public String  getNgjyra(){
        return this.ngjyra;

}



}
