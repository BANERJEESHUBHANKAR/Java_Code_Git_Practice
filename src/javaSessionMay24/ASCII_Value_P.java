package javaSessionMay24;

public class ASCII_Value_P {
	
	public static void main(String[] args)
	{
		char ch='a';
		System.out.println("ASCII value character "+ch+"="+((int)ch));
		System.out.println(ch+0);
		System.out.println(0/0.0);
		System.out.println(0.1+0.2);
		
		//byte short char int long float double
		float p=100.01f;
		int n1=(int)p;
		System.out.println(n1);
		int a=1;
		int b= a++ + ++a * --a - a--;
		System.out.println(b);
		System.out.println(a);
	}

}
