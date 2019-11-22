package demo1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigNumbers {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("1");
        BigDecimal num2 = new BigDecimal("3");
        BigDecimal divide = num1.divide(num2);
        System.out.println(divide);



//        int num1 = 1234567890;
//        int num2 = 234567890;
//        int multi = num1 * num2;
//        System.out.println(multi);
//
//        BigInteger number1 = new BigInteger("1234567890");
//        BigInteger number2 = new BigInteger("234567890");
//        BigInteger multiply = number1.multiply(number2);
//        System.out.println(multiply);

//        BigDecimal num1 = new BigDecimal(0.1);
//        BigDecimal num2 = new BigDecimal(0.2);
//        BigDecimal num3 = BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.2));
//        BigDecimal sum = num1.add(num2);
//        System.out.println(sum);
//        System.out.println(num3);
    }
}
