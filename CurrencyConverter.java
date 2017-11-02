//subclass for currency converters
public abstract class CurrencyConverter extends UnitConverter {
    //prints out the "name" of the class
    public void print() {
        System.out.println(toString());
    }
    //returns "EUR" because all values are converted to Euro
    public String outputUnit() {
        return "EUR";
    }
}




