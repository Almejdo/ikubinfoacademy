package Seanca7Usht3;

public class Rreth extends PerimetriSiperfaqja{

    private double rrezja;



    public Rreth(double rrezja) {
        this.rrezja = rrezja;
        this.siperfaqja = Math.PI * (rrezja * rrezja);
        this.perimetri = 2 * Math.PI * rrezja;

    }

    public String toString(){
          return "Rreth [rrezja =" + this.rrezja +  ", siperfaqja=" + siperfaqja + ", perimetri=" + perimetri;
    }
}

