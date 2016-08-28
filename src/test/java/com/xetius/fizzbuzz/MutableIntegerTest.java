package com.xetius.fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MutableIntegerTest {

    @Test
    public void newMutableIntegerHasValueOfOne() throws Exception {
        MutableInteger value = new MutableInteger();
        assertThat(value.get()).isEqualTo(1);
    }

    @Test
    public void incrementMethodIncreasesValueByOne() throws Exception {
        MutableInteger mutableInteger = new MutableInteger();
        mutableInteger.increment();
        assertThat(mutableInteger.get()).isEqualTo(2);
    }
}