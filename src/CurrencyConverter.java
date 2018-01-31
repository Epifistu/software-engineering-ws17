

//subclass for currency converters
public class CurrencyConverter implements UnitConverter {

    //prints out the "name" of the class
    public void print() {
        System.out.println(toString());
    }
    //returns "EUR" because all values are converted to euros
    public String outputUnit() {
        return "Euros";
    }
    //factor to convert by
    public double convertFactor(){
        return Double.parseDouble(null);
    }
    //conversion method that takes the input value
    public double convert(double inValue){

            try {
                //negative or 0 money can't be converted
                if(inValue <= 0) {
                    throw new EmptyAccount();
                }
            } catch (EmptyAccount emptyAccount) {
                emptyAccount.printStackTrace();
                // stop the program in case of exception
                System.exit(1);
            }
            return inValue;

    }
    //returns the "name" of the class
    public String toString(){
        return null;
    }
    //returns the input unit
    public String inputUnit(){
        return null;
    }

}
