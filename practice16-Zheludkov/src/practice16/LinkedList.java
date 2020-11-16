package practice16;

public class LinkedList<E> im {

    class Node {
        E value;
        Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    Node first, last;
    int size;

    public LinkedList() {
        size = 0;
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
            last.next = new Node(object);
            last = last.next;
        }
        size++;
        return true;
    }

    public boolean remove(E delValue){
        Node current = first;
        if(first == null)
            return false;
        else if(first.value ==delValue){
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

}
