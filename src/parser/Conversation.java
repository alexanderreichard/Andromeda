package parser;

import memory.Individual;

public class Conversation {
	
	public Individual collocutor;
	
	/*
	 * Zero argument constructor.
	 */
	public Conversation() {
		
	}

	
	/*
	 * Set the collocutor of this conversation.
	 */
	public void setCollocutor(Individual i) {
		this.collocutor = i;
	}
	
	/*
	 * Returns whether the collocutor of this conversation has been set. 
	 */
	public boolean hasCollocutor() {
		return this.collocutor != null;
	}
}
