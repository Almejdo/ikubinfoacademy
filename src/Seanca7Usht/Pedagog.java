package Seanca7Usht;

public class Pedagog {
    private int paga;
    private int nrLendesh;

    public int getNrLendesh() {
        return nrLendesh;
    }

    public void setNrLendesh(int nrLendesh) {
        this.nrLendesh = nrLendesh;
    }
    public void setPaga(int paga) {
        this.paga = paga;
    }

    public int getPaga() {
        return paga;
    }
    public String toString(){
        return nrLendesh + " " + paga;
    }
}
