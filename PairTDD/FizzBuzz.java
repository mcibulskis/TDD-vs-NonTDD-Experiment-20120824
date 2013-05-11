package fizzbuzz.pairtdd;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";
	private static final String ZERO = "Zero";

	public static List<Double> generateNumberList() {
		List<Double> list = new ArrayList<Double>();
		
		for(int i = 0; i <= 100; i++) {
			list.add(Double.valueOf(i));
		}
		
		return list;
	}

	public static List<String> generateReplacedList(List<Double> inputList) {
		return generateReplacedList(inputList, "");
	}

	private static boolean isMultipleOf(Double element, int target) {
		return element % target == 0;
	}

	public static List<String> generateForwardBackwardForwardList(List<String> inputList) {
		List<String> finalList = new ArrayList<String>();
		finalList.addAll(inputList);
		finalList.addAll(reverseList(inputList));
		finalList.addAll(inputList);
		
		return finalList;
	}
	
	private static List<String> reverseList(List<String> inputList) {
		List<String> reversedList = new ArrayList<String>();
		for( int i = inputList.size() - 1; i >= 0; i-- ) {
			reversedList.add(inputList.get(i));
		}
		return reversedList;
	}

	public static List<String> generateReplacedList(List<Double> inputList, String prefix) {
		List<String> list = new ArrayList<String>();
		for( Double element : inputList ) {
			if( element == 0 ) {
				list.add(ZERO);
			} else if( isMultipleOf(element, 3) && isMultipleOf(element, 5) ) {
				list.add(FIZZ + BUZZ);
			} else if( isMultipleOf(element, 3) ) {
				list.add(FIZZ);
			} else if (isMultipleOf(element, 5)) {
				list.add(BUZZ);			
			} else if(element.toString().contains("3")) {
				list.add(FIZZ);
			} else if(element.toString().contains("5")) {
				list.add(BUZZ);
			} else {
				list.add(prefix + element);
			}
		}
		return list;
	}

	public static List<String> generateFinalList(List<Double> numbers) {
		List<String> resultsPositive = generateIntermediateList(numbers, "");
		List<String> resultsNegative = generateIntermediateList(numbers, "-");
		
		List<String> finalList = new ArrayList<String>();
		finalList.addAll(resultsPositive);
		finalList.addAll(resultsNegative);
		
		return finalList;
		
	}

	private static List<String> generateIntermediateList(List<Double> numbers, String prefix) {
		List<String> intermediatePositive = FizzBuzz.generateReplacedList(numbers, prefix);
		List<String> resultsPositive = FizzBuzz.generateForwardBackwardForwardList(intermediatePositive);
		return resultsPositive;
	}

}
