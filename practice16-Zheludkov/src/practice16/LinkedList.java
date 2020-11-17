package practice16;

import java.util.Collection;

public class LinkedList<E> {

    class Node {
        E value;
        Node next;
        Node prev;
        public Node(E value) {
            this.value = value;
        }
    }

    Node first, last;
    int size;

    public LinkedList() {
        size = 0;
    }

    public LinkedList(Collection<? extends E> c){
        addAll(c.size(), c);
    }

    public LinkedList(E[] itemArray){
        addAll(itemArray);
    }

    public void addAll(int index, Collection<? extends E> c){
        cmpIndexAndSize(index);
        for (E it: c) {
            add(it);
        }
    }

    public void addAll(E[] itemArray){
        cmpIndexAndSize(itemArray.length);
        for(int i = 0; i < itemArray.length; i++ ){
            add(itemArray[i]);
        }
    }

    public void cmpIndexAndSize(int index){
        if(!(index >= 0))
            throw new IndexOutOfBoundsException();
    }

    public boolean setFirst(E object) {
        first = new Node(object);
        return true;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public boolean add(E object){
        if(first == null){
            first =  new Node(object);
            last = first;
        }
        else{
            Node newNode = new Node(object);
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
            last.next = first;
        }
        size++;
        return true;
    }

    public boolean remove(E delValue){
        Node current = first;
        if(first == null)
            return false;
        else if(first.value == delValue){
            first = first.next;
            size--;
            return true;
        }

        for(int i = 0; i < size; i++){
            if(current.next.value == delValue){
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean removeAll(){
        first = null;
        return true;
    }

    public int getSize() {
        return size;
    }

    public boolean viewList(){
        if(first == null)
            return false;
        Node current = first;
        for(int i=0; i<size; i++){
            System.out.println(current.value);
            current = current.next;
        }
        return true;
    }

    public E[] toArray(){
        Object[] result = new Object[size];
        int j = 0;
        for(Node i = first; i != null; i = i.next){
            result[j++] = i.value;
        }
        return (E[])result;
    }

}
