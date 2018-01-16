//subsubclass for converting acres to square metres
public class AcreToSquaremetreConverter extends ConverterDecorator {
    //constructor
    public AcreToSquaremetreConverter(UnitConverter c) {
        super(c);
    }
    //returns factor to be converted by
    public double convertFactor(){
        return 4046.86;
    }
    //conversion method that takes the input value
    public double convert(double inAcres) {
        return super.convert(inAcres) * convertFactor();
    }
    //returns input unit
    public String inputUnit() {
        return "Acres";
    }
    //returns the "name" of the converter
    public String toString() {
        return inputUnit() + " to " + outputUnit() + " Converter";
    }
}
