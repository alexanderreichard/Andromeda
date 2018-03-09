package responder;

import java.util.Scanner;

import parser.Query;

public class Inquirer {
		
	//TODO: Check to see if person exists when establishing a collocutor.
	public static String establishCollocutor() {
		System.out.println("Who am I speaking with?");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		return name;
	}

}
