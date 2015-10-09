/**
 * StreamLambdaExpressions
 */
package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.lang.System.out;

/**
 * @author Chuck
 *
 */
public class StreamLambdaExpressions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(88);
		list.add(41);
		list.add(30);
		list.add(67);
		list.add(27);
		list.add(15);
		list.add(99);
		list.add(52);
		
		out.print(list);
		
		// Get the stream to the List
		Stream<Integer> stream = list.stream();
		
		// Optional instance can either contain a value of the type or be empty

		// Get the MAX value of the List using Integer's compare method
		Optional<Integer> max = stream.max(Integer::compare);
		minMax(max, "\nMax ");
		
		// Get the stream to the List again
		stream = list.stream();
		
		// Get the MIN value of the List using Integer's compare method
		Optional<Integer> min = stream.min(Integer::compare);
		minMax(min, "\nMin ");
		
		// Get a sorted stream to the List
		stream = list.stream().sorted();
		processElements(stream, "\nSorted stream ");
		
		// filter() takes a Predicate, which evaluates to either true or false 
		
		// Get a sorted filtered stream of even values to the List
		stream = list.stream().sorted().filter((elements) -> (elements % 2) == 0);
		processElements(stream, "\nEvens ");
		
		// Pipelined filters of odd values above 20 and less than 60
		stream = list.stream().filter((elements) -> (elements % 2) == 1).filter((elements) -> elements > 20).filter((elements) -> elements < 60);
		processElements(stream, "\nOdds GT twenty & LT sixty ");
	}
	
	/**
	 * 
	 * @param minMax
	 */
	public static void minMax(Optional<Integer> minMax, String label) {
		if (minMax.isPresent()) {
			out.print(label + minMax.get());
		}
	}
	
	/**
	 * 
	 * @param stream
	 * @param label
	 */
	public static void processElements(Stream<Integer> stream, String label) {
		out.print(label);
		stream.forEach((elements) -> out.print(elements + " "));		
	}

}
