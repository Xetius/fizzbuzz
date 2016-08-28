package com.xetius.fizzbuzz;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzProcessorTest {

    @Mock
    private FizzBuzzer fizzBuzzer;
    private FizzBuzzProcessor processor;

    @Before
    public void setUp() throws Exception {
        processor = new FizzBuzzProcessor();
        processor.setFizzBuzzer(fizzBuzzer);
    }

    @Test
    public void processorCallsFizzBuzzForEachValueInRange() throws Exception {
        processor.setParameters(1, 10);
        processor.process();
        verify(fizzBuzzer, times(10)).fizzBuzz(anyInt());
    }
}