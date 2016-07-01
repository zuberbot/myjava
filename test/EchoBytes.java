/**
 * EchoBytes
 */
package com.planet.stream;

import java.io.InputStream;
import java.io.IOException;

/**
 * @author chuck
 * 
 */
public class EchoBytes {
	/**
	 * 
	 * @param args
	 */
	public static void main(String... args) {
		try {
			byte[] bytes = new byte[10];

			// Read from console input
			InputStream stream = System.in;
			int bytesRead = stream.read(bytes);
			System.out.println(bytesRead);
			
			for (int idx = 0; idx < bytes.length; idx++) {
				char ch = (char) bytes[idx];
				System.out.print(ch);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
