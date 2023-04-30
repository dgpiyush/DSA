package B_LinkedList;


import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class LinkedList {


    private class Node {
        private int value;
        private Node next;
        
        public Node(int item){
            this.value=item;
        }
    }
    
    private Node first;
    private Node last;
    private int size=0;


    public LinkedList(){
        
          System.out.println("Creating linked List");
    }

    //  check list is empty
    private boolean isEmpty(){
        if (first==null) {
            return true;
        } else {
            return false;
        }
    }

    // Add fist 
    public void addFirst(int item){
            var node =new Node(item);
            if (isEmpty()){
                first=last=node;
            }else{
                node.next=first;
                first=node;
            }
            size++;

    }
    
    // Add last 
    public void addLast(int item){
        var node=new Node(item);
        
        if(isEmpty()){
            first=last=node;
        }else{
            last.next=node;
            last=node;
        }
        size++;
    }
    
    // Add delete at First 
    public void deleteFirst(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }else{
            first=first.next;
            size--;
        }
    }
    
    // Add delete at last
    public void deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first== last){
            first = last=null;
            size=0;
            return;
        }
        Node pre=first;
        while (pre !=null){
            if(pre.next==last)break;
            pre=pre.next;
        }
        last=pre.next;
        pre.next=null;
        size--;

    }
    
    // check element exist
    public boolean contains(int item){
        boolean b=false;
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Node p=first;
        while(p !=null){
            if (p.value==item) {
                b=true;
                break;
            }
            p=p.next;
        }
        return b;


    }
    
    // check element index
    public int indexOf(int item){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        Node p=first;
        int index=0;
        boolean status=false;
        while (p.next !=null){
            if (p.value==item) {
                status=true;
                break;
            } 
            p=p.next;
            index++;

        }
        if(status) return index;
        return -1;
    }

    // check size of list
    public int size(){

    //    if(isEmpty()){
    //        return 0;
    //    } 
    //     int flag=1;
    //     Node p=first;
    //     while(p.next !=null){
    //         flag++;
    //         p=p.next;
    //     }
    //     return flag;
    return size;
    }

    // Reverse the list
    public void reverse(){
        Node p=null;
        Node c=first;
        Node n=null;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        first=p;
        
        
    }
    
    // Convert toArray
    public int[] toArray(){
        int[] arr=new int[size];
        Node p=first;
        int i=0;

        while (p.next !=null) {
            arr[i++]=p.value;
            p=p.next;
        }arr[size-1]=p.value;


        return arr;
    }

    // print list
    public void print(){
       Node p=first;
       if (isEmpty()) {
           System.out.println("Empty List");
           return;
       }
       while(p!=null){
        System.out.print(p.value+", ");
        p=p.next;

       }
   }

}
