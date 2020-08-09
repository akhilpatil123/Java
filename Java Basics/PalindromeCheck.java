
public class PalindromeCheck
{
	public static void main(String[] args)
	{
		int number = Integer.parseInt(args[0]);
		int originalNumber=number;
		int reverseNumber=0, digit=0;
		
		while(number>0)
		{
			digit=number%10;
			reverseNumber=reverseNumber*10 + digit;
			number/=10;
		}
		if(originalNumber==reverseNumber)
			System.out.println("Palindrome" );
		else
			System.out.println("Not Palindrome");
	}
}