public class StringManipulation
{
	public static void main(String[] args)
	{
		String str= args[0];
		
		System.out.println("Length :: "+str.length());
		System.out.println("UpperCase :: "+str.toUpperCase());
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("Palindrome :: "+str.equals(sb.toString()));
	}
}