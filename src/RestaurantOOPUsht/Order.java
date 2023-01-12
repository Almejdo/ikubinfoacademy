package RestaurantOOPUsht;

public class Order {
    private static int id = 0;
    private final Customer customer;
    private final Dish[] dish;
    private int orderId;
    private int i = 0;

    public Order(Customer customer) {
        this.customer = customer;
        this.dish = new Dish[3];
        id++;
        this.orderId = id;
    }


    public void addDish(Dish dish) {
        if (i < 3) {
            this.dish[this.i] = dish;
            i++;
        } else {
            System.out.println("Nuk mund te japesh me shume dish");
        }

    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Dish[] getDish() {
        return dish;
    }

    public Customer getCustomer() {
        return customer;
    }


    @Override
    public String toString() {
        return "id e dishit eshte " + id + " disht jane " + printoDishes(this.dish);

    }

    public String printoDishes(Dish[] dish) {
        String emer = " ";

        for (int i = 0; i < dish.length; i++) {
            emer += dish[i].getEmer() + " ";

        }
        return emer;

    }
}
