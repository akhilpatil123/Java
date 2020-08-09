
public class ReverseNumber
{
	public static void main(String[] args)
	{
		int number = Integer.parseInt(args[0]);
		int reverseNumber=0, digit=0;
		
		while(number>0)
		{
			digit=number%10;
			reverseNumber=reverseNumber*10 + digit;
			number/=10;
		}
		System.out.println(reverseNumber);
	}
}
