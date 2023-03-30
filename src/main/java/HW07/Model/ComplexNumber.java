package HW07.Model;

public class ComplexNumber {
    private int realPart;
    private int imagynaryPart;

    public int getRealPart() {
        return realPart;
    }

    public int getImagynaryPart() {
        return imagynaryPart;
    }

    public ComplexNumber(int realPart, int imagynaryPart) {
        this.realPart = realPart;
        this.imagynaryPart = imagynaryPart;
    }

    @Override
    public String toString() {
        String result = "";
        if (imagynaryPart > 0){
            result = String.format("(%d + %di)", realPart, imagynaryPart);
        } else {
            result = String.format("(%d - %di)", realPart, Math.abs(imagynaryPart));
        }
        return result;
    }
}
