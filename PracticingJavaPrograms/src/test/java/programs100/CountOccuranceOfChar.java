package programs100;

public class CountOccuranceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java";
		
		int total_count = s.length();
		int count_after_removal = s.replace("a", "").length();
		int diffrence = total_count - count_after_removal ;
		
		System.out.println("Number of count of A character is : " +diffrence);

	}

}
