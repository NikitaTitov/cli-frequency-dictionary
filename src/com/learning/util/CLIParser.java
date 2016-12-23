package com.learning.util;


import org.apache.commons.cli.*;

public class CLIParser {
    private static CommandLine line;
    private static Options options = new Options();
    private static Option firstOption = new Option("s", "sourcefile", true, "source path to file");
    private static Option helpOption = new Option("h", "help", true, "show help");
    private static CommandLineParser parser = new PosixParser();

    private CLIParser() {
    }


    public static String[] parse(String[] args) {
        String[] arrayOfValues = new String[args.length];


        if (args.length == 0) {
            System.out.println("Empty string");
            printCLIHelp();
        }

        try {
            line = parser.parse(getOptions(), args);
            if (line.hasOption("h") || line.hasOption("help")) {
                printCLIHelp();
            }
            if (line.hasOption("s") || line.hasOption("sourcefile")) {
                arrayOfValues[0] = line.getOptionValue("sourcefile");
            } else {
                printCLIHelp();
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return arrayOfValues;
    }

    private static Options getOptions() {
        return options
                .addOption(firstOption)
                .addOption(helpOption);
    }


    public static void printCLIHelp() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("Frequency dictionary", options);
    }
}
