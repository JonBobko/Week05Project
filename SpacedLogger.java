package week05Project;

public class SpacedLogger implements Logger {

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		System.out.println(str.replace("", " ").trim());
		
		}
	

	@Override
	public void error(String str) {
		// TODO Auto-generated method stub
		System.out.println("ERORR: " + str.replace("", " ").trim());

	}

}
