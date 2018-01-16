//inversion decorator
public class InversionDecorator extends ConverterDecorator {
    //constructor
    public InversionDecorator(UnitConverter c){
        super(c);
    }
    //returns factor to be converted by
    public double convertFactor(){
        return Math.pow(Math.pow(super.convertFactor(), -1),2);
    }
    //new conversion method inverts the factor to be converted by: inValue*factor^-1
    public double convert(double inVersion) {
        return super.convert(inVersion) * convertFactor();
    }
    //in and output unit are switched because of inversion
    public String inputUnit() {
        return super.outputUnit();
    }
    //in and output unit are switched because of inversion
    public String outputUnit() {
        return super.inputUnit();
    }
    //returns the inverted "name" of the converter
    public String toString() {
        return super.outputUnit() + " to " + super.inputUnit() + " Converter";
    }

}
