package memory;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemoryReader {
	
	private final String MEM_FILEPATH = "memories/";
	
	/**
	 * The {@code Buffered Reader} representation of this.
	 */
	private BufferedReader fileIn;
	
	
	/*
	 * Instantiate the BufferedReader reading from the desired text file.
	 */
	public MemoryReader(String fileName) {
		
	        try {
	            fileIn = new BufferedReader(new InputStreamReader(new FileInputStream(MEM_FILEPATH + fileName)));
	        } catch (FileNotFoundException e1) {
	            System.err.println("Error opening file.");
	        }
	    
	}
	
	public String next() {
		//read next input line
		
		String line = "";
		//if error
		try {
			line = fileIn.readLine();
		} catch (IOException e) {
			return "ERROR_READING_LINE";
		}
		//if end of file
		if (line == null) {
			return "#END_OF_INPUT#";
		}	
		//else 
		else {
			return line;
		}
	}
	
	public void close()  {
		try {
			this.fileIn.close();
		} catch (IOException e) {
			System.err.println("Error closing memory reader.");
		}
	}

}
