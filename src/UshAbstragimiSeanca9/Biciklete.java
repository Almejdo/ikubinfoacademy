package UshAbstragimiSeanca9;

public class Biciklete implements SasiaEKarbonit{

    private int NrRrotash;
    private String markeBiciklete;

    public Biciklete(){

    }

    public int getNrRrotash() {
        return NrRrotash;
    }

    public void setNrRrotash(int nrRrotash) {
        NrRrotash = nrRrotash;
    }

    public String getMarkeBiciklete() {
        return markeBiciklete;
    }

    public void setMarkeBiciklete(String markeBiciklete) {
        this.markeBiciklete = markeBiciklete;
    }

    @Override
    public double getCarbonEmission() {
        return 0;
    }
}
