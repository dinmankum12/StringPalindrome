package session7;

import java.util.Scanner;

public class PalindromString {
	public static void main(String[] args) {
		String org,rev="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		org = scan.nextLine();
		int length = org.length();
		for(int i= length - 1; i>=0; i--) {
			rev = rev + org.charAt(i);
		}
		if(org.equals(rev)) {
			System.out.println("String is Palindrom :"+rev);
		}
		else {
			System.out.println("String is not Palindrom :"+rev);

		}
	}

}
