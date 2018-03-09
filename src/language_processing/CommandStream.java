package language_processing;
import java.util.LinkedList;
import java.util.Queue;

public class CommandStream {
	
	/*
	 * The concrete representation.
	 */
	private Queue<String> stream;
	
	
	/*
	 * Zero argument constructor call.
	 */
	public CommandStream() {
		this.createNewRep();
	}
	
	/*
	 * Instantiate a new representation of $this via a 
	 * java.util Queue written on a LinkedList.
	 */
	private void createNewRep() {
		this.stream = new LinkedList<String>();
	}
	
	/**
	 * Returns and removes the next token in the CommandStream.
	 * 
	 * @requires
	 * 		|this| > 0
	 * @return
	 *		the next token in this
	 * @ensures 
	 *		|#this| = |this| - 1 
	 */
	public String next() {
		assert this.stream.size() > 0 : "Violation of: CommandStream is not empty.";
		return this.stream.remove();
	}
	
	/**
	 * Returns but does not remove the next token in the CommandStream.
	 * 
	 * @requires
	 * 		|this| > 0
	 * @return
	 *		the next token in this
	 */
	public String front() {
		assert this.stream.size() > 0 : "Violation of: CommandStream is not empty.";
		return this.stream.peek();
	}
	
	/**
	 * Adds {@code String} s to this.
	 */
	public void add(String s) {
		this.stream.add(s);
	}
	
	/**
	 * Returns true if |this| > 0.
	 */
	public boolean hasNext() {
		return this.stream.size() > 0;
	}
	
	/**
	 * Returns a {@code String} representation of the Command Stream 
	 * 
	 * @return
	 * 		the {@code String} representation of this
	 */
	public String toString() {
		String s = "<";
		for (String element : this.stream) {
			s += element + ", ";
		}
		s += "END";
		return s + ">";
	}
	
	

}
