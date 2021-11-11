package A_Array;

public class DArray {


    private int[] a;
    private int count=0;


    public DArray(int len){
        a=new int[len];
    }

    public void print(){

        for (int i = 0; i < count; i++) {
            System.out.println(a[i]);
        }
        // System.out.println(Arrays.toString(a));
    }

    public void insert(int value){

        if (count>=a.length) {
            extend(a);
            a[count]=value;
            count++;

        }else{
            a[count]=value;
            count++;
        } 
    }

    private void extend(int[] arr){
            a=new int[arr.length*2];

            for (int i = 0; i < arr.length; i++) {
                a[i]=arr[i];
            }
    }

    public int len(){
        return a.length;
    }
    
}
