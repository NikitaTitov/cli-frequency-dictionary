package com.learning;

import static com.learning.util.ReadFromFile.*;

import com.learning.util.FrequencyDictionary;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FrequencyTest {

    @Test
    public void testFrequency() throws Exception {
        String sourcePathToFile = "D:\\IdeaRepository\\cli-frequency-dictionary\\src\\com\\learning\\source\\test.txt";
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("one", 3);
        expectedResult.put("two", 3);
        Map<String, Integer> result = FrequencyDictionary.searchForRepeat(getAllLines(sourcePathToFile));

        assertEquals(expectedResult,result);




    }
}