public class BolivianosToEuroConverter extends CurrencyConverter{

    public BolivianosToEuroConverter() { }

    public double convert(double inBolivianos) {
        return inBolivianos*0.12;
    }

    public String toString(){
        return "Bolivianos to Euro Converter";
    }
}
