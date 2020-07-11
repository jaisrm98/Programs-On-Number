public class word
{ 
	public static void main(String args[])
	{ 
		String s = "f h j";
		int count = 0;
		String arr[] =s.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=" ")
				count++;
		}
 
		
		
		
 		System.out.println( count);
	}
}
