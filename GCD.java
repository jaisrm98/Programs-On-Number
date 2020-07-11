package sorting;
import java.util.*;
public class GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,k=0;
		n1=sc.nextInt();
		n2=sc.nextInt();
		int temp=0;
		if(n1<n2)
		{ temp=n1;
			n1=n2;
			n2=temp;
		}
		for(int i=1;i<=n1;i++)
		{
			if(n1%i==0 && n2%i==0)
				k=i;
		}
		System.out.println(k);
		
	}

}
