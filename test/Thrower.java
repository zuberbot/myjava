/**
 * Thrower
 */
package com.planet.test;

/**
 * @author chuck
 *
 */
public class Thrower {

	/**
	 * @param args
	 */
	public static void main(String... args) {
		
		try {
			throw new Exception("This is my customized error :)");
		}
		catch (Throwable t) {
			System.out.println(t.getMessage());
		}
	}
}
