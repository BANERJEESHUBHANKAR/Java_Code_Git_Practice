package javaPracticeQuestions;

public class Reverse_Words_in_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Proudly Listen in the Crowd";
		String s2=null;
		String s3="       ";
		
		
		
		Reverse_Words_in_Sentence RWS= new Reverse_Words_in_Sentence();
		RWS.Reverse_Words_in_SentenceM(s1);
		
		

	}
	
	/*
1. Take the sentence

↓

2. Convert it into an array of words

↓

3. Traverse the array from the last index to the first

↓

4. Build the output sentence
	 */
	
	public String Reverse_Words_in_SentenceM(String s1)
	{
		StringBuilder sb= new StringBuilder();
		
		if(s1==null || s1.trim().isEmpty())
		{
			System.out.println("The String is Empty or Null");
			return null;
		}
		else
		{
		String sarray[]=s1.split(" ");
		int size=sarray.length;
		
		for(int i =size-1;i>=0;i--)
			{
				sb.append(sarray[i]);
				if(i>0)
				{
					sb.append(" ");
				}
			}
			System.out.println("The updated string is :- "+ sb.toString());
		}
		return sb.toString();
	}

}


