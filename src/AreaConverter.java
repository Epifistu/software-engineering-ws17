//subclass for area converters
public class AreaConverter implements UnitConverter {

    //prints out the "name" of the class
    public void print() {
        System.out.println(toString());
    }
    //returns "m²" because all values are converted to square metres
    public String outputUnit() {
        return "Squaremetres";
    }
    //factor to convert by
    public double convertFactor(){
        return Double.parseDouble(null);
    }
    //conversion method that takes the input value
    public double convert(double inValue) {
        try {
            //negative or 0 area can't be converted
            if(inValue <= 0) {
                throw new EmptyArea();
            }
        } catch (EmptyArea emptyArea) {
            emptyArea.printStackTrace();
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



