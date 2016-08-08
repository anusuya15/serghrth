import java.util.Scanner;


public class Test2 {

	public static void main(String[] args) {
	String revorder="";
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	   String arr[]=s1.split(" ");
	   for(int l=arr.length-1;l>=0;l--)
	     {
	       revorder=revorder+" "+arr[l];
	     }
	     System.out.println("REVERSE ORDER  OF THE GIVEN STRING IS : " " +revorder);
             
	     
}
}