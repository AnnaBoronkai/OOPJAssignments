package sprint1.Inlämningsuppgift1;

public class Messages {

    //Inkapsling: Dessa konstanta variabler är protected istället för private då den måste kunna nås från
    // en annan klass, GreenestHotel. Att de är protected innebär att de är tillgängliga från andra klasser
    //i samma paket.

    protected static final String CHECKED_IN = "Välkommen till Greenest Hotel! \nHär bor växterna ";
    protected static final String CHECKED_OUT = "Du har checkat ut. På återseende!";
    protected static final String QUESTION_PROMPT = "Vilken växt ska få mat?";

    protected static final String PRONOUN_HIM = "Ge honom";
    protected static final String PRONOUN_HER = "Ge henne";

    protected static final String CENTILITERS = "cl";
    protected static final String DECILITERS = "dl";
    protected static final String LITERS = "liter";
    protected static final String BULLET_CHARACTER = "\u2022";

    protected static final String ERROR_MESSAGE = "Ingen växt med det namnet bor på hotellet.";
    protected static final String MISSING_INPUT = "Du har inte skrivit in något. Var god börja om från början.";
    protected static final String INVALID_INPUT = "Ogiltig inmatning. Ange ett namn.";

}
