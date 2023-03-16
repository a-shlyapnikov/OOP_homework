package HW04;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.subtraction(new ArrayList<>(Arrays.asList(2.0,1.1))));
        System.out.println(calc.division(10,5));
        System.out.println(calc.subtraction(20, 13));
        System.out.println(String.format("%.3f",calc.multiplication(new ArrayList<>(Arrays.asList(2.0,1.1)))));
        System.out.println(calc.multiplication(2,7));
        System.out.println(calc.toBinary(16.17));
        System.out.println(calc.toBinary(24));
        System.out.println(calc.fromBinary(1000));

    }
}
