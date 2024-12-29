import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    // Test cases for valid inputs
    @Test
    public void testFizzBuzzWithValidInput() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Equivalent class 1: Not divisible by 3 nor 5
        assertEquals("1", fizzBuzz.generate(1));

        // Equivalent class 2: Divisible By 3 but not 5
        assertEquals("1, 2, Fizz", fizzBuzz.generate(3));

        // Equivalent class 2: Divisible by 5 but not 3
        assertEquals("1, 2, Fizz, 4, Buzz", fizzBuzz.generate(5)); // Test input 5

        // Equivalent class 2: Divisible by both 3 and 5
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz", fizzBuzz.generate(15)); // Test input 15
    }

    // Test case for edge cases
    @Test
    public void testFizzBuzzWithEdgeCases() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Edge case: Minimal valid input
        assertEquals("1", fizzBuzz.generate(1));

        // Edge case: Maximal input
        String expected = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz, 31, 32, Fizz, 34, Buzz, Fizz, 37, 38, Fizz, Buzz, 41, Fizz, 43, 44, FizzBuzz, 46, 47, Fizz, 49, Buzz, Fizz, 52, 53, Fizz, Buzz, 56, Fizz, 58, 59, FizzBuzz, 61, 62, Fizz, 64, Buzz, Fizz, 67, 68, Fizz, Buzz, 71, Fizz, 73, 74, FizzBuzz, 76, 77, Fizz, 79, Buzz, Fizz, 82, 83, Fizz, Buzz, 86, Fizz, 88, 89, FizzBuzz, 91, 92, Fizz, 94, Buzz, Fizz, 97, 98, Fizz, Buzz";
        assertEquals(expected, fizzBuzz.generate(100));
    }

    // Test cases for invalid inputs
    @Test(expected = IllegalArgumentException.class)
    public void testFizzBuzzWithInvalidInputBelowRange() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.generate(0); // Invalid input: Below range (less than 1)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFizzBuzzWithInvalidInputAboveRange() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.generate(101); // Invalid input: Above range (greater than 100)
    }
}
