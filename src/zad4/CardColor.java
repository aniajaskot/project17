package zad4;

public enum CardColor {
    CLUBS ("żołądź", "clubs"),
    DIAMONDS ("dzwonek", "diamonds"),
    HEARTS ("serce", "hearts"),
    SPADES ("wino", "spades");

    private final String colorPl;
    private final String colorEn;

    CardColor(String colorPl, String colorEn) {
        this.colorPl = colorPl;
        this.colorEn = colorEn;
    }

    public String getColorPl() {
        return colorPl;
    }

    public String getColorEn() {
        return colorEn;
    }
}
