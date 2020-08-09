public class PrimeCheck
{
	public static void main(String[] args)
	{
		int number = Integer.parseInt(args[0]);
		int flag=1;
		for(int i=2; i<number; i++)
		{
			if(number%i ==0)
			{
				flag=0;
			}
		}
		if(flag==0)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
	}			
}
