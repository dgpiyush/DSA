package E_HashTable;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> A = new ArrayList<Integer>();

        A.add(2);
        A.add(3);
        A.add(2);
        A.add(4);
        A.add(2);

        System.out.println(map.get(2));

        for (int i = 0; i < A.size(); i++) {

            if (map.get(A.get(i)) != null) {

                map.put(A.get(i), map.get(A.get(i)) + 1);
                
            } else {
                map.put(A.get(i), 1);
            }
        }
        
        


    }
}
