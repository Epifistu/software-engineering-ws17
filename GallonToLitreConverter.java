public class GallonToLitreConverter extends VolumeConverterCooking {

    public GallonToLitreConverter() {
    }

    public double convert(double inGallons) {
        return inGallons * 3.84;
    }

    public String inputUnit() {
        return "gallons";
    }

    public String toString() {
        return "Gallon to Litre Converter";
    }
}
