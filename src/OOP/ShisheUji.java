package OOP;

public class ShisheUji {
    private String kompania;
    private double vellimi;

    public ShisheUji(){

    }
    public ShisheUji( String cilaKompani, double vellimiTij, String lloji){

        System.out.println("Shishja eshte nga " + cilaKompani + " kompani dhe lloji eshte: " + lloji +" " +  vellimiTij+"L");
    }
    public ShisheUji(double vellimi){
        this("Spring",0.5, "gazuar");
        this.vellimi = vellimi;
    }

    public static void piUje(){
        System.out.println("Uji ndodhet ne sportel.");

    }
    public static void hedhShishen(){
        System.out.println("Koshi ndodhet ne katin e pare!");

    }

    public void setKompania(String kompania){
        this.kompania = kompania;
    }
    public String getKompania(){
        return this.kompania;
    }
}
