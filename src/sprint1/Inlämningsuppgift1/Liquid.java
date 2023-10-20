package sprint1.Inlämningsuppgift1;

public interface Liquid {

    // Metoderna amountOfLiquid() och typeOfLiquid()är exempel på polymorfism. Dessa metoder är abstrakta
    // i detta interface och implementeras på olika sätt i de olika klasserna Cactus, Palm och
    // CarnivorousPlant

    double amountOfLiquid();
    String typeOfLiquid();
}
