package practice16;


public class Test {
    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        test.add(1);
        test.add(2);
        test.add(20);
        test.add(32);
        test.viewList();

        System.out.println("List after remove:");
        test.remove(20);
        test.add(23);
        test.add(10);
        test.add(89);
        test.viewList();

        System.out.println("Last element:"+test.last.value);
        System.out.println("Last.prev:"+test.last.prev.value);
        System.out.println("Last.next:" + test.last.next.value);

        test.add(111);

        System.out.println("Last element after add:"+test.last.value);
        System.out.println("Last.prev after add:"+test.last.prev.value);
        System.out.println("Last.next after add:" + test.last.next.value);
    }

}
