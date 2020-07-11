import java.util.Scanner;
public class power {

	public static void main(String[] args) {
		
int n,p;
int k=1;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
p=sc.nextInt();
for(int i=1;i<=p;i++)
{
	 k=k*n;
	
}
System.out.println(k);
	}

}
