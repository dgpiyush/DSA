package B_LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList l =new LinkedList();

        l.print();
       
       l.addFirst(50);
       l.addFirst(10);
       l.addFirst(20);
       l.addFirst(30);
       l.addFirst(40);

       System.out.println("before");
       l.print();
       l.reverse();
       l.addFirst(438);
       System.out.println();
       System.out.println("after");
       l.print();

        
        
       
        
        
    }
}
