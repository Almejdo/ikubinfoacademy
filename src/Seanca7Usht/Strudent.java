package Seanca7Usht;

public class Strudent extends Person {
    private int nrLendesh;
    private int mesatarja;

    public void setNrLendesh(int nrLendesh, int mesatarja){
        this.nrLendesh = nrLendesh;
        this.mesatarja = mesatarja;

    }

    public int getNrLendesh() {
        return nrLendesh;
    }

    public void setMesatarja(int mesatarja) {
        this.mesatarja = mesatarja;
    }

    public int getMesatarja() {
        return mesatarja;
    }

    public String toString(){
        return nrLendesh + " " + mesatarja;
    }
}
