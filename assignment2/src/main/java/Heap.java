import java.lang.reflect.Array;
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

    public void add(T t) {
        if(this.max != this.size){
            percUp(max+1, t, this.heap);
            this.max +=1;
            }
        else{
            Heap<T> bigHeap = new Heap(size*2);
            int i =0;
            
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

    /**
     * when there is no space left in the current array percdown will copy the current array to the emptyArr 
     * and add t to the right position
     * TO BE FINISHED
     */

     public void percDown(int index, T t, T[] arr, T[] emptyArr){
        if(t.compareTo(arr[index])>0){
            emptyArr[index] = t;

        }
     }



    

}
