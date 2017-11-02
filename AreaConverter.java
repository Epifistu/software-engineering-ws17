//subclass for area converters
public abstract class AreaConverter extends UnitConverter {
    //prints out the "name" of the class
    public void print() {
        System.out.println(toString());
    }
    //returns "m²" because all values are converted to square metres
    public String outputUnit() {
        return "m²";
    }
}



