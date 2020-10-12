package practice6.var1;

public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[10];

        student[0] = new Student(9, "Nikola", "Tigr");
        student[1] = new Student(4, "Fedor", "Dvinyatin");
        student[2] = new Student(7, "Aleksandr", "Makedonsky");
        student[3] = new Student(3, "Mikhail", "Kurskiy");
        student[4] = new Student(2, "Leha", "Vikhinsky");
        student[5] = new Student(8, "Elena", "Mirnaya");
        student[6] = new Student(1, "Olya", "Vechnaya");
        student[7] = new Student(5, "Diana", "Prostaya");
        student[8] = new Student(6, "Danila", "Perviy");
        student[9] = new Student(0, "Theodor", "Moskovsky");

        Sorting.insertionSort(student);
        for(Student i: student){
            System.out.println(i.toString());
        }
    }
}
