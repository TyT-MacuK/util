package by.koroza.util;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {
    public boolean isPositiveNumber(String str) {
        return StringUtils.isNumeric(str) && Integer.parseInt(str) > 0;
    }
}
