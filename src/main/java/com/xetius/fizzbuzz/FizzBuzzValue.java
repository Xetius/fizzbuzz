package com.xetius.fizzbuzz;

import java.util.Arrays;

enum FizzBuzzValue {
    FIZZ,
    BUZZ,
    FIZZBUZZ,
    LUCK,
    NUMBER;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }

    public static FizzBuzzValue from(String key) {
        return Arrays.stream(FizzBuzzValue.values()).filter(value -> value.name().equalsIgnoreCase(key)).findFirst().orElse(NUMBER);
    }
}
