public class Manager <T extends Comparable<T>> {

    private Heap<T> heap;
    private Queue<T> queue;

    public Manager(){
        this.heap = new Heap();
        this.queue = new Queue();
    }

    /**
     * adds element t to the system.  
     * @param t
     */

    public void add(T t) {
        this.heap.add(t);
        this.queue.add(t);
    }

    /**
     * @return the element with the earliest creation time 
     * and removes it from the system. 
     */
    
    public T getByCreationTime(){
        T t = this.queue.get();
        this.heap.remove(t);
        return t;
    }

    /**
     * returns the element with the highest priority and removes it from the system. 
     * @return
     */

    public T getByPriority(){
        T t = this.heap.get();
        this.queue.remove(t);
        return t;
    }
}
   

