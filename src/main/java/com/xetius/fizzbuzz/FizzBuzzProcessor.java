package com.xetius.fizzbuzz;

import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

class FizzBuzzProcessor {
    private int from;
    private int to;

    private FizzBuzzer fizzBuzzer;
    private FizzBuzzStats stats;

    void setParameters(Integer start, Integer end) {
        this.from = start;
        this.to = end;
    }

    String process() {
        return IntStream
                .rangeClosed(from, to)
                .mapToObj(fizzBuzzer::fizzBuzz)
                .collect(joining(" ")) +
                "\n" +
                stats.print();
    }

    void setFizzBuzzer(FizzBuzzer fizzBuzzer) {
        this.fizzBuzzer = fizzBuzzer;
    }

    void setStats(FizzBuzzStats stats) {
        this.stats = stats;
    }
}
