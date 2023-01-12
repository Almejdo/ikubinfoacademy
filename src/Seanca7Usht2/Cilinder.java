package Seanca7Usht2;

public class Cilinder extends Rreth {
    private int lartesi;

    public Cilinder(){
        this.lartesi = 1;
        this.rreze = 1;
        this.ngjyra = "blu";
    }

    public Cilinder(int lartesi, double rreze, String ngjyra){
        this.lartesi = lartesi;
        this.rreze = rreze;
        this.ngjyra = ngjyra;

    }
    public void setLartesi(int lartesi){
        this.lartesi = lartesi;
    }

    public int getLartesi() {
        return lartesi;
    }

    public double vellimiCilindrit(){
        return Math.PI * rreze * rreze * lartesi;
    }
    public String toString(){
        return rreze + " " + ngjyra + " " + lartesi;
    }
}
