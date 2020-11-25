package practice9.SecondTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[10];
        Scanner sc = new Scanner(System.in);

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

        //поиск
        System.out.print("Please input serach`s Name: ");
        String searchName = sc.nextLine();
        System.out.print("Please input serach`s Last name: ");
        String searchLastName = sc.nextLine();
        boolean searchFlag = true;
        for(Student it : student){
            if(it.searchByFIO(searchName, searchLastName) == true){
                System.out.println("Search student`s id: " + it.getiDNumber());
                searchFlag = true;
                break;
            }
            else
                searchFlag = false;
        }
        if(searchFlag == false)
            throw new InvalidFIOException("Student doesn`t exist");
        //сортировка
        Sorting.insertionSort(student);
        for(Student it : student){
            System.out.println(it.toString());
        }
    }
}
