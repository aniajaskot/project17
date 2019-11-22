package zad1;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal netto;
    private BigDecimal vat;

    public Product(String name, BigDecimal netto, BigDecimal vat) {
        this.name = name;
        this.netto = netto;
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getNetto() {
        return netto;
    }

    public void setNetto(BigDecimal netto) {
        this.netto = netto;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }
}
