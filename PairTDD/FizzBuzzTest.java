package fizzbuzz.pairtdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void generateReplacedListShouldNotReplaceWithFizzIfAlreadyReplacedWithBuzz() {
		List<Double> inputList = Arrays.asList(new Double[] {310d});
		
		List<String> output = FizzBuzz.generateReplacedList(inputList);
		
		assertEquals(1, output.size());
		assertEquals("Buzz", output.get(0));
	}
	
	@Test
	public void generateReplacedListShouldNotReplaceWithBuzzIfAlreadyReplacedWithFizz() {
		List<Double> inputList = Arrays.asList(new Double[] {51d});
		
		List<String> output = FizzBuzz.generateReplacedList(inputList);
		
		assertEquals(1, output.size());
		assertEquals("Fizz", output.get(0));
	}
	
	@Test
	public void generateReplacedListShouldReplaceMutiplesOfThreeAndFiveWithFizzBuzz() {
		List<Double> inputList = Arrays.asList(new Double[] {45d});
		
		List<String> output = FizzBuzz.generateReplacedList(inputList);
		
		assertEquals(1, output.size());
		assertEquals("FizzBuzz", output.get(0));
	}

	
	@Test
	public void generateListOfNumbersShouldGenerateListFrom0To100() {
		List<Double> actual = FizzBuzz.generateNumberList();

		assertEquals(101, actual.size());
		for( int i = 0; i <= 100; i++ ) {
			assertEquals(Double.valueOf(i), actual.get(i));
		}
	}
	
	@Test
	public void generateReplacedListShouldGenerateListWithMultiplesOfThreeReplacedByFizz() {
		List<Double> inputList = Arrays.asList(new Double[] {1d, 3d});
		
		List<String> output = FizzBuzz.generateReplacedList(inputList);
		
		assertEquals(2, output.size());
		assertEquals("1.0", output.get(0));
		assertEquals("Fizz", output.get(1));
	}
	
	@Test
	public void generateReplacedListShouldGenerateListWithMultiplesOfFiveReplacedByBuzz() {
		List<Double> inputList = Arrays.asList(new Double[] {1d, 5d});
		
		List<String> output = FizzBuzz.generateReplacedList(inputList);
		
		assertEquals(2, output.size());
		assertEquals("1.0", output.get(0));
		assertEquals("Buzz", output.get(1));
	}
	
	@Test
	public void generateReplacedListShouldReplaceNumbersContainingThreeWithFizz() {
		List<Double> inputList = Arrays.asList(new Double[] {13d});
		
		List<String> output = FizzBuzz.generateReplacedList(inputList);
		
		assertEquals(1, output.size());
		assertEquals("Fizz", output.get(0));
	}

	@Test
	public void generateReplacedListShouldReplaceNumbersContainingFiveWithBuzz() {
		List<Double> inputList = Arrays.asList(new Double[] {52d});
		
		List<String> output = FizzBuzz.generateReplacedList(inputList);
		
		assertEquals(1, output.size());
		assertEquals("Buzz", output.get(0));
	}
	
	@Test
	public void generateReplacedListShouldReplaceZeroWithZero() {
		List<Double> inputList = Arrays.asList(new Double[] {0d});
		
		List<String> output = FizzBuzz.generateReplacedList(inputList);
		
		assertEquals(1, output.size());
		assertEquals("Zero", output.get(0));
	}
	
	@Test
	public void generateForwardBackwardForwardListShouldReplicateListForwardBackwardForward() {
		List<String> inputList = Arrays.asList(new String[] {"Zero", "Tom", "2", "FOO"});
		
		List<String> output = FizzBuzz.generateForwardBackwardForwardList(inputList);
		
		assertEquals(12, output.size());
		assertEquals("Zero", output.get(0));
		assertEquals("Tom", output.get(1));
		assertEquals("2", output.get(2));
		assertEquals("FOO", output.get(3));
		assertEquals("FOO", output.get(4));
		assertEquals("2", output.get(5));
		assertEquals("Tom", output.get(6));
		assertEquals("Zero", output.get(7));
		assertEquals("Zero", output.get(8));
		assertEquals("Tom", output.get(9));
		assertEquals("2", output.get(10));
		assertEquals("FOO", output.get(11));
	}
	
	@Test
	public void generateReplacedListShouldPrependPrefixToNumbersOnly() {
		List<Double> inputList = Arrays.asList(new Double[] {0d, 1d, 2d, 3d});
		
		List<String> output = FizzBuzz.generateReplacedList(inputList, "-");
		
		assertEquals(4, output.size());
		assertEquals("Zero", output.get(0));
		assertEquals("-1.0", output.get(1));
		assertEquals("-2.0", output.get(2));
		assertEquals("Fizz", output.get(3));
	}
	
	@Test
	public void generateFinalListShouldGenerateForwardBackwardForwardWithBothPositiveAndNegativeNumbers() {
		List<Double> inputList = Arrays.asList(new Double[] {0d, 1d, 5d, 3d, 15d});
		
		List<String> output = FizzBuzz.generateFinalList(inputList);
		
		assertEquals(30, output.size());
		verifyPositiveList(output);
		verifyNegativeList(output);
}

	private void verifyNegativeList(List<String> output) {
		assertEquals("Zero", output.get(15));
		assertEquals("-1.0", output.get(16));
		assertEquals("Buzz", output.get(17));
		assertEquals("Fizz", output.get(18));
		assertEquals("FizzBuzz", output.get(19));
		assertEquals("FizzBuzz", output.get(20));
		assertEquals("Fizz", output.get(21));
		assertEquals("Buzz", output.get(22));
		assertEquals("-1.0", output.get(23));
		assertEquals("Zero", output.get(24));
		assertEquals("Zero", output.get(25));
		assertEquals("-1.0", output.get(26));
		assertEquals("Buzz", output.get(27));
		assertEquals("Fizz", output.get(28));
		assertEquals("FizzBuzz", output.get(29));
	}

	private void verifyPositiveList(List<String> output) {
		assertEquals("Zero", output.get(0));
		assertEquals("1.0", output.get(1));
		assertEquals("Buzz", output.get(2));
		assertEquals("Fizz", output.get(3));
		assertEquals("FizzBuzz", output.get(4));
		assertEquals("FizzBuzz", output.get(5));
		assertEquals("Fizz", output.get(6));
		assertEquals("Buzz", output.get(7));
		assertEquals("1.0", output.get(8));
		assertEquals("Zero", output.get(9));
		assertEquals("Zero", output.get(10));
		assertEquals("1.0", output.get(11));
		assertEquals("Buzz", output.get(12));
		assertEquals("Fizz", output.get(13));
		assertEquals("FizzBuzz", output.get(14));
	}
}
