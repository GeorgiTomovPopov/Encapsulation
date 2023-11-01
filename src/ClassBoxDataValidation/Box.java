package ClassBoxDataValidation;

public class Box {

    private final int MIN_VALUE = 1;
    private double length;
    private double width;
    private double height;




    public double calculateVolume() {
        return length * width * height;
    }

    public double calculateLateralSurfaceArea() {
        return (2 * length * height) + (2 * width * height);
    }

    public double calculateSurfaceArea() {
        return (2 * length * width) + (2 * length * height) + (2 * width * height);
    }


    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        if (length < MIN_VALUE) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        } else {
            this.length = length;
        }
    }

    private void setWidth(double width) {
        if (width < MIN_VALUE) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        } else {
            this.width = width;
        }
    }

    private void setHeight(double height) {
        if (height < MIN_VALUE) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        } else {
            this.height = height;
        }
    }
}
