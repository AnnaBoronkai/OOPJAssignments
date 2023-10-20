package sprint1.Inlämningsuppgift1;

abstract class Plant {

    //Inkapsling: instansvariablerna i denna klass är privata, liksom alla andra variabler i den utsträckning
    //det är möjligt. Detta gör att det inte kan nås utan getters och setters utan för sina egna klasser,
    // vilket innebär en kontrollerad åtkomst.
    private Guest name;
    private double height;

    public Plant(Guest name, double height) {
        this.name = name;
        this.height = height;
    }

    public Guest getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
}
