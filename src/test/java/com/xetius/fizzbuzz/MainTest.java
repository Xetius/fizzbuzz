package com.xetius.fizzbuzz;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;


@RunWith(MockitoJUnitRunner.class)
public class MainTest {

    @Mock
    private Logger log;

    @Mock
    private FizzBuzzProcessor processor;

    private Main main;

    @Before
    public void setUp() throws Exception {
        this.main = new Main();
        this.main.setLogger(log);
        this.main.setProcessor(processor);
    }

    @Test
    public void callingMainWithoutArgumentsLogsAnError() throws Exception {
        main.run(new String[]{});
        verify(log).error("No parameters given. Requires 2 parameters");
        verifyZeroInteractions(processor);
    }

    @Test
    public void callingMainWithAnythingOtherThanTwoArgumentsLogsAnError() throws Exception {
        main.run(new String[]{"1", "20", "31"});
        verify(log).error("Requires 2 parameters");
        verifyZeroInteractions(processor);
    }

    @Test
    public void callingMainWithNonNumericParametersLogsAnError() throws Exception {
        main.run(new String[]{"a", "b"});
        verify(log).error("Numeric parameters required");
        verifyZeroInteractions(processor);
    }

    @Test
    public void callingMainWithTwoIntegersSetsParametersAndRunsProcess() throws Exception {
        main.run(new String[]{"1", "20"});
        verify(processor).setParameters(1, 20);
        verify(processor).process();
    }
}