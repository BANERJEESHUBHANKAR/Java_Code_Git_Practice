package javaPracticeQuestions;

import java.util.HashMap;

public class Duplicate_Characters_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void mDuplicate(String s)
	{
		if(s==null)
		{
			throw new IllegalArgumentException();
		}
		if(s.trim().isEmpty())
		{
			throw new IllegalArgumentException();
		}
		
		HashMap<Character,Integer> hm=new HashMap<>();
		String st=s.trim().toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char ch=st.charAt(i);
			if(Character.isLetter(ch))
			{
				hm.put(ch,hm.getOrDefault(ch, 0)+1);
			}
			
		}
	}
}
