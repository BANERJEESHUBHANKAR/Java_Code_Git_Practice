package javaSessionMay24;

public class NestedLoop {

	public NestedLoop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				for(int k=0;k<=5;k++)
				{
					System.out.print(i +""+ j+""+k+" ");
				}
				System.out.println();
			}
		}

	}

}
