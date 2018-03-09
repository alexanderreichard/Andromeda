package memory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VocabularyDatabase {
	
	private final String TRANSMAP_FILEPATH = "translation_map.mem";
	
	/*
	 * Vocabulary sets.
	 */
	//public Set<String> greetings = new HashSet<String>();
	public Map<String, String> translationMap = new HashMap<String,String>();
	
	/*
	 * Constructor
	 */
	public VocabularyDatabase() {
	}
	
	
	/**
	 * Save the current status of the vocabulary database.
	 */
	public void save() {
		//save the vocabulary database to a file
		MemoryWriter mapWriter = new MemoryWriter(TRANSMAP_FILEPATH);
		for (Map.Entry<String,String> pair : this.translationMap.entrySet()) {
			mapWriter.appendLine(pair.getKey() + ", " + pair.getValue());
		}
		mapWriter.close();
	}
	
	public void addWord(String s1, String s2) {
		translationMap.put(s1, s2);
	}
	
	public boolean containsWord(String s) {
		return this.translationMap.containsKey(s);
	}
	
	public String translate(String s) {
		return this.translationMap.get(s);
	}
	
	public void load() {
		//load the vocabulary database from a file
		MemoryReader mapReader = new MemoryReader(TRANSMAP_FILEPATH);
		
		String line = mapReader.next();
		
		while (!line.equals("#END_OF_INPUT#")) {
			//read mappings
			String englishWord = "";
			while (line.charAt(0) != ',') {
				englishWord += line.charAt(0);
				line = line.substring(1);
			}
			line = line.substring(2); //get rid of ', '
			String andromedanWord = line; //rest of line is new assignment
			
			translationMap.put(englishWord, andromedanWord);
			line = mapReader.next();
		}
		
		mapReader.close();
		
	}

}
