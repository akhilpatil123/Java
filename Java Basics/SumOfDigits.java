
public class SumOfDigits
{
	public static void main(String[] args)
	{
		int number = Integer.parseInt(args[0]);
		int sum=0, digit=0;
		while(number>0)
		{
			digit=number%10;
			sum+=digit;
			number/=10;
		}
		System.out.println(sum);
	}
}