package programs100;

public class MinMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4} ;
		int min = a[0] ;
		int max = a[0] ;
		
		for(int i=0; i< a.length ; i++)
		{
			if(min>a[i])
			{min = a[i] ; }
		}
		System.out.println("minimun "+min);
		
		for(int i=0; i< a.length ; i++)
		{
			if(max<a[i])
			{max = a[i];}
		}
		System.out.println("maximum "+max);
	}

}
