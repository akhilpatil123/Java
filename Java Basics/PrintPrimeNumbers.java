public class PrintPrimeNumbers
{
	public static void main(String[] args)
	{
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		int flag=0;
		System.out.print("Prime Number: ");
		for(int i=start; i<=end ; i++)
		{
			flag=0;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
					flag=1;
			}
			if(flag==0)
				System.out.print(i+" ");
		}
	}
}				