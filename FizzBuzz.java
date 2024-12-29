// FizzBuzz Implementation
public class FizzBuzz {

    // Method to generate FizzBuzz sequence
    public String generate(int n) {
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException("Input must be between 1 and 100.");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.append("FizzBuzz");
            } else if (i % 3 == 0) {
                result.append("Fizz");
            } else if (i % 5 == 0) {
                result.append("Buzz");
            } else {
                result.append(i);
            }

            if (i != n) {
                result.append(", ");
            }
        }

        return result.toString();
    }
}
