package HW5;

public class ReturnTheSpaces {
    public static String noSpace(final String x) {
        String noSpacesStr = new String(x);
        return noSpacesStr.replace(" ", "");
    }
}