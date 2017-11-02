//subsubclass for converting acres to square metres
public class AcreToSquaremetreConverter extends AreaConverter {
    //empty constructor
    public AcreToSquaremetreConverter() {
    }

    //conversion method that takes the input value
    public double convert(double inAcres) {
        return inAcres * 4046.86;
    }

    //returns input unit
    public String inputUnit() {
        return "acres";
    }

    //returns the "name" of the converter
    public String toString() {
        return "Acre to Squaremetre Converter";
    }
}
