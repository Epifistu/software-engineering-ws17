//command class
public class Command {

    UnitConverter Uc;

    //constructor
    public Command(UnitConverter Uc, double inPut) {
        this.Uc = Uc;
        value = inPut;
    }

    //execute the convert function of passed converter and print result
    public void execute() {

        double output = Uc.convert(value);
        System.out.println(Uc.toString() + " has converted " + value + " " + Uc.inputUnit() + " to " + output + " " + Uc.outputUnit() + "!");
    }


    private double value;

}
