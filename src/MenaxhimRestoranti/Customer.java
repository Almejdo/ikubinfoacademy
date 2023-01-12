package MenaxhimRestoranti;

public class Customer extends Order  {
    private String name;
    Dish dish;



    public Customer(String name, Dish dish){
   this.name = name;
   setDish(dish);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return " " +this.name;
    }
}
