//superclass for all converters
public abstract class UnitConverter
{
    public UnitConverter() {
    }
    //conversion method that takes the input value
    public abstract double convert(double inValue);
    //returns the "name" of the class
    public abstract String toString();
    //returns the input unit
    public abstract String inputUnit();
    //returns the output unit
    public abstract String outputUnit();
    //prints out the "name" of the class
    public abstract void print();
};

