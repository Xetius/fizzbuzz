package com.xetius.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzerTest {

    private FizzBuzzer fizzBuzzer;

    @Before
    public void setUp() throws Exception {
        fizzBuzzer = new FizzBuzzer();
    }

    @Test
    public void fizzBuzzWillReturnTheNumberGiven_whenGivenOne() throws Exception {
        String response = fizzBuzzer.fizzBuzz(1);
        assertThat(response).isEqualTo("1");
    }

    @Test
    public void fizzBuzzWillReturnFizz_whenTheNumberIsDivisibleByThree() throws Exception {
        String response = fizzBuzzer.fizzBuzz(3);
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
}