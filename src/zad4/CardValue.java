package zad4;

public enum CardValue {
    TWO("dwójka", "two"),
    THREE("trójka", "three"),
    FOUR("czwórka", "four"),
    FIVE("piątka", "five"),
    SIX("szóstka", "six"),
    SEVEN("siódemka", "seven"),
    EIGHT("ósemka", "eight"),
    NINE("dziewiątka", "nine"),
    TEN("dziesiątka", "ten"),
    JACK("walet", "jack"),
    QUEEN("dama", "queen"),
    KING("król","king"),
    ACE("as", "ace");

    private final String valuePl;
    private final String valueEn;

    CardValue(String valuePl, String valueEn) {
        this.valuePl = valuePl;
        this.valueEn = valueEn;
    }

    public String getValuePl() {
        return valuePl;
    }

    public String getValueEn() {
        return valueEn;
    }
}
