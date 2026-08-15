package javaPracticeQuestions;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 1 2 3 5 8 
		
//		int firstnum=1;//2
//		int secnum=1;//2
//		int series=6;
//		int s;
//		System.out.println("Fabonacci Series:- ");
//		System.out.println(firstnum);
//		System.out.println(secnum);		
//		for(int i=1; i<=series-2;i++)
//		{
//			System.out.println(firstnum+secnum);
//			s=firstnum;
//			firstnum=secnum;
//			secnum=s+secnum;
//		}
		int c=4;
		Fabonacci(c);

	}
	
	public static void Fabonacci(int c)
	{
		int first=0;
		int second=1;
		int next;
		System.out.println("Fabonacci Series: ");
		for(int i=0;i<=c;i++)
		{
			System.out.print(first+" ");
			next=first+second;
			first=second;
			second=next;
		}
	}

}
