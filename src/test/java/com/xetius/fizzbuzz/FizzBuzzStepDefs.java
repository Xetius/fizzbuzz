package com.xetius.fizzbuzz;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzStepDefs {
    private FizzBuzzProcessor processor;

    @Given("^if I run the program over a range from (\\d+)-(\\d+)$")
    public void ifIRunTheProgramOverARangeFrom(int from, int to) throws Throwable {
        processor = new FizzBuzzProcessor();
        processor.setParameters(from, to);
        processor.setFizzBuzzer(new FizzBuzzer());
    }

    @Then("^I should get the output: (.*)$")
    public void iShouldGetTheOutput(String expectedOutput) throws Throwable {
        String actualOutput = processor.process();
        assertThat(expectedOutput).isEqualTo(actualOutput);
    }
}
