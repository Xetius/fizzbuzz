package com.xetius.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static com.xetius.fizzbuzz.FizzBuzzValue.BUZZ;
import static com.xetius.fizzbuzz.FizzBuzzValue.FIZZ;
import static com.xetius.fizzbuzz.FizzBuzzValue.FIZZBUZZ;
import static com.xetius.fizzbuzz.FizzBuzzValue.LUCK;
import static com.xetius.fizzbuzz.FizzBuzzValue.NUMBER;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzStatsTest {

    private FizzBuzzStats stats;

    @Before
    public void setUp() throws Exception {
        stats = new FizzBuzzStats();
    }

    @Test
    public void recordingFizzIncrementsFizzCount() throws Exception {
        stats.record("fizz");
        assertThat(stats.get(FIZZ)).isEqualTo(1);
    }

    @Test
    public void recordingMultipleFizzCountsCorrectly() throws Exception {
        stats.record("fizz");
        stats.record("fizz");
        stats.record("fizz");
        stats.record("fizz");
        assertThat(stats.get(FIZZ)).isEqualTo(4);
    }

    @Test
    public void recordingBuzzIncrementsBuzzCount() throws Exception {
        stats.record("buzz");
        assertThat(stats.get(BUZZ)).isEqualTo(1);
    }

    @Test
    public void recordingMultipleBuzzCountsCorrectly() throws Exception {
        stats.record("buzz");
        stats.record("buzz");
        stats.record("buzz");
        stats.record("buzz");
        stats.record("buzz");
        stats.record("buzz");
        assertThat(stats.get(BUZZ)).isEqualTo(6);
    }

    @Test
    public void recordingFizzBuzzIncrementsFizzBuzzCount() throws Exception {
        stats.record("fizzbuzz");
        assertThat(stats.get(FIZZBUZZ)).isEqualTo(1);
    }

    @Test
    public void recordingMultipleFizzBuzzCountsCorrectly() throws Exception {
        stats.record("fizzbuzz");
        stats.record("fizzbuzz");
        stats.record("fizzbuzz");
        assertThat(stats.get(FIZZBUZZ)).isEqualTo(3);
    }

    @Test
    public void recordingLuckIncrementsLuckCount() throws Exception {
        stats.record("luck");
        assertThat(stats.get(LUCK)).isEqualTo(1);
    }

    @Test
    public void recordingMultipleLuckCountsCorrectly() throws Exception {
        stats.record("luck");
        stats.record("luck");
        stats.record("luck");
        stats.record("luck");
        assertThat(stats.get(LUCK)).isEqualTo(4);
    }

    @Test
    public void recordingNumbersIncrementsNumberCount() throws Exception {
        stats.record("1");
        assertThat(stats.get(NUMBER)).isEqualTo(1);
    }

    @Test
    public void recordingMultipleNumbersCountsCorrectly() throws Exception {
        stats.record("2");
        stats.record("4");
        stats.record("5");
        stats.record("7");
        assertThat(stats.get(NUMBER)).isEqualTo(4);
    }
}