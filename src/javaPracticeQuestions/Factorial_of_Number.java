package javaPracticeQuestions;

public class Factorial_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		System.out.println("Factorial of "+count+"="+Factorial(count));

		
	}
	public static int Factorial(int count)
	{
		int output=1;
		if(count==0)
		{
			return 1;
		}
		else if(count<0)
		{
			System.out.println("Factorial is not defined for -ve number. Please enter +ve number");
			return -1;
		}
		else
		{
			for(int i=1;i<=count;i++)
			{
				output=output*i;
			}
			return output;
		
		}
}}
