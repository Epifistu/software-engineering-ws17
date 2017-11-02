//subsubclass for converting dollars to euros
public class DollarToEuroConverter extends CurrencyConverter {
    //empty constructor
    public DollarToEuroConverter() {
    }

    //conversion method that takes the input value
    public double convert(double inDollars) {
        return inDollars * 0.85;
    }

    //returns input unit
    public String inputUnit() {
        return "USD";
    }

    //returns the "name" of the converter
    public String toString() {
        return "Dollar to Euro Converter";
    }
}
