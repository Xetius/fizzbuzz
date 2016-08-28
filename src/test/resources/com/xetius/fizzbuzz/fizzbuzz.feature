Feature: FizzBuzz application

  Scenario: Step 3.  Output Stats
    Given if I run the program over a range from 1-20
    Then I should get the output:
    """
    1 2 luck 4 buzz fizz 7 8 fizz buzz 11 fizz luck 14 fizzbuzz 16 17 fizz 19 buzz
    fizz: 4
    buzz: 3
    fizzbuzz: 1
    luck: 2
    number: 10
    """
