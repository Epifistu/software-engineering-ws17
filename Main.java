//main class
class Main {
    //main method
    public static void main(String[] args) {

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




    }
}
