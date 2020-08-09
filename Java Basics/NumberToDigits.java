public class NumberToDigits
{
	public static void digits(int number)
	{
		if(number>0)
		{
			int digit=number%10;
			number/=10;
			digits(number);
			System.out.print(" "+digit);
		}
	
	}
	public static void main(String[] args)
	{
		int number = Integer.parseInt(args[0]);
		digits(number);
	}
		
}