package HW5;

    public class RemoveChars {
        public static String remove(String str) {

            int strLength = str.length();
            return str.substring(1,strLength-1);
        }
    }