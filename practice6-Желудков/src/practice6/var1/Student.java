package practice6.var1;

import java.lang.Comparable;
import java.lang.String;

public class Student implements Comparable{

    private int iDNumber;
    private String firstName;
    private String lastName;

    public Student(int iD, String fName, String lName) {
        this.iDNumber = iD;
        this.firstName = fName;
        this.lastName = lName;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Object o) {
        return ((Student)o).getiDNumber() -this.getiDNumber() ;
    }

    @Override
    public String toString(){
        return "id = " + this.getiDNumber() + "\n" +
                "first name = " + this.getFirstName() + "\n" +
                "last name = " + this.getLastName();
    }
}
