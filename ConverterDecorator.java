//reference for decorators: https://www.journaldev.com/1540/decorator-design-pattern-in-java-example

public class ConverterDecorator implements UnitConverter {
    protected UnitConverter baseConverter;

    public ConverterDecorator(UnitConverter c){
        this.baseConverter = c ;
    }

    //factor to convert by
    public double convertFactor(){
        return this.baseConverter.convertFactor();
    };
    //conversion method that takes the input value
    public double convert(double inValue){
       return this.baseConverter.convert(inValue);
    }
    //returns the "name" of the class
    public String toString(){
        return this.baseConverter.toString();
    }
    //returns the input unit
    public  String inputUnit(){
       return this.baseConverter.inputUnit();
    }
    //returns the output unit
    public  String outputUnit(){
        return this.baseConverter.outputUnit();
    }
    //prints out the "name" of the class
    public  void print(){
        this.baseConverter.print();
    }
}
