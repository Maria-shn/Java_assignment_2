import java.util.LinkedList;
/**
 * implements FIFO using a node-based linkedlist
 */
public class Queue <T> {
    private LinkedList<T> queue ; 
     /**
     * A standard constructor for the Queue class
     *
     * @param queue - creates an empty linkedlist
     */
     public Queue(){
        this.queue = new LinkedList<T>();
    }

    /**
     * Adds t to the data structure
     * @param t
     */
    public void add(T t){
        this.queue.add(t);
    }

     /**
     * Returns and removes the first element.
     * @return first element in the list
     */
    public T get(){
        if(this.queue.isEmpty()){
            return null;
        }
        T toRemove = this.queue.getFirst();
        this.queue.removeFirst();
        return toRemove;
    }

    /**
     * Removes an element equal to t from the data structure, if exists.
     *  if multiple elements exist, remove first one.
     * @param t
     */

    public void remove(T t){
        this.queue.remove(t);
    }
}
