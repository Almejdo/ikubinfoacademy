package UshAbstragimiSeanca9;

public class Makine implements SasiaEKarbonit{

    private int NrDyersh;
    private String marka;

    public Makine(){

    }

    public int getNrDyersh() {
        return NrDyersh;
    }

    public void setNrDyersh(int nrDyersh) {
        NrDyersh = nrDyersh;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public double getCarbonEmission() {
        return 20;
    }
}
