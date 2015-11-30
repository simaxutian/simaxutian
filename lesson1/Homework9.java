package lesson1;

import java.util.*;

public class Homework9 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("please enter a four-digit integer:");
		int number = a.nextInt();
		int num1 = number/1000;
		int num2 = (number%1000)/100;
		int num3 = (number%100)/10;
	    int num4 = number%10;
	    
	    int  num11 =(num3+7)%10;
	    int  num22 =(num4+7)%10;
	    int  num33=(num1+7)%10;
	    int  num44=(num2+7)%10;
	   
 	    
	    System.out.println("new number is: "+num11+num22+num33+num44);
	}

}
