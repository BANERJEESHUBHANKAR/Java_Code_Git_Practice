package javaPracticeQuestions;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-100000012;
		revurseNumber(num);
		System.out.println("Revurse number = "+revurseNumberUpdated(num));
		

	}
	
	public static void revurseNumber(int num)
	{
		int revursenum=0,lastdigit=0;
		if(num<0)
		{
		num=Math.abs(num);
		while(num!=0)
		{
			lastdigit=num%10;
			revursenum=revursenum*10+lastdigit;
			num=num/10;
		}
		System.out.println("Revurse number = "+(-revursenum));
		}
		else
		{
			while(num!=0)
			{
				lastdigit=num%10;
				revursenum=revursenum*10+lastdigit;
				num=num/10;
			}
			System.out.println("Revurse number = "+(revursenum));
		}
	}
	
	public static int revurseNumberUpdated(int num)
	{
		boolean status=num<0;
		
		int revursenum=0,lastdigit=0;
		num=Math.abs(num);
		while(num!=0)
		{
			lastdigit=num%10;
			revursenum=revursenum*10+lastdigit;
			num=num/10;
		}
		
		return status? -revursenum : revursenum;
	}

}
