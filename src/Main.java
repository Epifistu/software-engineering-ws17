import java.util.Scanner;
import java.util.*;

//main class
class Main {
    //main method
    public static void main(String[] args) {

        LinkedList<Command> kommandos = new LinkedList<Command>();

        System.out.println("Input format: converter,value");
        System.out.println("Example: dollar to euro,100");

        //find all units that can be converted in the ConverterFactory hashmap
        //type safety feature is automatically implemented by the hashmap (no nonsense converters can be instanced)

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            //split the input string at the comma
            String[] arrayIn = s1.split(",");
            UnitConverter myConverter = ConverterFactory.instance().create(arrayIn[0]);
            //test if the converter was created
            if (myConverter != null) {
                //try-catch to see if the second input is a number
                try {
                    kommandos.add(new Command(myConverter, Double.parseDouble(arrayIn[1])));
                } catch (Exception e) {
                    System.out.println("This is not a number, did you maybe mistype?");
                }
            } else {
                System.out.println("I have never heard of this converter, did you mistype or mix up quantities?");
            }

        }

        //try-catch to avoid executing non-existing commands
        try {
            for (Command cm : kommandos) {
                cm.execute();
            }
        } catch (Exception e) {
            System.out.println("No commands to be executed.");
        }

        //-------------------------------------------------old version------------------------------

/*
        //first argument to specify conversion
        String conversion = args[0].toLowerCase();

        //display instructions and all available converters if asked for help
        if (conversion.equals("help")) {
            System.out.println("To convert a value, use this format: \"Dollar to Euro\" 10000");

            //stop the program before array is out of bounds
            System.exit(0);
        }

        //second argument to specify value
        String inputValue = args[1];
        //debug information
        System.out.println("Converter: " + conversion);
        System.out.println("Input value: " + inputValue);

        //boolean in case the user mistyped
        boolean setConverter = false;

        //Make new converter using the converter factory
        UnitConverter myConverter = ConverterFactory.instance().create(conversion);
        //UnitConverter myConverter = ConverterFactory.instance().create(conversion);
        if(myConverter != null) setConverter = true;

        //error handling
        if (!setConverter) {
            System.out.println("I have never heard of this converter, did you maybe mistype?");
            //stop the program before anything bad could happen
            System.exit(0);
        }

        try{
            //parse input string to double
            double value = Double.parseDouble(inputValue);
            //apply conversion
            double outputValue = myConverter.convert(value);
            //print the result
            System.out.println(myConverter.toString() + " has converted " + value + " " + myConverter.inputUnit() + " to " + outputValue + " " + myConverter.outputUnit() + "!");
        }
        catch (Exception e) {
            System.out.println("This is not a numeric value.");
        }


*/

    }
}
