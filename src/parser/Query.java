package parser;

public class Query {
	
	/*
	 * Query type must be "statement", "question", or "command".
	 */
	public String queryType;
	
	/*
	 * STATEMENT VARIABLES
	 */
	public String statementSubject;
	public String statementModifier;
	public String statementNoun;
	
	public Query() {
		//create new cleared representation
		this.queryType = "";
		
		this.statementSubject = "";
		this.statementModifier = "";
		this.statementNoun = ""; 
	}
	
	/**
	 * Change the {@code String} type of the query.
	 */
	public void setQueryType(String type) {
		this.queryType = type;
	}
	
	/**
	 * Change the {@code String} type of the query.
	 */
	public void setStatementSubject(String subject) {
		this.statementSubject = subject;
	}
	
	/**
	 * Change the {@code String} type of the query.
	 */
	public void setStatementModfier(String mod) {
		this.statementModifier = mod;
	}
	
	/**
	 * Change the {@code String} type of the query.
	 */
	public void setStatementNoun(String noun) {
		this.statementNoun = noun;
	}
	
	
	
	
}
