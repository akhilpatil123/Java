public class Factorial
{
	public static void main(String[] args)
	{
		int number = Integer.parseInt(args[0]);
		int result =1;
		
		for(int i=number; i>1; i--)
		{
			result*=i;
		}
		System.out.println("Result:: "+result);
	}
}