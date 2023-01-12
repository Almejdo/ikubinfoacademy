package RestaurantOOPUsht;

public class Customer {

    private String emer;
    private String mbiemer;
    private String id;
    private String email;

    private Order[] orders;

    public Customer(String emer, String mbiemer, String id, String email) {
        this.emer = emer;
        this.mbiemer = mbiemer;
        this.id = id;
        this.email = email;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public String getMbiemer() {
        return mbiemer;
    }

    public void setMbiemer(String mbiemer) {
        this.mbiemer = mbiemer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

