package MenaxhimRestoranti;

public class Main {

    public static void main(String[] args){


        Dish dish = new Dish("Beef",30);
        Customer customer = new Customer("Miri",dish);
        Order order = new Order(dish,customer);
        Restorant restornat = new Restorant(order);
        System.out.println(restornat);


        Dish dish2 = new Dish("Chicken",32);
        Customer customer2 = new Customer("Liri",dish2);
        Order order2 = new Order(dish2,customer2);
        Restorant restornat2 = new Restorant(order2);


        restornat.getCustomerOrder(customer2);


    }
}
