package HW5;

    class Multitable {
        public static String multiTable(int num) {
            String s = "";
            for(int i=1; i<=10; i++){
                if(i!=10) s += i+" * "+num+" = "+i*num+"\n";
                else s += i+" * "+num+" = "+i*num;
            }
            return s;

        }
    }