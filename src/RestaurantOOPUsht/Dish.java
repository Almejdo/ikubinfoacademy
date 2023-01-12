package RestaurantOOPUsht;

public class Dish {

    private double cmimi;
    private String emer;

    public Dish (){

    }
    public Dish(double cmimi,String emer){
        this.cmimi=cmimi;
        this.emer=emer;
    }

    public double getCmimi() {
        return cmimi;
    }

    public void setCmimi(double cmimi) {
        this.cmimi = cmimi;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }
}


