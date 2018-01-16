//subsubclass for converting cups to litres
public class CupToLitreConverter extends ConverterDecorator {
    //constructor
    public CupToLitreConverter(UnitConverter c) {
        super(c);
    }
    //returns factor to be converted by
    public double convertFactor(){
        return 0.24;
    }
    //conversion method that takes the input value
    public double convert(double inCups) {
        return super.convert(inCups) * convertFactor();
    }
    //returns input unit
    public String inputUnit() {
        return "Cups";
    }
    //returns the "name" of the converter
    public String toString() {
        return inputUnit() + " to " + outputUnit() + " Converter";
    }
}