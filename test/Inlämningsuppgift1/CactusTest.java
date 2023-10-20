package Inlämningsuppgift1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sprint1.Inlämningsuppgift1.Cactus;
import sprint1.Inlämningsuppgift1.Guest;

class CactusTest {

    Cactus c = new Cactus(Guest.IGGE,0.2);

    @Test
    void amountOfLiquid() {
        double expectedAmountOfLiquid = 2;
        double actualAmountOfLiquid = c.amountOfLiquid();
        Assertions.assertEquals(expectedAmountOfLiquid, actualAmountOfLiquid);
    }
}