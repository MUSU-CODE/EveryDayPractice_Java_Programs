package programs100;

public class FindLargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int a = 3 ;
		int b = 2;
		int c = 1;
		
		/* int large1 = a>b?a:b;
		int large2 = c>large1?c:large1;
		
		System.out.println("largest is" + large2); */
		
		//OR
		
		if (a>b && a>c) {System.out.println("largest is " +a);}
		else if (b>a && b>c) {System.out.println("largest is "+ b);}
		else {System.out.println("largest is "+c);}
	}

}
