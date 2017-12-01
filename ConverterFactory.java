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
        converters.put("acre to squaremetre", new AcreToSquaremetreConverter());
        converters.put("boliviano to euro", new BolivianoToEuroConverter());
        converters.put("cup to litre", new CupToLitreConverter());
        converters.put("dollar to euro", new DollarToEuroConverter());
        converters.put("gallon to litre", new GallonToLitreConverter());
        converters.put("ruble to euro", new RubleToEuroConverter());
        converters.put("squareyard to squaremetre", new SquareyardToSquaremetreConverter());
    }

    //factory method to create the matching converter
    public static UnitConverter create(String inputConverter) {
        //fillHashMap();
        return converters.get(inputConverter);
    }


}
