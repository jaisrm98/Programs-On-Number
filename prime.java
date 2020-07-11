package sorting;


import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
	int a,c=0;
	int k=0;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	for(int i=2;i<a;i++)
	{
		c=a%i;
	
if (c==0)
	k++;}
if(k==0)
{
	System.out.println("prime");
}
	else
	{
		System.out.println(" not prime");
	}
}
}