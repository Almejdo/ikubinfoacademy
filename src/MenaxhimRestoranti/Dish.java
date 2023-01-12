package MenaxhimRestoranti;

public class Dish {
    private String dishName;
    private int price;


    public Dish(){

    }

    public Dish(String dishName, int price){
        this.dishName = dishName;
        this.price = price;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString(){
        return this.dishName + ": " + this.price+"$";
    }
}
