package javaPracticeQuestions;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reverse_String RS=new Reverse_String();
		
		String s1="Shubhankar";
		System.out.println("Original String =" + s1);
		
		System.out.println("Updated String = " + RS.StringReverse1(s1));
		System.out.println("Updated String = " + RS.StringReverse2(s1));
		System.out.println("Updated String = " + RS.StringReverse3(s1));
		System.out.println("Updated String = " + RS.StringReverse4(s1));
		
		System.out.println("ALIVE");
		

	}
	/**
	 * using charAt
	 * @param s
	 * @return
	 */
	public String StringReverse1(String s)
	{
	
		if(s==null)
		{
			throw new RuntimeException("VALUE CAN NOT BE NULL");
		}
		else if(s.trim().isEmpty())
		{
			return null;
		}
		else
		{
		int size=s.length();
			if(size==1)
			{
			return s;
			}
		String RS="";
		for(int i=size-1;i>=0;i--)
		{
			RS=RS+s.charAt(i);
		}
		
		return RS;
		}
	}

	/**
	 * Using String Builder
	 * @param s
	 * @return
	 */
	public String StringReverse2(String s)
	{
	
		if(s==null)
		{
			throw new RuntimeException("VALUE CAN NOT BE NULL");
		}
		if(s.trim().isEmpty())
		{
			return null;
		}
		StringBuilder sb=new StringBuilder(s);
		return sb.reverse().toString();
		
	}
	
	/**
	 * Using character array
	 * @param s
	 * @return
	 */
	public String StringReverse3(String s)
	{
	
		if(s==null)
		{
			throw new RuntimeException("VALUE CAN NOT BE NULL");
		}
		if(s.trim().isEmpty())
		{
			return null;
		}
		
		String rs="";
		char ch[]=s.toCharArray();
		for(int i=(ch.length)-1;i>=0;i--)
		{
			rs=rs+ch[i];
		}
		return rs;
		
	}
	
	/**
	 * Instead of creating a new string, you swap characters.
	 * @param s
	 * @return
	 */
	public String StringReverse4(String s)
	{
	
		if(s==null)
		{
			throw new RuntimeException("VALUE CAN NOT BE NULL");
		}
		if(s.trim().isEmpty())
		{
			return null;
		}
		
		String rs="";
		char c;
		char ch[]=s.toCharArray();
		int left=0;
		int right=(s.length())-1;
		while(left<right)
		{
			c=ch[left];
			ch[left]=ch[right];
			ch[right]=c;
			left++;
			right--;
		}
		
		return new String(ch);
			
	}
	
	public void charSWAP(char c1, char c2)
	{
		char c3;
		c3=c1;
		c1=c2;
		c2=c3;
	}
}
