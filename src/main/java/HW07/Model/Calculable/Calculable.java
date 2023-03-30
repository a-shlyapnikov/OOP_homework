package HW07.Model.Calculable;

import HW07.Model.ComplexNumber;

public interface Calculable {
    ComplexNumber summ(ComplexNumber complexNumber);
    ComplexNumber subtraction(ComplexNumber complexNumber);
    ComplexNumber multiplication(ComplexNumber complexNumber);
    ComplexNumber division(ComplexNumber complexNumber);
    ComplexNumber getResult();
}
