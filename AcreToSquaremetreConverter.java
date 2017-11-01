public class AcreToSquaremetreConverter extends AreaConverter {
    public AcreToSquaremetreConverter() { }

    public double convert(double inAcres) {
        return inAcres*4046.86;
    }

    public String inputUnit(){
        return "acres";
    }

    public String toString(){
        return "Acre to Squaremetre Converter";
    }
}
