package javaPracticeQuestions;

public class Sum_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-123;
		int sum=0;
		while(num%10!=0)
		{
			sum=sum+(num%10);
			num=num/10;
		}
		System.out.println("Sum of all the digits of the number is = "+Math.abs(sum));
	}

}
