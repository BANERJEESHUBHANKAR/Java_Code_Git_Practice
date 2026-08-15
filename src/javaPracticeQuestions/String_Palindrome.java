package javaPracticeQuestions;

public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Palindrome sp=new String_Palindrome();
		String s="Madam Madama";
		
		if(sp.rev(s))
		{
			System.out.println("\""+ s +"\"" + " is a Palindrome");
		}
		else
		{
			System.out.println("\""+ s +"\"" + " is not a Palindrome");
		}
		if(sp.revUsingPointer(s))
		{
			System.out.println("\""+ s +"\"" + " is a Palindrome");
		}
		else
		{
			System.out.println("\""+ s +"\"" + " is not a Palindrome");
		}
		

		
	}
	
	public boolean rev(String ms)
	{
		if(ms==null)
		{
			throw new IllegalArgumentException();
		}
		if(ms.trim().isEmpty())
		{
			throw new IllegalArgumentException();
		}
		
		String s=ms.trim().toLowerCase();
		StringBuilder sb=new StringBuilder();
		for(int i=(s.length())-1;i>=0;i--)
		{
			sb=sb.append(s.charAt(i));
		}
		
		return s.equals(sb.toString());
	}
	
	public boolean revUsingPointer(String s)
	{
		if(s==null)
		{
			throw new IllegalArgumentException();
		}
		if(s.trim().isEmpty())
		{
			throw new IllegalArgumentException();
		}
		String ms=s.trim().toLowerCase();
		int l=0;
		int r=ms.length()-1;
		
		while(l<r)
		{
			if(ms.charAt(l)==ms.charAt(r))
			{
				l++;
				r--;
			}
			else
			{
				return false;
			}
		}
				
		return true;
	}


}
