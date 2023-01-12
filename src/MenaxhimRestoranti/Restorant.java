package MenaxhimRestoranti;

public class Restorant {



     Order order;
     Customer customer;
     Dish dish;


     public Restorant(Order order){

          this.order = order;

     }


     public Order getOrder() {
          return order;
     }

     public void setOrder(Order order) {

          this.order = order;
     }
    public void getCustomerOrder(Customer customer){
        System.out.println(customer + " has ordered: " + customer.getDish());
    }

    public String toString(){
          return "[ " + this.order +" ]";
    }
}


