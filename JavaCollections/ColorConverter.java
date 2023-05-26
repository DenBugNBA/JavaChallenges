import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ColorConverter {
    public static String rgbToHex(int r, int g, int b) {
        StringBuilder builder = new StringBuilder();

        builder.append("#");

        for (int color : List.of(r, g, b)) {
            String hexColor = Integer.toHexString(color);
            if (hexColor.length() < 2) {
                builder.append("0");
            }
            builder.append(hexColor);
        }

        return builder.toString();
    }

    public static Map<String, Integer> hexToRgb(String hex) {
        Map<String, Integer> rgbMap = new HashMap<>();

        rgbMap.put("r", Integer.parseInt(hex.substring(1, 3), 16));
        rgbMap.put("g", Integer.parseInt(hex.substring(3, 5), 16));
        rgbMap.put("b", Integer.parseInt(hex.substring(5), 16));

        return rgbMap;
    }

    public static void main(String[] args) {
        System.out.println(rgbToHex(36, 171, 0));
        System.out.println(hexToRgb("#24ab00"));
    }
}
