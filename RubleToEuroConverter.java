//subsubclass for converting rubles to euros
public class RubleToEuroConverter extends CurrencyConverter {
    //empty constructor
    public RubleToEuroConverter() {
    }

    //conversion method that takes the input value
    public double convert(double inRubles) {
        return inRubles * 0.0147;
    }

    //returns input unit
    public String inputUnit() {
        return "RUB";
    }

    //returns the "name" of the converter
    public String toString() {
        return "Ruble to Euro Converter";
    }
}
