//WAP to check an Armstrong number
public class Armstrong{
	public static void main(String[] args)
	{
		int number=371,orginalNumber,remainder,result=0;
		orginalNumber=number;
		while(orginalNumber!=0)//using while loop
		{
			remainder = orginalNumber%10;//371%10=remainder=1
			result += Math.pow(remainder,3);//result =resultmath.poe(remainder,3)
			orginalNumber /=10;//originalNumber/10
		}
	if(result==number)//to check result equal to number or not
		System.out.println(number +" is an Armstrong number");
	else
		System.out.println(number +" is not an Armstrong number");
	}
}