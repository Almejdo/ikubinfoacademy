package UshAbstragimiSeanca9;

public class Ndertese implements SasiaEKarbonit{

    private int NrKatesh;
    private int lartesi;

    public Ndertese(){

    }

    public int getNrKatesh() {
        return NrKatesh;
    }

    public void setNrKatesh(int nrKatesh) {
        NrKatesh = nrKatesh;
    }

    public int getLartesi() {
        return lartesi;
    }

    public void setLartesi(int lartesi) {
        this.lartesi = lartesi;
    }

    @Override
    public double getCarbonEmission() {
        return 50;
    }
}
