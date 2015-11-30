package lesson1;

import java.util.*;

public class Homework1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter your account:");
		float money = a.nextFloat();
		System.out.println("your account consist of:");
		int dollars = (int)money;
		System.out.printf("%d dollars\n",dollars);
		int quaters = (int)((money-(int)money)/0.25);
		System.out.printf("%d quaters\n",quaters);
		int ss=(int)money;
		double sb=money;
		int dimes=(int) ((money-(int)money-0.25*quaters)/0.1);
		System.out.printf("%d dimes\n",(int)(dimes));
		int nickels=(int) ((money-(int)money-0.25*quaters-dimes*0.1)/0.05);
		System.out.printf("%d nickels\n",(int)(nickels));
		int pennies=(int) Math.round( ((money-(int)money-0.25*quaters-dimes*0.1-nickels*0.05)/0.01));
		System.out.printf("%d pennies\n",(pennies));
	}
}
