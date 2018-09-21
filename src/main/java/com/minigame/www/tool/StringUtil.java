package com.minigame.www.tool;

public class StringUtil {

    public static boolean isNotEmpty(Object str) {
        return !isEmpty(str);
    }

    public static boolean isEmpty(Object str) {
        return str == null || "".equals(str) ;
    }
}
