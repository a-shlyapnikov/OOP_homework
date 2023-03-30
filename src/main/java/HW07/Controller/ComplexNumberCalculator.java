package HW07.Controller;

import HW07.Model.Calculable.Calculable;
import HW07.Model.Calculable.Calculator;
import HW07.Model.ComplexNumber;
import HW07.Model.LogCalculator;
import HW07.View.View;

import java.io.IOException;

public class ComplexNumberCalculator {
    private View view;
    private Calculator calculator;
    private final String promtComplexNumber;

    public ComplexNumberCalculator() throws IOException {
        this.view = new View();
        promtComplexNumber = "Введите комплексное число:\n";

    }

    public void start() throws IOException {
        while (true) {
            view.show(promtComplexNumber);
            calculator = new LogCalculator(newNum());
            while (true) {
                String operation = view.prompt("Введите математическую операцию \n" +
                        "(Доступны: +, -, *, /, =):  \b");
                if (operation.equals("+")) {
                    view.show(promtComplexNumber);
                    calculator.summ(newNum());
                    continue;
                }
                if (operation.equals("-")) {
                    view.show(promtComplexNumber);
                    calculator.subtraction(newNum());
                    continue;
                }
                if (operation.equals("*")) {
                    view.show(promtComplexNumber);
                    calculator.multiplication(newNum());
                    continue;
                }
                if (operation.equals("/")) {
                    view.show(promtComplexNumber);
                    calculator.division(newNum());
                    continue;
                }
                if (operation.equals("=")) {
                    view.show("Результат вычисления: " + calculator.getResult());
                    break;
                }
            }
            String cmd = view.prompt("\nЕще посчитать (Y/N)?: ");
            if (cmd.toLowerCase().equals("y")) {
                continue;
            }
            break;
        }
    }



    private ComplexNumber newNum() {
        return new ComplexNumber(view.promptInt("Введите вещественную чать: "),
                view.promptInt("Введите мнимую часть: "));
    }
}
