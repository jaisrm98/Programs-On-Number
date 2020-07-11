package sorting;
import java.util.Scanner;
public class prime_number_within_range {

	public static void main(String[] args) {
		

		int i,n,k;
		String prime="";
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{ 
			int c=0;
			for(k=1;k<=i;k++)
			{
				if(i%k==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				prime=prime+i+" ";
			}
		}
		
		System.out.print(prime);
		
		
		
		
		
		
	}
	

}
