package testPackage;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Selenium Java";
		String t= "";
		
		
		for (int i = s.length()-1; i>=0; i--) {
			
			//s.charAt(8);
			
			t= t+s.charAt(8);
			
		}
		
		
		System.out.println(t);
		

	}

}
