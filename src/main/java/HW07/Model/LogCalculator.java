package HW07.Model;

import HW07.Model.Calculable.Calculator;
import HW07.Model.Logger.Logger;

import java.io.IOException;

public class LogCalculator extends Calculator {
    private Logger log;

    public LogCalculator(ComplexNumber complexNumber) throws IOException {
        super(complexNumber);
        this.log = new Logger();
        log.newLog(complexNumber.toString());
    }

    @Override
    public ComplexNumber summ(ComplexNumber someCompNumber) {
        try {
            log.newLog(" + " + someCompNumber.toString());
        } catch (IOException e) {
            System.out.println("Invalid input");
        } finally {
            return super.summ(someCompNumber);
        }
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber someCompNumber) {
        try {
            log.newLog(" - " + someCompNumber.toString());
        } catch (IOException e) {
            System.out.println("Invalin input");
        } finally {
            return super.subtraction(someCompNumber);
        }
    }

    @Override
    public ComplexNumber division(ComplexNumber someCompNumber) {
        try {
            log.newLog(" / " + someCompNumber.toString());
        } catch (IOException e) {
            System.out.println("Invalid input");
        } finally {
            return super.division(someCompNumber);
        }
    }

    @Override
    public ComplexNumber multiplication(ComplexNumber someCompNumber) {
        try {
            log.newLog(" * " + someCompNumber.toString());
        } catch (IOException e) {
            System.out.println("Invalid input");
        } finally {
            return super.multiplication(someCompNumber);
        }
    }

    @Override
    public ComplexNumber getResult() {
        try {
            log.newLog(" = " + super.getResult() + "\n");
        } catch (IOException e) {
            System.out.println("Invalid input");
        } finally {
            return super.getResult();
        }
    }
}
