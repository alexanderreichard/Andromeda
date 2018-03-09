import java.util.Scanner;

import language_processing.CommandStream;
import language_processing.Retokenizer;
import language_processing.Tokenizer;
import memory.VocabularyDatabase;
import parser.Conversation;
import parser.Parser1;
import parser.Query;
import responder.Responder;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		VocabularyDatabase vocab = new VocabularyDatabase();
		vocab.load();
		
		Conversation c = new Conversation();
		
		String userInput = in.nextLine();
		
		while (!userInput.equalsIgnoreCase("goodbye")) {
			
			CommandStream englishCommands = Tokenizer.tokenize(userInput);
			System.out.println("\nANALYSIS:");
			System.out.println("English: " + englishCommands.toString());
			
			CommandStream andromedan = Retokenizer.retokenize(englishCommands, c, vocab);
			
			//analysis view
			
			System.out.println("Andromedan: " + andromedan.toString() + "\n");
			
			//Query q = Parser1.parseQuery(andromedan);
			//System.out.println(Responder.respond(q));
			userInput = in.nextLine();
		}
		
		vocab.save();
	}
}
