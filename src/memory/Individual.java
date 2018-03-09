package memory;

import java.util.HashSet;
import java.util.Set;

public class Individual {
	
	//The person's identifier
	private String name = "";
	
	/*
	 * TODO: not yet in use
	 */
	//The individuals this person knows
	private Set<Individual> friends = new HashSet<Individual>();
	
	
	/*
	 * Return the name of this individual.
	 */
	public String name() {
		return this.name;
	}

}
