public class RubelToEuroConverter extends CurrencyConverter{

    public RubelToEuroConverter() { }

    public double convert(double inRubel) {
        return inRubel*0.0147;
    }

    public String toString(){
        return "Rubel to Euro Converter";
    }
}
