package sprint1.Inlämningsuppgift1;

public class Palm extends Plant implements Liquid {

    //Dessa variabler är privata eftersom de inte behöver vara tillgängliga utanför klassen
    private static final double LIQUID_PER_HEIGHT_IN_LITERS = 0.5;
    private static final String TYPE_OF_LIQUID = "kranvatten";

    public Palm(Guest name, double height){
        super(name, height);
    }

    //metoderna amountOfLiquid() och typeOfLiquid()är exempel på polymorfism
    @Override
    public double amountOfLiquid() {
        double height = getHeight();
        double requiredAmountOfLiquid = LIQUID_PER_HEIGHT_IN_LITERS * height;
        return requiredAmountOfLiquid;
    }

    @Override
    public String typeOfLiquid() {
        return TYPE_OF_LIQUID;
    }
}
