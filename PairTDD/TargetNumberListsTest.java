package fizzbuzz.pairtdd;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TargetNumberListsTest {
	@Test
	public void testCase1ShouldWorkCorrectly() {
		List<Double> numbers = Arrays.asList(new Double[] {2d, 5d, 7d, 9d, 12d, 15d});
		List<String> expected = Arrays.asList(new String[] {"2.0", "Buzz", "7.0", "Fizz", "Fizz", "FizzBuzz"});
		
		List<String> output = FizzBuzz.generateReplacedList(numbers);
		
		assertEquals(expected, output);
	}

	@Test
	public void testCase2ShouldWorkCorrectly() {
		List<Double> numbers = Arrays.asList(new Double[] {-3d, -2d, 0d, 7d, 9d, 11d});
		List<String> expected = Arrays.asList(new String[] {"Fizz", "-2.0", "Zero", "7.0", "Fizz", "11.0"});
		
		List<String> output = FizzBuzz.generateReplacedList(numbers);
		
		assertEquals(expected, output);
	}
	
	@Test
	public void testCase3ShouldWorkCorrectly() {
		List<Double> numbers = Arrays.asList(new Double[] {0d});
		List<String> expected = Arrays.asList(new String[] {"Zero"});
		
		List<String> output = FizzBuzz.generateReplacedList(numbers);
		
		assertEquals(expected, output);
	}
	
	@Test
	public void testCase4ShouldWorkCorrectly() {
		List<Double> numbers = Arrays.asList(new Double[] {33.33});
		List<String> expected = Arrays.asList(new String[] {"Fizz"});
		
		List<String> output = FizzBuzz.generateReplacedList(numbers);
		
		assertEquals(expected, output);
	}
}
