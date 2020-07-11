package sorting;
import java.util.Scanner;
import java.util.Arrays; 
public class smaller_number {

	public static void main(String[] args) {
		
	int n,k;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	n=sc.nextInt();
	k=sc.nextInt();
	int temp;
	System.out.println("enter values of array");
	int arr[]=new int [n];
	
	 
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	int pLen=0;int nLen=0;
	for(int i=0;i<n;i++) {
		 temp=k-arr[i];
		 if(temp>=0)
			 pLen++;
		 else
			 nLen++;
	}
	
	int parr[]=new int [pLen];
	int narr[]=new int [nLen];
	int parrindex=0;
	int narrindex=0;
	for(int i=0;i<n;i++) {
		 temp=k-arr[i];
		 if(temp>=0) {
			 parr[parrindex]=temp;
			 parrindex++;
		 }
		 else {
		     narr[narrindex]=0-temp;
		     narrindex++;
		 }
	}
	Arrays.sort(parr);
	Arrays.sort(narr);
	System.out.println(Arrays.toString(parr));
	System.out.println(Arrays.toString(narr));
	
	if(narr.length!=0)
	{
	if(parr[0]>=narr[0])
		System.out.println(k+narr[0]);
	else 
		System.out.println(k-parr[0]);
	
	}else
		System.out.println(k-parr[0]);
	
	
	
	
	
	
	
}
}