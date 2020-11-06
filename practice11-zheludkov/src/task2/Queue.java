package task2;


public interface Queue<E> {
    E element();
    E poll();
    E peek();
}