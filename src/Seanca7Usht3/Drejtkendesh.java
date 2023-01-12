package Seanca7Usht3;


public class Drejtkendesh extends PerimetriSiperfaqja {

    private double brinja1;
    private double brinja2;

    public Drejtkendesh(double brinjaA, double brinjaB){
        this.brinja1 = brinjaA;
        this.brinja2 = brinjaB;
        this.siperfaqja = brinja1 * brinja2;
        this.perimetri = 2*(brinja1 * brinja2);

    }

    public String toString(){
        return "Drejkendesh [ brinja A=" + this.brinja1 + ", brinja B=" + this.brinja2 + ", siperfaqja=" + siperfaqja + ", perimetri=" + perimetri;
    }

}
