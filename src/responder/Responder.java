package responder;

import parser.Query;

public class Responder {
	
	private static String idk = "I'm sorry. I don't seem to understand.";
	
	public static String respond(Query q) {
		if (q.queryType.equals("greeting")) {
			return "Hello!";
		} else {
			return idk;
		}
	}

}
