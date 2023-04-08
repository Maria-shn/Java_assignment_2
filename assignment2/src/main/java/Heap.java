import java.lang.reflect.Array;
import java.util.Arrays;
public class Heap<T extends Comparable<T>>  {
    private T[] heap ;
    private int size ; //shows size of the array
    private int max ; //index of last element in the array
    final static int firstSize = 1;

    public Heap(){
        this.heap = (T[]) Array.newInstance(Comparable.class, firstSize);
        this.size = 1;
        this.max = 0;
    }

    public Heap(int n){
        this.heap = (T[]) Array.newInstance(Comparable.class, n);
        this.size = n;
        this.max = 0;  
    }

    /** adds t to the array. Elements will be added from index 1,
     *  meaning the cell with index 0 will remain always empty
     */

    public void add(T t) {
        if(this.max +1 != this.size){
            percUp(this.max+1, t, this.heap);
            this.max +=1;
            }
        else{
            Heap<T> bigHeap = new Heap(size*2);
            for (int i = 1; i< this.size; i++){
                bigHeap.heap[i] = this.heap[i];
            }
           
            
        }

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

   
     



    

}
