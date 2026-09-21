package programs100;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "#!@$% hi world  0.2";
		s = s.replaceAll("[^ A-Za-z0-9.]", "") ;
		
		System.out.println("Before removing white space and after removing special character = " +s);
		s= s.replaceAll("//s", "");
		System.out.println("After removing white space = " +s);
	}

}
