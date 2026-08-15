package javaPracticeQuestions;

public class First_Letter_Small_Last_Letter_Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hello my Java claSS";
		
		if(s==null)
		{
			throw new IllegalArgumentException();
		}
		if(s.trim().isEmpty())
		{
			throw new IllegalArgumentException();
		}
		
		String arrs[]=s.split("\\s+");
		
		StringBuilder sb=new StringBuilder();
		
		for(String word : arrs)
		{
			sb.append(Character.toUpperCase(word.charAt(0)));
			
			if(word.length()>1)
			{
				sb.append(word.substring(1).toLowerCase());
			}
			
			sb.append(" ");
		}
		
		System.out.println(sb.toString().trim());

	}

}
