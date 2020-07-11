package sorting;

public class sum_of_digit_until_single {

	public static void main(String[] args) {
		int a=845;
		int r,sum=0;
		while(a>0 ||sum>9)
		{ if (a == 0) { 
            a = sum; 
            sum = 0; 
        }
			sum=sum+a%10;
			a=a/10;
		}
System.out.println(sum);
	}

}
