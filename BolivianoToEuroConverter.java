//subsubclass for converting bolivianos to euros
public class BolivianoToEuroConverter extends CurrencyConverter {
    //empty constructor
    public BolivianoToEuroConverter() {
    }

    //conversion method that takes the input value
    public double convert(double inBolivianos) {
        return inBolivianos * 0.12;
    }

    //returns input unit
    public String inputUnit() {
        return "BOB";
    }

    //returns the "name" of the converter
    public String toString() {
        return "Boliviano to Euro Converter";
    }
}
