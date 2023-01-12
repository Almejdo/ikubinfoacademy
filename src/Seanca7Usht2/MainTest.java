package Seanca7Usht2;

public class MainTest {

    public static void main(String[] args){
        Rreth r1 = new Rreth();
        Rreth r2 = new Rreth(1.3,"kuqe");
        System.out.println(r2.siperfaqjaRrethit());
        System.out.println(r2.getNgjyra() + " " + r2.getRreze());
        r1.setRreze(2);
        r1.setNgjyra("jeshile");
        System.out.println(r1.getRreze() + " " + r1.getNgjyra() );
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("--------------------------");
        Cilinder c1 = new Cilinder();
        Cilinder c2 = new Cilinder(3,2.1,"zeze");
        System.out.println(c2.vellimiCilindrit());
        System.out.println(c2.getLartesi() + " " + c2.getRreze() + " " + c2.getNgjyra());
        System.out.println(c1);
        System.out.println(c2);
    }
}
