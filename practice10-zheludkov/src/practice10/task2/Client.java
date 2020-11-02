package practice10.task2;

public class Client implements Chair{
    Chair chair;
    public void sit(){
        System.out.println("Now the chair is busy!");
    }

    public void setChair(Chair chair){
        this.chair = chair;
    }

    public Chair getChair() {
        return chair;
    }
}
