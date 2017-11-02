//subsubclass for converting cups to litres
public class CupToLitreConverter extends VolumeConverter {
    //empty constructor
    public CupToLitreConverter() {
    }

    //conversion method that takes the input value
    public double convert(double inCups) {
        return inCups * 0.24;
    }

    //returns input unit
    public String inputUnit() {
        return "cups";
    }

    //returns the "name" of the converter
    public String toString() {
        return "Cup to Litre Converter";
    }
}
