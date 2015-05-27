/**
 * TestInner
 */
package com.java.inner;

/**
 * @author Chuck
 *
 */
public class TestInner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OuterClass st = new OuterClass();
		OuterClass.InnerClass fl = st.new InnerClass();
        fl.methodInFirstLevel(23);
	}

}
