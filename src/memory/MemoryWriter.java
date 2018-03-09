package memory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MemoryWriter {
	
	private final String MEM_FILEPATH = "memories/";
	
	/**
	 * The {@code Buffered Reader} representation of this.
	 */
	private PrintWriter fileOut;
	
	
	/*
	 * Instantiate the BufferedReader reading from the desired text file.
	 */
	public MemoryWriter(String fileName) {
	        try {
	            this.fileOut = new PrintWriter(new BufferedWriter(new FileWriter(MEM_FILEPATH + fileName)));
	        } catch (IOException e) {
				System.err.println("Error creating MemoryWriter");
			}
	    
	}
	
	public void appendLine(String line) {
		this.fileOut.append(line + "\n");
	}
	
	public void close()  {
		this.fileOut.close();
	}

}
