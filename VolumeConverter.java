//subclass for volumes
public abstract class VolumeConverter extends UnitConverter {
    //prints out the "name" of the class
    public void print() {
        System.out.println(toString());
    }
    //returns "l" because all values are converted to litres
    public String outputUnit() {
        return "l";
    }
}

