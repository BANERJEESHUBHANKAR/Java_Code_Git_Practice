package javaPracticeQuestions;

import java.util.Arrays;

public class Array_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		a[0]=1;
		a[1]=32;
		a[2]=30;
		a[3]=41;
		a[4]=21;
		for(int i : a)
		{
			System.out.println(i);
		}
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		String s="Hello";
		System.out.println(s.length());
		
		//Primitive Array 
		char ch[]=new char[5];
		
		String st[]={
				"Hello",
				"World",
				"Name"
		};;
		System.out.println(Arrays.toString(st));
		
	}

}
