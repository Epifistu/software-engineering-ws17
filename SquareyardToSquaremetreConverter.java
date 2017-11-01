public class SquareyardToSquaremetreConverter extends AreaConverter {
    public SquareyardToSquaremetreConverter() { }

    public double convert(double inSquareyards) {
        return inSquareyards*0.836127;
    }

    public String inputUnit(){
        return "yd²";
    }

    public String toString(){
        return "Squareyard to Squaremetre Converter";
    }
}
