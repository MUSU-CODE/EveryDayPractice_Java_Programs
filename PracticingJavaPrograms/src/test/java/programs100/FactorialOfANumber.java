package programs100;

public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5 ;
		int factorial = 1;
		
		for (int i=num ; i>=1 ; i --)
		{factorial = i * factorial ; }
		
		System.out.println(factorial);
	}

}
