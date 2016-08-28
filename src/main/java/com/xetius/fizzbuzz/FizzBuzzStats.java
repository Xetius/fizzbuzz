package com.xetius.fizzbuzz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class FizzBuzzStats {

    private Map<FizzBuzzValue, MutableInteger> stats;

    FizzBuzzStats() {
        this.stats = new HashMap<>();
    }

    void record(String value) {
        FizzBuzzValue key = FizzBuzzValue.from(value);

        MutableInteger mutableInteger = stats.get(key);
        if (mutableInteger == null) {
            stats.put(key, new MutableInteger());
        } else {
            mutableInteger.increment();
        }
    }

    int get(FizzBuzzValue stat) {
        return stats.get(stat).get();
    }

    String print() {
        return Arrays.stream(FizzBuzzValue.values())
                .filter(value -> stats.get(value) != null)
                .map(value -> value.toString() + ": " + get(value))
                .collect(Collectors.joining("\n"));
    }
}
