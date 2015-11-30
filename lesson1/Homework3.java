package lesson1;

import java.util.*;

public class Homework3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter a 5 digits number:");
		String number = a.next();
		while(number.length()!=5)
		{
			System.out.println("enter a 5 digits number again:\n");
			number = a.next();
		}
		 boolean isparlindrome = new StringBuilder(number).reverse().toString().equals(number);
		 if(isparlindrome)
		 {
			 System.out.println("is parlindrome");
		 }else System.out.println("is not parlindrome");
	}
		
}
