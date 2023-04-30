package A_Array;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
    
        ArrayList a=new ArrayList<>();
        a.add(2);
        a.add("piyush");
        System.out.print(a);
        System.out.print(a.get(1).getClass().getSimpleName());
        System.out.print(a.get(0).getClass().getSimpleName());

    }
    
}
