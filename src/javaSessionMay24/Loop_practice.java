package javaSessionMay24;

import java.util.Arrays;

public class Loop_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i[]=new int[4];
		i[0]=1;
		i[1]=2;
		i[2]=3;
		i[3]=40;
		int k=i.length-1;
		for(int e : i)
		{
			System.out.println(i[k]);
			k--;
			
		}
		System.out.println("--------------");
		System.out.println(Arrays.toString(i));
		System.out.println("--------------");
		for(int f : i)
		{
			System.out.println(f);
		}
	}

}
