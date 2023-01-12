package ArrayListsUsht;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        b.add(3);
        b.add(4);

        Main objct = new Main();
        objct.concatente(a,b);


    }

    public List<Integer> concatente(List<Integer> a, List<Integer> b){
        for(Integer number : b){
            a.add(number);
        }


        for(Integer number1 : a){
            System.out.println(number1);
        }
        return  a;
    }


}
