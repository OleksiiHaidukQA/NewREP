package HW3;

public class ConvertBooleanValuesToStringsYesorNo {
    class YesOrNo
    {
        public static String boolToWord(boolean b)
        {

            if(b == true)
            {
                return "Yes";
            }

            if(b == false)
            {
                return "No";
            }

            return "no value provided";
        }

    }

}
