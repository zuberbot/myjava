/**
 * 
 */
package com.java.generics;

/**
 * @author Chuck
 *
 */
public class UseGen {

	void usesGen(Gen<?> g) {
		g.showType();
	}
	
	void usesGenAgain(Gen<String> g) {
		g.showType();
	}
}
