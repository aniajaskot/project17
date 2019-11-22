package zad1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductTest {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Telewizor", new BigDecimal("100"), new BigDecimal("23")));
        products.add(new Product("Praliny", new BigDecimal("40"), new BigDecimal("8")));
        products.add(new Product("Thinking in Java", new BigDecimal("120"), new BigDecimal("5")));

        BigDecimal sumNetto = sumNetto(products);
        BigDecimal sumVat = sumVat(products);
        BigDecimal sumBrutto = sumNetto.add(sumVat);

        System.out.println(sumNetto);
        System.out.println(sumVat);
        System.out.println(sumBrutto);
    }

    private static BigDecimal sumVat(List<Product> products) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Product product : products) {
            sum = sum.add(product.getVat().multiply(new BigDecimal("0.01").multiply(product.getNetto())));
        }
        return sum;
    }

    private static BigDecimal sumNetto(List<Product> products) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Product product : products) {
            sum = sum.add(product.getNetto());
        }
        return sum;
    }
}
