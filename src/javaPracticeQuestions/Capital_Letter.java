package javaPracticeQuestions;

public class Capital_Letter {
	
	public static void main(String args[])
	{
		String s="AbcD@@@    R";
		
		letterCount(s);
	}
	
	public static void letterCount(String s)
	{
		if(s==null)
		{
			throw new IllegalArgumentException("NULL String Passed");
		}
		if(s.trim().isEmpty())
		{
			throw new IllegalArgumentException("NULL String Passed");
		}
		
		int small=0;
		int cap=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isLetter(ch))
			{
				if(ch>='a' && ch<='z')
				{
					small++;
				}
				else
				{
					cap++;
				}
			}
		}
		
		System.out.println("Capital= "+ cap);
		System.out.println("Small= "+ small);
		
	}

}
