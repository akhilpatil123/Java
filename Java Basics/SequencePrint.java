public class SequencePrint
{
	public static void main(String[] args)
	{
		int prev=Integer.parseInt(args[0]);
		int curr=Integer.parseInt(args[1]);
		int next=0;
		System.out.print("Sequence :: "+prev+" "+curr);
		
		for(int i=0;i<13;i++)
		{
			next=curr+prev;
			prev=curr;
			curr=next;
			System.out.print(" "+next);
		}
	}
			
}