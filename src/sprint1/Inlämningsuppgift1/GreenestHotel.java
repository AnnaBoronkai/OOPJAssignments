package sprint1.Inlämningsuppgift1;
import javax.swing.*;

public class GreenestHotel {

    public void greenestHotel() {

        Cactus cactus1 = new Cactus(Guest.IGGE, 0.2);
        Palm palm1 = new Palm(Guest.LAURA, 5);
        CarnivorousPlant carnivorousPlant1 = new CarnivorousPlant(Guest.MEATLOAF, 0.7);
        Palm palm2 = new Palm(Guest.OLOF, 1);

        JOptionPane.showMessageDialog(null, Messages.CHECKED_IN + "\n" +
                Messages.BULLET_CHARACTER + Guest.IGGE.getName() + "\n" +
                Messages.BULLET_CHARACTER + Guest.LAURA.getName() + "\n" +
                Messages.BULLET_CHARACTER + Guest.MEATLOAF.getName() + "\n" +
                Messages.BULLET_CHARACTER + Guest.OLOF.getName() + ".");

        String hotelGuest = JOptionPane.showInputDialog(Messages.QUESTION_PROMPT);

        if (hotelGuest == null){
            JOptionPane.showMessageDialog(null, Messages.CHECKED_OUT);
            return;
        }

        if (hotelGuest.isEmpty()){
            JOptionPane.showMessageDialog(null, Messages.MISSING_INPUT);
            return;
        }

        Guest guest;

        try {
             guest = Guest.valueOf(hotelGuest.toUpperCase());
        }
        catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, Messages.INVALID_INPUT);
            return;
        }

        switch (guest) {

            case IGGE:
                JOptionPane.showMessageDialog(null, Guest.IGGE.getDescription() + ". " +
                        Messages.PRONOUN_HIM + " " + cactus1.amountOfLiquid() + " " + Messages.CENTILITERS + " " +
                        cactus1.typeOfLiquid() + ".");
                break;

            case LAURA:
                JOptionPane.showMessageDialog(null, Guest.LAURA.getDescription() + ". " +
                        Messages.PRONOUN_HER + " " + palm1.amountOfLiquid() + " " + Messages.LITERS + " " +
                        palm1.typeOfLiquid() + ".");
                break;

            case MEATLOAF:
                JOptionPane.showMessageDialog(null, Guest.MEATLOAF.getDescription() + ". " +
                        Messages.PRONOUN_HIM + " " + carnivorousPlant1.amountOfLiquid() + " " + Messages.DECILITERS +
                        " " + carnivorousPlant1.typeOfLiquid() + ".");
                break;

            case OLOF:
                JOptionPane.showMessageDialog(null, Guest.OLOF.getDescription() + ". " +
                        Messages.PRONOUN_HIM + " " + palm2.amountOfLiquid() + " " + Messages.LITERS + " " +
                        palm2.typeOfLiquid() + ".");
                break;

            default:
                JOptionPane.showMessageDialog(null, Messages.ERROR_MESSAGE);
                break;
        }
    }

    public static void main(String[] args) {
        GreenestHotel g = new GreenestHotel();
        g.greenestHotel();
    }
}