/**
 * 
 */
package com.java.generics;

/**
 * @author Chuck
 *
 */
public class TestGen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Gen<Integer> iOb = new Gen<Integer>(30);
		UseGen ug = new UseGen();
		
		ug.usesGen(iOb);
		//ug.usesGenAgain(iOb); illegal
		
	}

}
