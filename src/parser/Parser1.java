package parser;

import language_processing.CommandStream;
import memory.VocabularyDatabase;
import responder.Inquirer;

public class Parser1 {
	
	public static Query parseQuery(CommandStream in) {
		assert in.hasNext() : "Violation of: CommandStream is empty.";
		
		Query q = new Query();
		
		return q;
		
	}

}
