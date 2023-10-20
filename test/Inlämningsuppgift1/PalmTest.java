package Inlämningsuppgift1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sprint1.Inlämningsuppgift1.Guest;
import sprint1.Inlämningsuppgift1.Palm;

class PalmTest {

    Palm laura = new Palm(Guest.LAURA, 5);
    @Test
    void amountOfLiquid() {
        double expectedAmountOfLiquid = 2.5;
        double actualAmountOfLiquid = laura.amountOfLiquid();
        Assertions.assertEquals(expectedAmountOfLiquid, actualAmountOfLiquid);
    }

}