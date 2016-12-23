package com.learning.util;


import java.io.*;

import static com.learning.util.CLIParser.printCLIHelp;

public final class ReadFromFile {


    private ReadFromFile() {
    }

    public static String getAllLines(String incomePath) {
        StringBuilder builder = new StringBuilder();
        try (FileInputStream incomeLine = new FileInputStream(incomePath)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(incomeLine));
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No such file");
            printCLIHelp();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}