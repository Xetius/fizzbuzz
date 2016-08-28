package com.xetius.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger log = LoggerFactory.getLogger(Main.class);

    private Integer start;
    private Integer end;
    private FizzBuzzProcessor processor;

    public static void main(String[] args) {
        Main main = new Main();
        FizzBuzzStats stats = new FizzBuzzStats();
        FizzBuzzProcessor processor = new FizzBuzzProcessor();
        processor.setStats(stats);
        FizzBuzzer fizzBuzzer = new FizzBuzzer();
        fizzBuzzer.setStats(stats);
        processor.setFizzBuzzer(fizzBuzzer);
        main.setProcessor(processor);
        main.run(args);
    }

    void run(String[] args) {
        if (verifyArguments(args)) {
            processor.setParameters(start, end);
            System.out.println(processor.process());
        }
    }

    private boolean verifyArguments(String[] args) {
        if (args.length == 0) {
            log.error("No parameters given. Requires 2 parameters");
            return false;
        }

        if (args.length != 2) {
            log.error("Requires 2 parameters");
            return false;
        }

        try {
            start = Integer.parseInt(args[0]);
            end = Integer.parseInt(args[1]);
            return true;

        } catch (NumberFormatException ex) {
            log.error("Numeric parameters required");
            return false;
        }

    }

    void setLogger(Logger log) {
        Main.log = log;
    }

    void setProcessor(FizzBuzzProcessor processor) {
        this.processor = processor;
    }
}
