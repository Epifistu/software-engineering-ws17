//subclass for volumes
public class VolumeConverter implements UnitConverter {

    //prints out the "name" of the class
    public void print() {
        System.out.println(toString());
    }
    //returns l" because all values are converted to square litres
    public String outputUnit() {
        return "Litres";
    }
    //factor to convert by
    public double convertFactor(){
        return Double.parseDouble(null);
    }
    //conversion method that takes the input value
    public double convert(double inValue) {
        try {
            //negative or 0 volume can't be converted
            if(inValue <= 0) {
                throw new EmptyVolume();
            }
        } catch (EmptyVolume emptyVolume) {
            emptyVolume.printStackTrace();
            // stop the program in case of exception
            System.exit(1);
        }
        return inValue;
    }
    //returns the "name" of the class
    public String toString(){
        return null;
    }
    //returns the input unit
    public String inputUnit(){
        return null;
    }

}