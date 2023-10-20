package sprint1.Inlämningsuppgift1;

public enum Guest {
    IGGE ("Igge","Igge är en kaktus"),
    LAURA ("Laura", "Laura är en palm"),
    MEATLOAF ("Meatloaf", "Meatloaf är en köttätande växt"),
    OLOF ("Olof", "Olof är en palm");

    private String guestName;
    private String description;

    Guest (String n, String d){ //konstruktorn
        guestName = n;
        description = d;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return guestName;
    }
}
