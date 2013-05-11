package fizzbuzz.pairtdd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;


public class UndoFizzBuzzTest {
	@Test
	public void generateReversedFizzBuzzShouldReturnUndoneList() {
		List<String> fizzBuzz = Arrays.asList(new String[] {"2", "Fizz", "4", "Buzz"});
		List<List<Double>> expected = new ArrayList<List<Double>>();
		expected.add(Arrays.asList(new Double[] {2d}));
		expected.add(Arrays.asList(new Double[] {3d}));
		expected.add(Arrays.asList(new Double[] {4d}));
		expected.add(Arrays.asList(new Double[] {5d}));
		
		List<List<Double>> undone = UndoFizzBuzz.generateUndoneFizzBuzz(fizzBuzz);
		
		assertEquals(expected, undone);
	}

	@Test
	public void generateReversedFizzBuzzShouldReturnUndoneListWhenMultipleFizzes() {
		List<String> fizzBuzz = Arrays.asList(new String[] {"2", "Fizz", "4", "Buzz", "Fizz"});
		List<List<Double>> expected = new ArrayList<List<Double>>();
		expected.add(Arrays.asList(new Double[] {2d}));
		expected.add(Arrays.asList(new Double[] {3d, 6d}));
		expected.add(Arrays.asList(new Double[] {4d}));
		expected.add(Arrays.asList(new Double[] {5d}));
		expected.add(Arrays.asList(new Double[] {3d, 6d}));
		
		List<List<Double>> undone = UndoFizzBuzz.generateUndoneFizzBuzz(fizzBuzz);
		
		assertEquals(expected, undone);
	}

	@Test
	public void generateReversedFizzBuzzShouldReturnUndoneListWhenMultipleBuzzes() {
		List<String> fizzBuzz = Arrays.asList(new String[] {"2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"});
		List<List<Double>> expected = new ArrayList<List<Double>>();
		expected.add(Arrays.asList(new Double[] {2d}));
		expected.add(Arrays.asList(new Double[] {3d, 6d, 9d}));
		expected.add(Arrays.asList(new Double[] {4d}));
		expected.add(Arrays.asList(new Double[] {5d, 10d}));
		expected.add(Arrays.asList(new Double[] {3d, 6d, 9d}));
		expected.add(Arrays.asList(new Double[] {7d}));
		expected.add(Arrays.asList(new Double[] {8d}));
		expected.add(Arrays.asList(new Double[] {3d, 6d, 9d}));
		expected.add(Arrays.asList(new Double[] {5d, 10d}));
		
		List<List<Double>> undone = UndoFizzBuzz.generateUndoneFizzBuzz(fizzBuzz);
		
		assertEquals(expected, undone);
	}

	@Test
	public void generateReversedFizzBuzzShouldReturnUndoneListWhenContainsFizzBuzz() {
		List<String> fizzBuzz = Arrays.asList(new String[] {"14", "FizzBuzz", "16", "FizzBuzz", "18"});
		List<List<Double>> expected = new ArrayList<List<Double>>();
		expected.add(Arrays.asList(new Double[] {14d}));
		expected.add(Arrays.asList(new Double[] {15d, 17d}));
		expected.add(Arrays.asList(new Double[] {16d}));
		expected.add(Arrays.asList(new Double[] {15d, 17d}));
		expected.add(Arrays.asList(new Double[] {18d}));
		
		List<List<Double>> undone = UndoFizzBuzz.generateUndoneFizzBuzz(fizzBuzz);
		
		assertEquals(expected, undone);
	}
}
