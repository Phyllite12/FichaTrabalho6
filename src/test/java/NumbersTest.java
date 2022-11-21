import exercício_2.Numbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumbersTest {
    private Numbers numbers;

    @BeforeEach
    public void setup() {
        System.out.println("Instantiating Contact Manager");
        numbers = new Numbers();
    }

    @Nested
    class ParameterizedTests {
        @ParameterizedTest
        @ValueSource(ints = {3, 23, 311, 487, 653, 947})
        public void isPrimeTest (int number){
            assertTrue(numbers.isPrime(number));
        }

        @ParameterizedTest
        @ValueSource(ints = {32, 64, 2, 20, 30, 26})
        public void isEvenTest (int number){
            assertTrue(numbers.isEven(number));
        }

        @ParameterizedTest
        @ValueSource(ints = {23, 46, 115, 184, 207, 230})
        public void isMultipleTest (int number){
            assertTrue(numbers.isMultiple(number,23));
        }
    }

}