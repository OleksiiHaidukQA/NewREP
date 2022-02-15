package HW5;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {

        String[] init = name.split(" ");
        return init[0].substring(0, 1).toUpperCase().concat("."+ init[1].substring(0, 1).toUpperCase());
    }
}