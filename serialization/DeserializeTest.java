/**
 * DeserializeTest
 */
package com.planet.serialize;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author chuck
 * 
 */
public class DeserializeTest {

	/**
	 * 
	 * @param args
	 */
	public static void main(String... args) {
		// Select object location
		String root = File.listRoots()[0].getAbsolutePath();
		String fileName = root + File.separator + "temp" + File.separator;
		fileName += "employee.ser";

		try {
			// Read object state back in
			Employee empNew = (Employee) SerializationUtility.deserialize(fileName);
			System.out.println("emp New Obj->" + empNew);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
