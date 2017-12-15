//interface for all converters
public interface UnitConverter
{

    //factor to convert by
    double convertFactor();
    //conversion method that takes the input value
    double convert(double inValue);
    //returns the "name" of the class
    String toString();
    //returns the input unit
    String inputUnit();
    //returns the output unit
    String outputUnit();
    //prints out the "name" of the class
    void print();
};

