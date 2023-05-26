import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;
import java.util.List;

public class IPv6Validator {
    public static boolean isValidIPv6(String address) {
        if (address.indexOf("::") != address.lastIndexOf("::")) {
            return false;
        }

        List<String> parts = Arrays.asList(address.split(":"));

        if (parts.size() > 8) {
            return false;
        }

        if ((parts.size() > 7 & parts.contains("")) | (parts.size() < 8 & !address.contains("::"))) {
            return false;
        }

        if (parts.stream().filter((""::equals)).count() > 1 & !address.startsWith("::")) {
            return false;
        }

        if (address.endsWith(":") & !address.endsWith("::")) {
            return false;
        }

        for (String part : parts) {
            if (!part.equals("") & !NumberUtils.isCreatable("0x" + part)) {
                return false;
            }
            if (part.length() > 4) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // запуск
        // java -cp commons-lang3-3.12.0.jar IPv6Validator.java

        // true
        System.out.println(isValidIPv6("10:d3:2d06:24:400c:5ee0:be:3d"));
        System.out.println(isValidIPv6("0B0:0F09:7f05:e2F3:0D:0:e0:7000"));
        System.out.println(isValidIPv6("000::B36:3C:00F0:7:937"));
        System.out.println(isValidIPv6("::1"));
        System.out.println(isValidIPv6("::"));

        System.out.println();

        // false
        System.out.println(isValidIPv6("2607:G8B0:4010:801::1004"));
        System.out.println(isValidIPv6("1001:208:67:4f00:e3::2c6:0"));
        System.out.println(isValidIPv6("2.001::"));
        System.out.println(isValidIPv6("9f8:0:69S0:9:9:d9a:672:f90d"));
        System.out.println(isValidIPv6("e1b6:1daf9:6:0:c50:8c4:90e:e"));
        System.out.println(isValidIPv6("d:0:4:a004:3b96:10b0:10:800:15"));
        System.out.println(isValidIPv6(":1::1"));
        System.out.println(isValidIPv6("1::1:"));
    }
}
