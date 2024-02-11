package week05Project;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = new AsteriskLogger();
		logger.log("Hello");
		logger.log("Art");
		logger.error("What up bro");
		logger.error("Spirit");
		
		Logger logger1 = new SpacedLogger();
		logger1.log("BobsBurgers");
		logger1.log("Safe");
		logger1.error("NewString");
	}

}
