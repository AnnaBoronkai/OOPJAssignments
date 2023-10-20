package sprint1.Inlämningsuppgift1;

public class CarnivorousPlant extends Plant implements Liquid {

    //Dessa variabler är privata eftersom de inte behöver vara tillgängliga utanför klassen
    private static final double BASE_LEVEL_LIQUID_IN_DECILITERS = 0.1 * 10;
    private static final double LIQUID_PER_HEIGHT_IN_DECILITERS = 0.2 * 10;
    private static final String TYPE_OF_LIQUID = "proteindryck";

    public CarnivorousPlant(Guest name, double height) {
        super(name, height);
    }

    //metoderna amountOfLiquid() och typeOfLiquid()är exempel på polymorfism
    @Override
    public double amountOfLiquid() {
        double height = getHeight();
        double requiredAmountOfLiquid = (LIQUID_PER_HEIGHT_IN_DECILITERS * height) + BASE_LEVEL_LIQUID_IN_DECILITERS;
        return requiredAmountOfLiquid;
    }

    @Override
    public String typeOfLiquid() {
        return TYPE_OF_LIQUID;
    }
}
