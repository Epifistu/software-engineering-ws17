public class BolivianoToEuroConverter extends CurrencyConverter{

    public BolivianoToEuroConverter() { }

    public double convert(double inBolivianos) {
        return inBolivianos*0.12;
    }

    public String inputUnit(){
        return "BOB";
    }

    public String toString(){
        return "Boliviano to Euro Converter";
    }
}
