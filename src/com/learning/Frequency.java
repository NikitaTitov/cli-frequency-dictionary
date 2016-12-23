package com.learning;


import com.learning.util.CLIParser;
import com.learning.util.FrequencyDictionary;
import com.learning.util.ReadFromFile;

public class Frequency {
    public static void main(String[] args) {
        String fullTextAsLine = ReadFromFile.getAllLines(CLIParser.parse(args)[0]);
        FrequencyDictionary.searchForRepeat(fullTextAsLine);

    }
}
