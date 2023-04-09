import java.lang.reflect.Array;
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
     * @param t
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

    public T get(){
        if (this.max == 0){
            throw new IllegalStateException();
        } else{
            T toRemove = this.heap[1];
            T percolate = this.heap[this.max];
            this.heap[this.max] = null;
            percDown(1, percolate, this.max, this.heap);
            return toRemove;

        
        }
        
    }

    public void percDown(int index, T t, int n, T[] arr){
        if(2*index > n){
            arr[index] = t;
        }else if(2*index==n){
            if(arr[2*index].compareTo(t)>0){
                arr[index] = arr[2*index];
                arr[2*index] = t;
            } else{
                arr[index] = t;
            }
        }else{
            int j = 2*index;
            if(arr[2*index].compareTo(arr[2*index+1])<0){
                j = 2*index +1;
            }
            if(arr[j].compareTo(t)>0){
                arr[index] = arr[j];
                percDown(j, t, n, arr);
            } else{
                arr[index] = t;
            }
        }
    }

    /**
     * Removes an element equal to t from the data structure, if exists. 
     * if multiple elements exist, remove the first one. 
     * @param t to be removed
     */

    public void remove(T t){
        int i = 1;
        while(this.heap[i]!= t || i<=this.max){
            i++;
        }
        if(i <=this.max){
            this.heap[i] = null;
            T percolate = this.heap[this.max];
            this.heap[this.max] = null;
            percDown(i, percolate, this.max, this.heap);
        }
    }

   
     



    

}
