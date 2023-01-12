package Seanca7Usht;

public class Person {
    private String emer;
    private String adrese;

    public void setAdrese(String adrese) {
        this.adrese = adrese;
    }

    public String getAdrese() {
        return adrese;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }
    public String toString(){
        return emer + " " + adrese;
    }
}
