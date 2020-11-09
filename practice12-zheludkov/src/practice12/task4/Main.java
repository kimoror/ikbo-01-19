package practice12.task4;

public class Main {
    public static void main(String[] args) {
        StringBuilder line = new StringBuilder("+79104425423");
        StringBuilder line2 = new StringBuilder("89104425423");

        Number.translator(line);
        Number.translator(line2);

        System.out.println(line);
        System.out.println(line2);
    }
}
