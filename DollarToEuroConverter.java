//subsubclass for converting dollars to euros
public class DollarToEuroConverter extends ConverterDecorator {
    //constructor
    public DollarToEuroConverter(UnitConverter c) {
        super(c);
    }
    //returns factor to be converted by
    public double convertFactor(){
        return 0.85;
    }
    //conversion method that takes the input value
    public double convert(double inDollars) {
        return super.convert(inDollars) * convertFactor();
    }
    //returns input unit
    public String inputUnit() {
        return "US Dollars";
    }
    //returns the "name" of the converter
    public String toString() {
        return inputUnit() + " to " + outputUnit() + " Converter";
    }
}