package UshtrimeSeanca2;


public class Libri {

    private String titulli;
    private int nrFaqe;
    private double cmimi;
    private Autori autor;

    public Libri() {
    }

    public Libri(String titulli, int nrFaqe) {
        this.titulli = titulli;
        this.nrFaqe = nrFaqe;
    }

    public Libri(String titulli, int nrFaqe, double cmimi, Autori autori) {
        this(titulli, nrFaqe);
        this.cmimi = cmimi;
        this.autor = autori;
    }

    public String getTitulli() {
        return this.titulli;
    }

    public void setTitulli(String a) {
        this.titulli = a;
    }

    public int getNrFaqe() {
        return this.nrFaqe;
    }

    public void setNrFaqe(int b) {
        this.nrFaqe = b;
    }

    public double getCmimi() {
        return this.cmimi;
    }

    public void setCmimi(double c) {
        this.cmimi = c;
    }

    public Autori getAutor() {
        return this.autor;
    }

    public void setAutor(Autori a) {
        this.autor = a;
    }

    public void lexoTitull(){
        System.out.println("Titulli i librit eshte"+getTitulli());
    }
    public void tregoCmim(){
        System.out.println("Cmimi i librit eshte" +getCmimi());
    }

    public String toString(){
        return this.titulli +" "+ this.cmimi +" "+ this.nrFaqe +" "+ this.autor;

    }



}