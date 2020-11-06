package task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractQueue<E> implements Queue <E> {
    ArrayList<E> queue = new ArrayList<E>();

    public void enqueue(E element){
        queue.add(element);
    }

    public E element(E element){
        return queue.get(0);
    }

    public E dequeue(){
        return queue.remove(0);
    }

    public int size(){
        return queue.size();
    }

    public boolean isEmpty(){
        return queue.size() == 0;
    }

    public void clear(){
        queue.clear();
    }
}
