/**
 * TraverseFiles
 */
package com.planet.file;

import java.io.File;
import java.util.Date;

/**
 * @author chuck
 *
 */
public class TraverseFiles {

	/**
	 * @param args
	 */
	public static void main(String... args) {
		TraverseFiles tf = new TraverseFiles();
		tf.traverseDirectory("C:\\Temp\\dir\\dir\\dir");
	}

	/**
	 * 
	 * @param dir
	 */
    public void traverseDirectory(String dir) {
    	// Start at a directory
        File folder = new File(dir);
        // List all file/dir entities in that directory
        File[] listOfFiles = folder.listFiles();

        // Loop thru each entity
        for (File file : listOfFiles) {
            if (!file.isDirectory()) {
            	// Print file time stamp
            	long lastChanged = file.lastModified();
            	Date d = new Date(lastChanged);
            	System.out.println(file.getAbsolutePath() + " " + d);
            }
            else {
            	// If it's a directory recursively spin thru its sub-entities
            	TraverseFiles tf = new TraverseFiles();
            	tf.traverseDirectory(file.getAbsolutePath());
            }
        }
    }
}



