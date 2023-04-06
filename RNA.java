public class RNA {
    public static String dnaToRna(String DNA) {
        var resultRNA = "";

        for (var i = 0; i < DNA.length(); i += 1) {
            switch (DNA.charAt(i)) {
                case 'G':
                    resultRNA += "C";
                    break;
                case 'C':
                    resultRNA += "G";
                    break;
                case 'T':
                    resultRNA += "A";
                    break;
                case 'A':
                    resultRNA += "U";
                    break;
                default:
                    return null;
            }
        }

        return resultRNA;
    }

    public static void main(String[] args) {
        System.out.println(dnaToRna("ACGTGGTCTTAA")); // "UGCACCAGAAUU"
        System.out.println(dnaToRna("CCGTA")); // "GGCAU"
        System.out.println(dnaToRna("")); // ""
        System.out.println(dnaToRna("ACNTG")); // null
    }
}
