/**
 * SerializationUtility
 */
package com.planet.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * @author chuck
 * 
 */
public class SerializationUtility {

	/**
	 * Serialize the given object and save it to file.
	 * 
	 * @param o
	 * @param fileName
	 * @throws IOException
	 */
	public static void serialize(Object o, String fileName) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(o);
		fos.close();
	}

	/**
	 * Deserialize to object from given file.
	 * 
	 * @param fileName
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		ois.close();
		return o;
	}
}
