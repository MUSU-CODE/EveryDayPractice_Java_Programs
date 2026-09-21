package programs100;

public class CountNumberOfEvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234;
		int even = 0;
		int odd = 0;
		
		while (num > 0)
		{int a = num %10 ;
		
		 if (a%2 == 0) {even++ ;}
		 else {odd++ ;}
		 
		 num = num/10;
		}
		
		System.out.println("even is "+ even);
		System.out.println("odd is "+ odd);

	}

}
