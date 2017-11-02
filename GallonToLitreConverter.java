//subsubclass for converting gallons to litres
public class GallonToLitreConverter extends VolumeConverter {
    //empty constructor
    public GallonToLitreConverter() {
    }

    //conversion method that takes the input value
    public double convert(double inGallons) {
        return inGallons * 3.84;
    }

    //returns input unit
    public String inputUnit() {
        return "gallons";
    }

    //returns the "name" of the converter
    public String toString() {
        return "Gallon to Litre Converter";
    }
}
