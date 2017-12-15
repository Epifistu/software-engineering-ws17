//subsubclass for converting square yards to square metres
public class SquareyardToSquaremetreConverter extends ConverterDecorator {
    //constructor
    public SquareyardToSquaremetreConverter(UnitConverter c) {
        super(c);
    }
    //returns factor to be converted by
    public double convertFactor(){
        return 0.836127;
    }
    //conversion method that takes the input value
    public double convert(double inSquareyards) {
        return super.convert(inSquareyards) * convertFactor();
    }
    //returns input unit
    public String inputUnit() {
        return "Squareyards";
    }
    //returns the "name" of the converter
    public String toString() {
        return inputUnit() + " to " + outputUnit() + " Converter";
    }
}