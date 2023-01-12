package MenaxhimRestoranti;

public class Order  {


    Dish dish;
    Customer customer;

    public Order(Dish dish, Customer customer){
        this.dish = dish;
        this.customer = customer;

    }
    public Order(){

    }



    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }



    public String toString(){
        return this.customer + " has ordered " + this.dish;
    }
}
