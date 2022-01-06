package session7;
import java.util.Scanner;

public class WithoutSplit1 {
	public static void main(String[] args) {
		System.out.println("Enter a string :");
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();

	    for(int i = 0; i <str.length();i++) {
	        if(str.charAt(i)==' ') { 
	            System.out.println();
	            continue;
	        }
	        System.out.print(str.charAt(i));
	    }
	    //sc.close();
	}
}
