package Seanca7Usht3;

public class Trekendesh extends PerimetriSiperfaqja{

    private int brinja1;
    private int brinja2;
    private int baze;
    private int lartesi;
    private String lloji;

    public Trekendesh(int brinja1, int brinja2,int baza, int lartesia,int tipi){
        this.brinja1 = brinja1;
        this.brinja2 = brinja2;
        this.baze = baza;
        this.lartesi = lartesia;
        this.siperfaqja = (baze * lartesia) / 2;
        this.perimetri = brinja1 + brinja2 + baze;
        if(tipi == 0){
            this.lloji = "DyBriNjeshem";
        }
        else if(tipi == 1){
            this.lloji = "KendDrejte";
        }
        else if(tipi == 2){
            this.lloji = "KendDrejte dhe DybrinjeNjeshem";
        }
        else{
            this.lloji = "I Crregullt";
        }

        switch (tipi){
            case 1:
                this.lloji = "DyBriNjeshem";
                break;
            case 2:
                this.lloji = "KendDrejte";
                break;
            case 3:
                this.lloji = "KendDrejte dhe DybrinjeNjeshem";
                break;
            default:
                this.lloji = "I Crregullt";

        }
    }


        public String toString(){
                return "Trekendesh [ brinja1=" + this.brinja1 + ", brinja2=" + this.brinja2 + ", baza="+this.baze + ", lartesia= " + this.lartesi + ", siperfaqja=" + siperfaqja + ", perimetri=" + perimetri + ", lloji="+this.lloji;
            }

}
