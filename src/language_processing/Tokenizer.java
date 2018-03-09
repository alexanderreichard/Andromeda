package language_processing;
import java.util.HashSet;
import java.util.Set;

public class Tokenizer {
	
	/*
	 * The tokenizer class tokenizes an English sentence into a CommandStream.
	 */
	
	/**
	 * Tokenizes {@code String} s based upon Andromeda conventions. 
	 * 
	 * @param s
	 * 		the string to tokenize
	 * @return
	 * 		a {@code CommandStream} of the tokens in s
	 * @clears
	 * 		s
	 */
	public static CommandStream tokenize(String s) {
		assert s != null : "Violation of: text is not null";

        //create set of punctuation characters
        Set<Character> punctuationTokens = new HashSet<Character>();
        punctuationTokens.add('.');
        punctuationTokens.add(',');
        punctuationTokens.add('!');
        punctuationTokens.add('=');
        
        //define variables
        CommandStream stream = new CommandStream();
        String text = s;
        String token = "";
        
        while (text.length() > 0) {
        		
        		//clear out whitespace
        		while (text.length() > 0 && text.charAt(0) == ' ') {
        				text = text.substring(1);
        		}
        		
        		
        		//if the next token is punctuation 
        		if (text.length() > 0 && punctuationTokens.contains(text.charAt(0))) {
        			while (text.length() > 0 && punctuationTokens.contains(text.charAt(0))) {
        				token += text.charAt(0);
        				text = text.substring(1);
        			}
        		}
        		
        		//else  
        		else {
        			while (text.length() > 0 && text.charAt(0) != ' ' && 
        					!punctuationTokens.contains(text.charAt(0))) {
        				token += text.charAt(0);
        				text = text.substring(1);
        			}
        		}
        		
        		//add to CommandStream and clear token variable
        		stream.add(token);
        		token = "";	
        }
        
        return stream;
        
	}

}
