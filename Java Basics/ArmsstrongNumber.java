public class ArmsstrongNumber
{
	public static void main(String[] args)
	{
		int digitCount = Integer.parseInt(args[0]);
		int number = Integer.parseInt(args[1]);
		int result=0, digit =0, originalNumber=number;
		while(number>0)
		{
			digit = number%10;
			result+=Math.pow(digit, digitCount);
			number/=10;
		}
		if(result==originalNumber)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}
}