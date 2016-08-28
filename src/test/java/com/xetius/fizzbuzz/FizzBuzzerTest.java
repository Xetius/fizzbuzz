package com.xetius.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static com.xetius.fizzbuzz.FizzBuzzValue.FIZZ;
import static com.xetius.fizzbuzz.FizzBuzzValue.NUMBER;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzerTest {

    private FizzBuzzer fizzBuzzer;
    private FizzBuzzStats stats;

    @Before
    public void setUp() throws Exception {
        stats = new FizzBuzzStats();
        fizzBuzzer = new FizzBuzzer();
        fizzBuzzer.setStats(stats);
    }

    @Test
    public void fizzBuzzWillReturnTheNumberGiven_whenGivenOne() throws Exception {
        String response = fizzBuzzer.fizzBuzz(1);
        assertThat(response).isEqualTo("1");
    }

    @Test
    public void fizzBuzzWillReturnFizz_whenTheNumberIsDivisibleByThree() throws Exception {
        String response = fizzBuzzer.fizzBuzz(6);
        assertThat(response).isEqualTo("fizz");
    }

    @Test
    public void fizzBuzzWillReturnFizz_whenLargerNumbersAreDivisibleByThree() throws Exception {
        String response = fizzBuzzer.fizzBuzz(18);
        assertThat(response).isEqualTo("fizz");
    }

    @Test
    public void fizzBuzzWillReturnBuzz_whenNumbersAreDivisibleByFive() throws Exception {
        String response = fizzBuzzer.fizzBuzz(5);
        assertThat(response).isEqualTo("buzz");
    }

    @Test
    public void fizzBuzzWillReturnBuzz_whenLargerNumbersAreDivisibleByFive() throws Exception {
        String response = fizzBuzzer.fizzBuzz(20);
        assertThat(response).isEqualTo("buzz");
    }

    @Test
    public void fizzBuzzWillReturnFizzBuzz_whenNumberIsDivisibleByBothFiveAndThree() throws Exception {
        String response = fizzBuzzer.fizzBuzz(15);
        assertThat(response).isEqualTo("fizzbuzz");
    }

    @Test
    public void fizzBuzzWillReturnLuck_whenNumberEndsWithThree() throws Exception {
        String response = fizzBuzzer.fizzBuzz(3);
        assertThat(response).isEqualTo("luck");
    }

    @Test
    public void callingFizzBuzzWithFizzNumberIncrementsFizzCount() throws Exception {
        fizzBuzzer.fizzBuzz(6);
        assertThat(stats.get(FIZZ)).isEqualTo(1);
    }

    @Test
    public void callingFizzBuzzwithNumberIncrementsNumberCount() throws Exception {
        fizzBuzzer.fizzBuzz(4);
        assertThat(stats.get(NUMBER)).isEqualTo(1);
    }
}