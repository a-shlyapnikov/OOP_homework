package HW07.Model.Calculable;

import HW07.Model.ComplexNumber;

public class Calculator implements Calculable {
    protected ComplexNumber complexNumber;

    public Calculator(ComplexNumber complexNumber) {
        this.complexNumber = complexNumber;
    }

    @Override
    public ComplexNumber summ(ComplexNumber someCompNumber) {
        complexNumber = new ComplexNumber((this.complexNumber.getRealPart() + someCompNumber.getRealPart()),
                (this.complexNumber.getImagynaryPart() + someCompNumber.getImagynaryPart()));
        return this.complexNumber;
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber someCompNumber) {
        complexNumber = new ComplexNumber((this.complexNumber.getRealPart() - someCompNumber.getRealPart()),
                (this.complexNumber.getImagynaryPart() - someCompNumber.getImagynaryPart()));
        return complexNumber;
    }

    @Override
    public ComplexNumber multiplication(ComplexNumber someCompNumber) {
        complexNumber = new ComplexNumber(((this.complexNumber.getRealPart() * someCompNumber.getRealPart()) -
                (this.complexNumber.getImagynaryPart() * someCompNumber.getImagynaryPart())),
                ((this.complexNumber.getRealPart() * someCompNumber.getImagynaryPart())
                        + (this.complexNumber.getImagynaryPart() * someCompNumber.getRealPart())));
        return complexNumber;
    }

    @Override
    public ComplexNumber division(ComplexNumber someCompNumber) {
        int denominator = (someCompNumber.getRealPart() * someCompNumber.getRealPart() +
                someCompNumber.getImagynaryPart() * someCompNumber.getImagynaryPart());

        complexNumber = new ComplexNumber(((complexNumber.getRealPart() * someCompNumber.getRealPart() +
                complexNumber.getImagynaryPart() * someCompNumber.getImagynaryPart()) / denominator),
                ((complexNumber.getImagynaryPart() * someCompNumber.getRealPart() -
                        complexNumber.getRealPart() * someCompNumber.getImagynaryPart()) / denominator));
        return complexNumber;
    }

    @Override
    public ComplexNumber getResult() {
        return complexNumber;
    }
}
