/**
 * LambdaExpressions
 */
package lambda;

import static java.lang.System.out;

/**
 * @author Chuck
 *
 */
public class LambdaExpressions {

	/**
	 * @param args
	 */
	public static void main(String... args) {

		// ----------------------------------------
		// Factorial
		// ----------------------------------------
		
		IFunctionalInterface iCompute = (value) -> {
			int factorial = 1;
			for (int idx = 1; idx <= value; idx++) {
				factorial = idx * factorial;
			}
			return factorial;
		};
		
		handleCompute(iCompute, 7);

		// ----------------------------------------
		// Natural log
		// ----------------------------------------
		
		iCompute = (value) -> {
			double log = Math.log(value);
			return log;
		};

		handleCompute(iCompute, 9.446);
		
		// ----------------------------------------
		// Square
		// ----------------------------------------
		
		iCompute = (value) -> {
			double square = Math.pow(value, 2);
			return square;
		};

		handleCompute(iCompute, 3.712);

		// ----------------------------------------
		// Tangent
		// ----------------------------------------
		
		iCompute = (value) -> {
			double tangent = Math.tan(value);
			return tangent;
		};

		handleCompute(iCompute, 3.903);
	}

	/**
	 * 
	 * @param c
	 * @param v
	 */
	public static void handleCompute(IFunctionalInterface iC, double v) {
		// Invoke the functional interface's method
		double result = iC.computeValue(v);
		out.println(result);
	}
	
}
