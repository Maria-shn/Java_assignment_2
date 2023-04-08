import java.lang.reflect.Array;
import java.util.Arrays;
public class Heap<T extends Comparable<T>>  {
    private T[] heap ;
    private int max ; //index of last element in the array
    final static int firstSize = 1;

    public Heap(){
        this.heap = (T[]) Array.newInstance(Comparable.class, firstSize);
        this.max = 0;
    }

    public Heap(int n){
        this.heap = (T[]) Array.newInstance(Comparable.class, n);
        this.max = 0;  
    }

    /** adds t to the array. Elements will be added from index 1,
     *  meaning the cell with index 0 will remain always empty
     */

    public void add(T t) {
        if(this.max +1 != this.heap.length){
            percUp(this.max+1, t, this.heap);
            }
        else{
            Heap<T> bigHeap = new Heap(this.heap.length*2);
            for (int i = 1; i< this.heap.length; i++){
                bigHeap.heap[i] = this.heap[i];
            }
            percUp(this.max+1, t, bigHeap.heap);
            this.heap = bigHeap.heap;
        }this.max +=1;

        }
    
    /**
     * adds t to its proper position in the array
     * @param index
     * @param t
     * @param arr
     */
    public void percUp(int index, T t, T[] arr){
        int parInd = (int) (index/2);
        if(index ==1){
            arr[index] = t;
        }
        else if(t.compareTo(arr[parInd])<0){
            arr[index] = t;
        }
        else{
            arr[index] = arr[parInd];
            percUp(parInd, t, arr);
        }

    }

    /**
     * Returns and removes the first / highest priority element.
     * @return element of highest priority
     */

    /**public T get(){
        if (this.max == 0){
            throw new IllegalStateException();
        } else{
            T toRemove = this.heap[1];
        
        }
        */
    }

   
     



    

}
