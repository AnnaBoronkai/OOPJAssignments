package sprint1.Inlämningsuppgift1;

public class Cactus extends Plant implements Liquid {

    //Dessa variabler är privata eftersom de inte behöver vara tillgängliga utanför klassen
    private static final double LIQUID_IN_CENTILITERS = 0.02 * 100;
    private static final String TYPE_OF_LIQUID = "mineralvatten";

    public Cactus(Guest name, double height){
        super(name, height);
    }


    //metoderna amountOfLiquid() och typeOfLiquid()är exempel på polymorfism
    @Override
    public double amountOfLiquid() {
        return LIQUID_IN_CENTILITERS;
    }

    @Override
    public String typeOfLiquid() {
        return TYPE_OF_LIQUID;
    }
}
