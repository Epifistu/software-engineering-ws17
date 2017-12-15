//subsubclass for converting gallons to litres
public class GallonToLitreConverter extends ConverterDecorator {
    //constructor
    public GallonToLitreConverter(UnitConverter c) {
        super(c);
    }
    //returns factor to be converted by
    public double convertFactor(){
        return 3.84;
    }
    //conversion method that takes the input value
    public double convert(double inGallons) {
        return super.convert(inGallons) * convertFactor();
    }
    //returns input unit
    public String inputUnit() {
        return "Gallons";
    }
    //returns the "name" of the converter
    public String toString() {
        return inputUnit() + " to " + outputUnit() + " Converter";
    }
}