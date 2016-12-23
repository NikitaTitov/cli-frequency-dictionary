package com.learning.util;

import java.util.regex.Pattern;

public final class ParseString {
    private static String regexp = "[^a-zA-Z]+";
    private static Pattern pattern = Pattern.compile(regexp, Pattern.CASE_INSENSITIVE);

    private ParseString() {

    }

    public static String[] parse(String incomeString) {
        return pattern.split(incomeString.toLowerCase());
    }
}