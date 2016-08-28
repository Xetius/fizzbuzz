package com.xetius.fizzbuzz;

import org.junit.Test;

import static com.xetius.fizzbuzz.FizzBuzzValue.FIZZ;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class FizzBuzzValuesTest {
    @Test
    public void toStringReturnsLowerCaseString() throws Exception {
        assertThat(FIZZ.toString()).isEqualTo("fizz");
    }

    @Test
    public void fromReturnsFizzBuzzValueFromString() throws Exception {
        assertThat(FizzBuzzValue.from("fizz")).isEqualTo(FIZZ);
    }
}