package week05Project;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		System.out.println("***" + str + "***");
	
	}

	@Override
	public void error(String str) {
		// TODO Auto-generated method stub
		String stars = "*************";
		String star = "*";
		for (int i = 0; i < str.length(); i++) {
			stars = stars + star; 
		}
		System.out.println(stars + "\n***ERORR: " + str + "***" + "\n" + stars);
	}

}
