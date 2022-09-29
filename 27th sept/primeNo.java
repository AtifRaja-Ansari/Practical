importjava.util.Scanner;
public class PrimeNo.
{
public static void main(String [] args)
{
int num, i, count =0;
Scanner sc = new Scanner(System.in);//syntax of a Scanner class
System.out.println("Enter the Number: ")//taking input
num=sc.nextInt();
for(i=2,num>i;i++)
{
if(num%i==0)
{
count++;
break;
}
}
if(count==0)
System.out.pintln("\n It is a prime number. ");
else
System.out.pintln("\n It is not a prime number. ");
}
}