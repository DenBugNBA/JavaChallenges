public class NRZIEncoding {
    public static String nrzi(String signal) {
        String processedSignal  = signal.replace("|", "");

        if (processedSignal.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        char firstChar = signal.charAt(0);

        if (firstChar == '|') {
            sb.append("1");
        } else {
            sb.append("0");
        }

        char prevChar = processedSignal.charAt(0);

        for (int i = 1; i < processedSignal.length(); i++) {
            if (processedSignal.charAt(i) != prevChar) {
                sb.append("1");
            } else {
                sb.append("0");
            }

            prevChar = processedSignal.charAt(i);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        var signal1 = "_|¯|____|¯|__|¯¯¯";
        System.out.println(nrzi(signal1)); // "011000110100"

        var signal2 = "|¯|___|¯¯¯¯¯|___|¯|_|¯";
        System.out.println(nrzi(signal2));  // "110010000100111"

        var signal3 = "¯|___|¯¯¯¯¯|___|¯|_|¯";
        System.out.println(nrzi(signal3));  // "010010000100111"

        var signal4 = "";
        System.out.println(nrzi(signal4));  // ""

        var signal5 = "|";
        System.out.println(nrzi(signal5));  // ""
    }
}
