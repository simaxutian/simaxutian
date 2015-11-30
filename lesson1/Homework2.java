package lesson1;

import java.util.*;

public class Homework2 {

	public static void main(String[] args) {
		System.out.println("enter a year:");
		Scanner a = new Scanner(System.in);
		float year = a.nextFloat();
		if(year%4==0&&year%100!=0||year%400==0)
		{
			System.out.println("it is leap year");
		}else System.out.println("it is not leap year");
	
	}

}
