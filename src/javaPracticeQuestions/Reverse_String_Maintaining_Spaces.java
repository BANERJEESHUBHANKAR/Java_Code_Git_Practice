package javaPracticeQuestions;

public class Reverse_String_Maintaining_Spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ab cdrf ef";
		System.out.println("The Original String is := " + s);
		Reverse_String_Maintaining_Spaces sms=new Reverse_String_Maintaining_Spaces();
		System.out.println("The updated String is := " + sms.Reverse_String_Maintaining_SpacesM(s));
		System.out.println("The updated String is := " + sms.ReverseStringMaintainingSpacesM(s));
	
	}
	
	// Two Pointer Approach
	// 1. Convert String to char array
	// 2. Use left and right pointers
	// 3. Skip spaces
	// 4. Swap non-space characters
	// 5. Return new String from modified array
	
	public String Reverse_String_Maintaining_SpacesM(String s)
	{
		
		if(s==null)
		{
			throw new IllegalArgumentException("The String provided is NULL please pass valid string");
		}
		char arr[]=s.toCharArray();
		int l=0;
		int r=s.length()-1;
		char temp;
		if(s.isEmpty())
		{
			System.out.println("The Sring mentioned is empty, please enter a valid String");
			return s;
		}
		while(l<r)
			{
				if(arr[l]==' ')
				{
					l++;
				}
				else if(arr[r]==' ')
				{
					r--;
				}
				else
				{
					temp=arr[l];
					arr[l]=arr[r];
					arr[r]=temp;
					l++;
					r--;
				}
			}
		return new String (arr);
	}
	
	//Uing String Builder
	
	public String ReverseStringMaintainingSpacesM(String s)
	{
		
		if(s==null)
		{
			throw new IllegalArgumentException("The String provided is NULL please pass valid string");
		}
		if(s.isEmpty())
		{
			System.out.println("The Sring mentioned is empty, please enter a valid String");
			return s;
		}
		
		//loading the string into StringBuilder
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)!=' ')
			{
				sb.append(s.charAt(i));
			}
		}
		
		//reverse sb
		sb.reverse();
		int index=0;
		
		//appending the spaces in string builder in new Sb
		
		StringBuilder result=new StringBuilder();
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==' ')
			{
				result.append(s.charAt(i));
			}
			else
			{
				result.append(sb.charAt(index));
				index++;
			}
		}
		return new String (result.toString());
	}
	

}
