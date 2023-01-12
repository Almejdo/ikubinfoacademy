package Seanca7Usht2;

public class Rreth {

   public double rreze;
    public String ngjyra;

    public Rreth(){
        this.rreze = 1;
        this.ngjyra = "blu";

    }
    public Rreth(double rreze, String ngjyra){
        this.rreze = rreze;
        this.ngjyra = ngjyra;
    }
    public void setNgjyra(String ngjyra){
        this.ngjyra = ngjyra;
    }
    public String getNgjyra(){
        return this.ngjyra;
    }

    public void setRreze(double rreze) {
        this.rreze = rreze;
    }

    public double getRreze() {
        return rreze;
    }

    public double siperfaqjaRrethit(){
        return Math.PI * this.rreze * this.rreze;

    }
    public String toString(){
        return rreze + " " + ngjyra;
    }
}
