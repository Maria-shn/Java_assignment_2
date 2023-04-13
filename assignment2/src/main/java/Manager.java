public class Manager <T extends Comparable<T>> {

    private Heap<T> heap;
    private Queue<T> queue;
    private int size;

    public Manager(){
        this.heap = new Heap();
        this.queue = new Queue();
        this.size = 0;
    }

    /**
     * adds element t to the system.  
     * @param t
     */

    public void add(T t) {
        this.heap.add(t);
        this.queue.add(t);
        this.size +=1;
    }

    /**
     * @return the element with the earliest creation time 
     * and removes it from the system. 
     */
    
    public T getByCreationTime(){
        T t = this.queue.get();
        this.heap.remove(t);
        this.size -=1;
        return t;
    }

    /**
     * returns the element with the highest priority and removes it from the system. 
     * @return
     */

    public T getByPriority(){
        T t = this.heap.get();
        this.queue.remove(t);
        this.size -=1;
        return t;
    }

    public int getSize(){
        return this.size;
    }
}