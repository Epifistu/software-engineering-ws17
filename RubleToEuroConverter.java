//subsubclass for converting rubles to euros
public class RubleToEuroConverter extends ConverterDecorator {
    //constructor
    public RubleToEuroConverter(UnitConverter c) {
        super(c);
    }
    //returns factor to be converted by
    public double convertFactor(){
        return 0.0147;
    }
    //conversion method that takes the input value
    public double convert(double inRubles) {
        return super.convert(inRubles) * convertFactor();
    }
    //returns input unit
    public String inputUnit() {
        return "Rubles";
    }
    //returns the "name" of the converter
    public String toString() {
        return inputUnit() + " to " + outputUnit() + " Converter";
    }
}