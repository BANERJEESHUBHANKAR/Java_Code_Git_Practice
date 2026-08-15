package javaPracticeQuestions;

public class RegExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello@#$%(MY)$Name@@";
		
		if(s==null)
		{
			throw new IllegalArgumentException("String cannot be null");
		}
		if(s.trim().isEmpty())
		{
			throw new IllegalArgumentException();
		}
		
		String as[]=s.split("[^A-Za-z]+");
		
		for(String word : as)
		{
			if(!(word.isEmpty()))
			{
				System.out.println(word);
			}
		}

	}

}
