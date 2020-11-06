package task2;

import java.util.ArrayList;

public class ArrayListQ <E> implements Queue{
    ArrayList<E> queue = new ArrayList<E>();

    public void enqueue(E element){
        queue.add(element);
    }

    public E element(){
        return queue.get(0);
    }

    @Override
    public Object poll() {
        if (queue.isEmpty()) {
            return null;
        }

        E e = queue.get(0);
        queue.remove(0);
        return e;
    }

    @Override
    public Object peek() {
        return queue.isEmpty() ? null : queue.get(0);
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
