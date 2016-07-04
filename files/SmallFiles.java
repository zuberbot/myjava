/**
 * SmallFiles
 */
package com.planet.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author chuck
 *
 */
public class SmallFiles {

	/**
	 * @param args
	 */
	public static void main(String... args) {
		
		String root = File.listRoots()[0].getAbsolutePath();
		String path = root + File.separator + "temp" + File.separator;
		String path1 = path + "smallfileR.txt";
		String path2 = path + "smallfileW.txt";
		
		try {
			// Read from file
			Path file1 = Paths.get(path1);
			byte[] fileArray = Files.readAllBytes(file1);
			String content = new String(fileArray, "UTF-8");
			System.out.println(content);

			// Write to file
			Path file2 = Paths.get(path2);
			String str = "This is my sample content 123.";
			byte[] buf = str.getBytes();
			Files.write(file2, buf);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
