package practice10.task2;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        client.setChair(new ChairFactory().createFunctionalChair());
        client.sit();
        client.setChair(new ChairFactory().createMagicChair());
        client.sit();
        client.setChair(new ChairFactory().createVictorianChair());
        client.sit();

    }
}
