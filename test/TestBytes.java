/**
 * TestBytes
 */
package com.planet.patterns;

/**
 * @author chuck
 *
 */
public class TestBytes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// byte -128 to 127 inclusive
		int i = -1;
		byte b = (byte) i;
		System.out.println(b); // -1
		i = 200;
		b = (byte) i;
		System.out.println(b); // -56
	}

}
