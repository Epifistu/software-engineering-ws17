public class CupToLitreConverter extends VolumeConverterCooking {

    public CupToLitreConverter() {
    }

    public double convert(double inCups) {
        return inCups * 0.24;
    }

    public String inputUnit() {
        return "cups";
    }

    public String toString() {
        return "Cup to Litre Converter";
    }
}
