package sorting;
import java.util.*;
public class kaprekar_no {

	public static void main(String[] args) {
		 int n,N,k,c=0,z,y;
		   Scanner sc=new Scanner(System.in);
		   n=sc.nextInt();
		  N=n*n;
		  k=n;;
		  while(n!=0)
		  {
		    n=n/10;
		    c++;
		  }
		  int a1=(int) Math.pow(10,c);
		  
		  z=(N/a1);
		  y=(N%a1);
		
		  if((z+y)==k)
			  System.out.println("kaprekar no");
			  else
				  System.out.println(" Not a kaprekar no");	  
		  

	}

}
