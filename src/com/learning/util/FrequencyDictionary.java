package com.learning.util;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.function.Function.*;
import static java.util.stream.Collectors.*;
import static com.learning.util.ParseString.*;

public final class FrequencyDictionary {
    private FrequencyDictionary() {
    }

    public static Map<String, Integer> searchForRepeat(String incomeString) {
        List<String> list = Arrays.asList(parse(incomeString));
        return list.stream()
                .collect(groupingBy(identity(),summingInt((String str) -> 1)));
    }
}