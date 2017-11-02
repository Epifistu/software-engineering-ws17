//subsubclass for converting square yards to square metres
public class SquareyardToSquaremetreConverter extends AreaConverter {
    //empty constructor
    public SquareyardToSquaremetreConverter() {
    }

    //conversion method that takes the input value
    public double convert(double inSquareyards) {
        return inSquareyards * 0.836127;
    }

    //returns input unit
    public String inputUnit() {
        return "yd²";
    }

    //returns the "name" of the converter
    public String toString() {
        return "Squareyard to Squaremetre Converter";
    }
}
