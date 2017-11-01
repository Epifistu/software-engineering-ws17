class Main {
    public static void main(String[] args) {

        String conversion = args[0];
        String inputValue = args[1];
        System.out.println("Converter: " + conversion);
        System.out.println("Input value: " + inputValue);

        // create converters
        UnitConverter[] myConverter = new UnitConverter[7];
        myConverter[0] = new DollarToEuroConverter();
        myConverter[1] = new BolivianoToEuroConverter();
        myConverter[2] = new RubleToEuroConverter();
        myConverter[3] = new AcreToSquaremetreConverter();
        myConverter[4] = new SquareyardToSquaremetreConverter();
        myConverter[5] = new CupToLitreConverter();
        myConverter[6] = new GallonToLitreConverter();

        for (int i = 0; i < myConverter.length; i++) {
            if (conversion.equals(myConverter[i].toString())) {
                double value = Double.parseDouble(inputValue);
                double outputValue = myConverter[i].convert(value);
                System.out.println(myConverter[i].toString() + " has converted " + value + " " + myConverter[i].inputUnit() + " to " + outputValue + " " + myConverter[i].outputUnit() + "!");
            }
        }


    }
}
