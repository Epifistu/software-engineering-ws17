public class RubleToEuroConverter extends CurrencyConverter{

    public RubleToEuroConverter() { }

    public double convert(double inRubles) {
        return inRubles*0.0147;
    }

    public String inputUnit(){
        return "RUB";
    }

    public String toString(){
        return "Ruble to Euro Converter";
    }
}
