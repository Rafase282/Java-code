/**
 * 
 */
package com.rafaelrodriguez.nasa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rafase282
 *
 */
public abstract class ReadFile {
	
	protected static List<String> makeInputArray(String filename) {
		
		List<String> commandList = new ArrayList<String>();

		try (BufferedReader lines = new BufferedReader(new FileReader(filename))){
			String currentLine;
			
			while ((currentLine = lines.readLine()) != null) {

				String[] splitedLine = currentLine.split(" ");
				for (String text : splitedLine) {
					commandList.add(text);
				}
			}
			lines.close();
		} 
		catch (IOException e) {
			System.err.println("Error: file not found!");
		}
		return commandList;
	}

}
