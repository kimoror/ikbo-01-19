package task2;

import java.util.LinkedList;

public class LinkedQueue<E> implements Queue<E>{
    LinkedList<E> queue = new LinkedList<E>();

    public void enqueue(E element){
        queue.addLast(element);
    }

    public E element(){
        return queue.getFirst();
    }

    @Override
    public E poll() {
        if (queue.isEmpty()) {
            return null;
        }

        E e = queue.getFirst();
        queue.remove(0);
        return e;
    }

    @Override
    public E peek() {
        return null;
    }

    public E dequeue(){
        return queue.isEmpty() ? null : queue.get(0);
    }

    public int size(){
        return queue.size();
    }

    public boolean isEmpty(){
        return queue.size() == 0;
    }

    public void clear(){
        while(!queue.isEmpty()){
            queue.removeFirst();
        }
    }
}
