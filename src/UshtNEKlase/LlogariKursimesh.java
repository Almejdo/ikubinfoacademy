package UshtNEKlase;

public class LlogariKursimesh extends Llogaria {
    private double interesi;

    public LlogariKursimesh(int shuma){
        super(shuma);
    }

    public double interesi(double interes){
        this.interesi =super.getBalanca() * interes;
        double balancaMeInteres = super.getBalanca() + this.interesi;
        super.setBalanca(balancaMeInteres);
        return balancaMeInteres;
    }

    public void setInteresi(int interesiVlera){
        this.interesi = interesiVlera;
    }

    public double getInteresi(){
        return this.interesi;
    }
}
