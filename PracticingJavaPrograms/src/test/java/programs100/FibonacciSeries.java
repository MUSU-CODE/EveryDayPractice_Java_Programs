package programs100;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int num1 = 0 , num2 = 1 , sum =0 ;
		
		//System.out.println(num1+" " + num2);
		
		for (int i=1 ; i<=10; i++)
		{sum = num1+num2;
		  System.out.println(sum);
		 num1 = num2 ;
		 num2 = sum ;
		}
		
		
	}

}
