import java.util.HashMap;

public class ConverterFactory {

    //Singleton pattern for ConverterFactory
    private static ConverterFactory SingleFactory = null;

    //fill the HashMap when the ConverterFactory is constructed
    protected ConverterFactory(){
        fillHashMap();
    }

    //counter to test if singleton pattern works
    public static int testCounter = 0;
    public static ConverterFactory instance(){
        //only create an instance if there is none yet
        if(SingleFactory == null){
            SingleFactory = new ConverterFactory();
            testCounter ++;
        }
        return SingleFactory;
    }

    //inspired by https://www.tutorialspoint.com/java/java_hashmap_class.htm
    private static HashMap<String, UnitConverter> converters = new HashMap<String, UnitConverter>();

    //create registry of converters
    public void fillHashMap() {

        //area converters
        converters.put("acre to squaremetre",       new AcreToSquaremetreConverter(         new AreaConverter()));
        converters.put("squaremetre to acre",       new InversionDecorator(                 new AcreToSquaremetreConverter(         new AreaConverter())));
        converters.put("squareyard to squaremetre", new SquareyardToSquaremetreConverter(   new AreaConverter()));
        converters.put("squaremetre to squareyard", new InversionDecorator(                 new SquareyardToSquaremetreConverter(   new AreaConverter())));

        converters.put("squareyard to acre",        new SquareyardToSquaremetreConverter(new InversionDecorator(new AcreToSquaremetreConverter(new CurrencyConverter()))));
        converters.put("acre to squareyard",        new AcreToSquaremetreConverter(new InversionDecorator(new SquareyardToSquaremetreConverter(new CurrencyConverter()))));

        //volume converters
        converters.put("cup to litre",              new CupToLitreConverter(                new VolumeConverter()));
        converters.put("litre to cup",              new InversionDecorator(                 new CupToLitreConverter(                new VolumeConverter())));
        converters.put("gallon to litre",           new GallonToLitreConverter(             new VolumeConverter()));
        converters.put("litre to gallon",           new InversionDecorator(                 new GallonToLitreConverter(             new VolumeConverter())));

        converters.put("cup to gallon",             new CupToLitreConverter(new InversionDecorator(new GallonToLitreConverter(new CurrencyConverter()))));
        converters.put("gallon to cup",             new GallonToLitreConverter(new InversionDecorator(new CupToLitreConverter(new CurrencyConverter()))));

        //currency converters
        converters.put("boliviano to euro",         new BolivianoToEuroConverter(           new CurrencyConverter()));
        converters.put("euro to boliviano",         new InversionDecorator(                 new BolivianoToEuroConverter(           new CurrencyConverter())));
        converters.put("dollar to euro",            new DollarToEuroConverter(              new CurrencyConverter()));
        converters.put("euro to dollar",            new InversionDecorator(                 new DollarToEuroConverter(              new CurrencyConverter())));
        converters.put("ruble to euro",             new RubleToEuroConverter(               new CurrencyConverter()));
        converters.put("euro to ruble",             new InversionDecorator(                 new RubleToEuroConverter(               new CurrencyConverter())));

        converters.put("boliviano to dollar",       new BolivianoToEuroConverter(new InversionDecorator(new DollarToEuroConverter(new CurrencyConverter()))));
        converters.put("dollar to boliviano",       new DollarToEuroConverter(new InversionDecorator(new BolivianoToEuroConverter(new CurrencyConverter()))));

        converters.put("ruble to boliviano",        new RubleToEuroConverter(new InversionDecorator(new BolivianoToEuroConverter(new CurrencyConverter()))));
        converters.put("boliviano to ruble",        new BolivianoToEuroConverter(new InversionDecorator(new RubleToEuroConverter(new CurrencyConverter()))));

        converters.put("ruble to dollar",           new RubleToEuroConverter(new InversionDecorator(new DollarToEuroConverter(new CurrencyConverter()))));
        converters.put("dollar to ruble",           new DollarToEuroConverter(new InversionDecorator(new RubleToEuroConverter(new CurrencyConverter()))));





    }

    //factory method to create the matching converter
    public static UnitConverter create(String inputConverter) {
        //fillHashMap();
        return converters.get(inputConverter);
    }


}
