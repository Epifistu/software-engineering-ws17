//main class
class Main {
    //main method
    public static void main(String[] args) {
        //create array of converters
        UnitConverter[] myConverter = new UnitConverter[7];
        myConverter[0] = new DollarToEuroConverter();
        myConverter[1] = new BolivianoToEuroConverter();
        myConverter[2] = new RubleToEuroConverter();
        myConverter[3] = new AcreToSquaremetreConverter();
        myConverter[4] = new SquareyardToSquaremetreConverter();
        myConverter[5] = new CupToLitreConverter();
        myConverter[6] = new GallonToLitreConverter();

        //first argument to specify conversion
        String conversion = args[0];

        //display instructions and all available converters if asked for help
        if(conversion.equals("help")){
            System.out.println("To convert a value, use this format: \"Dollar to Euro Converter\" 10000 \nThe following converters are available:");
            for(int i = 0; i < myConverter.length; i++){
                myConverter[i].print();
            }
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
        //cycle through converters
        for (int i = 0; i < myConverter.length; i++) {
            //check if the chosen converter is in the array
            if (conversion.equals(myConverter[i].toString())) {
                //try to parse and convert
                try {
                    //parse input string to double
                    double value = Double.parseDouble(inputValue);
                    //apply conversion
                    double outputValue = myConverter[i].convert(value);
                    //print the result
                    System.out.println(myConverter[i].toString() + " has converted " + value + " " + myConverter[i].inputUnit() + " to " + outputValue + " " + myConverter[i].outputUnit() + "!");
                }
                //if it doesn't work, return an error
                catch (Exception e) {
                    System.out.println("This is not a numeric value.");
                }
                //converter was set
                setConverter = true;
            }

        }
        //error handling
        if (!setConverter) {
            System.out.println("I have never heard of this converter, did you maybe mistype?");
        }


    }
}
