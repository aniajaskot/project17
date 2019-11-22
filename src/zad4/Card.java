package zad4;

public class Card {
    private CardColor color;
    private CardValue value;

    public Card(CardColor color, CardValue value) {
        this.color = color;
        this.value = value;
    }

    public String getPlTranslation(){
        return value.getValuePl() + " " + color.getColorPl();
    }

    public String getEnTranslation(){
        return value.getValueEn() + " of " + color.getColorEn();
    }
}
