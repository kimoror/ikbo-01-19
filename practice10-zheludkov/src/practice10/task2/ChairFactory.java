package practice10.task2;

public class ChairFactory implements AbstactChairFactory{

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(5);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
