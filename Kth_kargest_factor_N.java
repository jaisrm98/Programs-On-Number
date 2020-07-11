package sorting;
import java.util.*;
public class Kth_kargest_factor_N {

	public static void main(String[] args) {
		int a,i,k,c=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		k=sc.nextInt();
		for(i=a;i>=1;i--)
		{
			if((a%i)==0)

		 c++;
			if(c==k)
			{
				System.out.println(i);
			
			break;
			}	
		}
	
	if(c!=k)
	{
		System.out.println("1");
	}

}
}