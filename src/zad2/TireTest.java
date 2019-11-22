package zad2;

import java.util.ArrayList;
import java.util.List;

public class TireTest {
    public static void main(String[] args) {
        List<Tire> tires = new ArrayList<>();
        tires.add(new Tire("producent1", TireType.WINTER, 123));
        tires.add(new Tire("producent2", TireType.UNIVERSAL, 234));
        tires.add(new Tire("producent3", TireType.SUMMER, 345));

        for (Tire tire: tires) {
            System.out.println(tire);
        }
    }
}
