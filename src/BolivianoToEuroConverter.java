//subsubclass for converting bolivianos to euros
public class BolivianoToEuroConverter extends ConverterDecorator {
    //constructor
    public BolivianoToEuroConverter(UnitConverter c) {
        super(c);
    }
    //returns factor to be converted by
    public double convertFactor(){
        return 0.12;
    }
    //conversion method that takes the input value
    public double convert(double inBolivianos) {
        return super.convert(inBolivianos) * convertFactor();
    }
    //returns input unit
    public String inputUnit() {
        return "Bolivianos";
    }
    //returns the "name" of the converter
    public String toString() {
        return inputUnit() + " to " + outputUnit() + " Converter";
    }
}
