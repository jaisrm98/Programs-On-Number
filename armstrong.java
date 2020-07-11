
package sorting;
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,k,r,rev=0,sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
k=n;
while(k!=0) {
	r=k%10;
	sum=sum+(r*r*r);
	k=k/10;
}
if(sum==n) {
System.out.println("armstrong");
	}
else
{
	System.out.println(" not a armstrong");	

}



}
}	