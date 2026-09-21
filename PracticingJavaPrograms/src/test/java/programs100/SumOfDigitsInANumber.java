package programs100;

public class SumOfDigitsInANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int num = 12345;
        int sum = 0;
        
        while (num>0)
        {int a = num%10;
         sum = sum+a;
         num = num/10;
        }
		
        System.out.println(sum);
	}

}
