package Seanca7Usht;

public class Main {

    public static void main(String[] args){
     Person p1 = new Person();
     p1.setAdrese("Porcelan");
     p1.setEmer("Miri");
        System.out.println(p1.getAdrese() + " " + p1.getEmer());
        System.out.println(p1);
        System.out.println("----------------------");

        Strudent s1 = new Strudent();
        s1.setMesatarja(6);
        s1.setNrLendesh(13,7);
        System.out.println(s1.getMesatarja() + " " + s1.getNrLendesh());
        System.out.println(s1);
        System.out.println("-----------------------");

        Pedagog pd1 = new Pedagog();

        pd1.setNrLendesh(15);
        pd1.setPaga(1500);
        System.out.println(pd1);
        System.out.println(pd1.getNrLendesh() + " " + pd1.getPaga());
    }
}
