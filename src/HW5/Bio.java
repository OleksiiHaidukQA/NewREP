package HW5;

    public class Bio {
        public String dnaToRna(String dna) {
            return dna.replaceAll("[T]", "U");
        }
    }