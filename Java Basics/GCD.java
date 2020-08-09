public class GCD
{
	public static void main(String[] args)
	{
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		int gcd=0;
		for(int i=1; i<=number1 && i<=number2 ; i++)
		{
			if(number1%i==0 && number2%i==0)
				gcd=i;
		}
		System.out.println(gcd);
	}	
}