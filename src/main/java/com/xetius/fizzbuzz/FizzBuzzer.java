package com.xetius.fizzbuzz;

class FizzBuzzer {

    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";
    private static final String FIZZBUZZ = "fizzbuzz";
    private static final String LUCK = "luck";

    String fizzBuzz(int i) {
        String response = String.valueOf(i);
        if (isDivisibleByThree(i)) {
            response = FIZZ;
        }

        if (isDivisibleByFive(i)) {
            response = BUZZ;
        }

        if (isDivisibleByThree(i) && isDivisibleByFive(i)) {
            response = FIZZBUZZ;
        }

        if (endsWithThree(i)) {
            response = LUCK;
        }
        return response;
    }

    private boolean isDivisibleByThree(int i) {
        return isDivisibleBy(i, 3);
    }

    private boolean isDivisibleByFive(int i) {
        return isDivisibleBy(i, 5);
    }

    private boolean isDivisibleBy(int i, int dividedBy) {
        return i % dividedBy == 0;
    }

    private boolean endsWithThree(int i) {
        return (i % 10 == 3);
    }
}
