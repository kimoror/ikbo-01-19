package pracitce8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedQueue<E> content;

    public WaitList(){
        this.content = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> c){
        this.content = new ConcurrentLinkedQueue<>(c);
    }

    @Override
    public void add(E element) {
        if(element != null)
            content.add(element);
        else{
            System.out.println("Object is null");
            return;
        }
    }

    @Override
    public E remove() {
        content.remove();
        return null;
    }

    @Override
    public boolean contains(E element) {
        if(content.contains(element))
            return true;
        return false;
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        if(content.containsAll(c))
            return true;
        return false;
    }

    @Override
    public boolean isEmpty() {
        if(content.isEmpty())
            return true;
        return false;
    }

    @Override
    public String toString(){
        return content.toString();
    }
}
