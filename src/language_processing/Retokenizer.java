package language_processing;

import language_processing.CommandStream;
import memory.VocabularyDatabase;
import parser.Conversation;
import responder.Inquirer;

public class Retokenizer {
	
	/*
	 * The retokenizer class translates English tokens to Andromedan.
	 */
	
	public static CommandStream retokenize(CommandStream in, Conversation c, VocabularyDatabase vocab) {
		assert in.hasNext() : "Violation of: CommandStream is empty.";
						
		CommandStream andromedan = new CommandStream();
		
		while (in.hasNext()) {
			String token = in.next();
			
			/*
			 * First person check.
			 */
			if (token.equalsIgnoreCase("I")) {
				//if the collocutor has been established
				if (c.hasCollocutor()) {
					andromedan.add(c.collocutor.name().toUpperCase());
				} else {
					//figure out collocutor
					andromedan.add(Inquirer.establishCollocutor().toUpperCase());
				}
				
			} else if (token.equals("learn:")){
				String w1 = in.next();
				//TODO: fix assert failure
				assert (in.next().equalsIgnoreCase("is")) || in.next().equalsIgnoreCase("are") : "Violation of \"learn\" must use \"is\"";
				in.next();
				String w2 = in.next().toUpperCase();
				vocab.addWord(w1, w2);
				
			} else if (token.equalsIgnoreCase("a") || token.equalsIgnoreCase("the")) {
				//article case 
				//do nothing
				
			} else if (token.equalsIgnoreCase(".")) {
				CommandStream temp = new CommandStream();
				temp.add("STATEMENT");
				while (andromedan.hasNext()) {
					temp.add(andromedan.next());
				}
				andromedan = temp;
				
			} else {
				
				/*
				 * Vocabulary map check.
				 */
				token = token.toLowerCase();
				if (vocab.containsWord(token)) {
					andromedan.add(vocab.translate(token));
				} else {
					andromedan.add(token.toUpperCase());
				}
				
			}
			
			
			
		}
		
		return andromedan;
	}

}
