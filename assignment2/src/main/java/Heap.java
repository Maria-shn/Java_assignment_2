import java.lang.reflect.Array;
public class Heap<T extends Comparable<T>>  {
    private T[] heap ;
    private int size ; //shows size of the array
    private int max ; //index of last element in the array
    final static int firstSize = 1;

    public Heap(){
        this.heap = (T[]) Array.newInstance(Comparable.class, firstSize);
        this.max = 0;
        this.size = 1;
    }

    public Heap(int n){
        this.heap = (T[]) Array.newInstance(Comparable.class, n);
        this.max = 0;
        this.size = n;    
    }

    public void add(T t) {
        if(this.max != this.size){
            int index = max+1;
            heap[index] = t;
            while(heap[index].compareTo(heap[index/2])>0){
                

            }

        }
    }

}
