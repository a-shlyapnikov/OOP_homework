package HW04;

import java.util.List;
import java.util.regex.Pattern;


public class Calculator {
    private double result;

    public Double sum(List<? extends Number> items) {

        for (var i : items) {
            result += i.doubleValue();
        }
        return result;
    }

    public Double sum(Number a, Number b) {
        return a.doubleValue() + b.doubleValue();
    }

    public double subtraction(List<? extends Number> items) {
        for (Number i : items) {
            result -= i.doubleValue();
        }
        return result;
    }

    public double subtraction(Number a, Number b) {
        return a.doubleValue() - b.doubleValue();
    }

    public double multiplication(List<? extends Number> items) {
        for (Number i : items) {
            result *= i.doubleValue();
        }
        return result;
    }

    public double multiplication(Number a, Number b) {
        return a.doubleValue() * b.doubleValue();
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public double division(List<? extends Number> items) {
        if (result == 0) {
            System.out.println("Error, use setResult to add dividend");
        } else
            for (Number i : items)
                result /= i.doubleValue();
        return result;
    }

    public double division(Number a, Number b) {
        return a.doubleValue() / b.doubleValue();
    }

    public String toBinary(Object num) {
        String line = num.toString();
        String fractionPart = "";
        if (line.contains(".")) {
            String fractionalPartLine = "";
            String[] lines = line.split("\\.");
            line = lines[0];
            fractionalPartLine = lines[1];
            fractionPart = fractionToBinary(fractionalPartLine);
        }
        int integerPart = Integer.parseInt(line);
        StringBuilder sb = new StringBuilder();
        while (integerPart > 1) {
            sb.append(integerPart % 2);
            integerPart /= 2;
        }
        sb.append(integerPart);
        sb.reverse().append(fractionPart.substring(0, 4));
        return sb.toString();
    }

    private String fractionToBinary(String line) {
        StringBuilder sb = new StringBuilder(".");
        line = "0." + line;
        double fractionPart = Double.parseDouble(line);
        while (fractionPart != 0) {
            fractionPart *= 2;
            if (fractionPart < 1) {
                sb.append("0");
            } else {
                sb.append("1");
                fractionPart -= 1;
            }
        }
        return sb.toString();
    }

    public double fromBinary(Object num) {
        String line = num.toString();
        int n = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '1')
                n += (int) Math.pow(2.0, line.length() - 1 - i);
        }
        return result = (double) n;
    }

}
