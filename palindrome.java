

package sorting;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		
int n,k,r,rev=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
k=n;
while(k!=0) {
	r=k%10;
	rev=rev*10+r;
	k=k/10;
}
if(rev==n) {
System.out.println("palindrome");
	}
else
{
	System.out.println(" not a palindrome");	

}
}}