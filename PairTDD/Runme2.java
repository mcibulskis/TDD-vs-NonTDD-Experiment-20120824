package fizzbuzz.pairtdd;

import java.util.ArrayList;
import java.util.List;

public class Runme2 {
	public static final void main(String[] args) {
		List<String> inputList = generateInputList();
		List<List<Double>> undoneList = UndoFizzBuzz.generateUndoneFizzBuzz(inputList);
		for( List<Double> element : undoneList ) {
			System.out.print(makePretty(element) + " ");
		}
		System.out.println();
	}
	
	private static String makePretty(List<Double> list) {
		if( list.size() > 1 ) {
			return list.toString();
		} else {
			return list.get(0).toString();
		}
	}
	
	private static List<String> generateInputList() {
		List<Double> numbers = new ArrayList<Double>();
		for( int i = 4; i <= 63; i++ ) {
			numbers.add(Double.valueOf(i));
		}
		return FizzBuzz.generateReplacedList(numbers);
	}
}
