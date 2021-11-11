package A_Array;

public class Main {

    public static void main(String[] args) {
        
    
        DArray a=new DArray(3);
        a.insert(5);
        a.insert(4);
        a.insert(6);
        a.insert(3);
        a.insert(3);
        a.insert(2);
        a.insert(6);
        a.print();
        System.err.println(" Length of the Array "+a.len());

    }
    
}
