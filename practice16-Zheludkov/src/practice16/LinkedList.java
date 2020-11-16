package practice16;

public class LinkedList<E> {

    class Node{
        E value;
        Node next;

        public Node(E value){
            this.value = value;
        }
    }

    private Node first, last;
    private int size;

    public LinkedList(){
        size = 0;
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

    public int getSize() {
        return size;
    }

}
