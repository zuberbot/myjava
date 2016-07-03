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
		
		try {
			path += "smallfileR.txt";
			Path file = Paths.get(path);
			byte[] fileArray = Files.readAllBytes(file);
			String content = new String(fileArray, "UTF-8");
			System.out.println(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			path += "smallfileW.txt";
			Path file = Paths.get(path);
			String str = "This is my sample content 123.";
			byte[] buf = str.getBytes();
			Files.write(file, buf);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
