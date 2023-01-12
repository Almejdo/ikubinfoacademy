package UshtNEKlase;

public class Llogaria {
    private double balanca;

    public Llogaria(){
        this(200);

    }

    public Llogaria(double balanca){
        this.balanca = balanca;
    }

    public void depozitim(double depozita){
        if(depozita < 0){
            System.out.println("Nuk lejohet depozitimi shumave negative");
        }
        else{
            this.balanca += depozita;
        }

    }

    public void terheqje(int terheqje){
        if(terheqje > this.balanca){
            System.out.println("Shuma per tu terhequr eshte me e madhe se balanca");
        }
        else{
            this.balanca -= terheqje;
        }
    }

    public void setBalanca(double balance){
        this.balanca = balance;
    }

    public double getBalanca(){
        return this.balanca;
    }
}