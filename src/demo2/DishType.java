package demo2;

public enum DishType {
    VEGE("Danie wegańskie"),
    VEGETARIAN("Danie wegetariańskie"),
    MEAT("Danie mięsne");

    private final String name;

    private DishType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
