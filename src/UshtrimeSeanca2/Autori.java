package UshtrimeSeanca2;


public class Autori {

    private String emri;
    private String mbiemri;
    private int mosha;
    private String email;

    public Autori(String emri, String mbiemri, int mosha, String email) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.mosha = mosha;
        this.email = email;
    }

    public String getEmri() {

        return emri;
    }

    public void setEmri(String emri) {

        this.emri = emri;
    }

    public String getMbiemri() {

        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {

        this.mbiemri = mbiemri;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return this.emri + " " + this.mbiemri ;
    }
}
