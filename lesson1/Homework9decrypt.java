package lesson1;

import java.util.Scanner;

public class Homework9decrypt {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("please enter a four-digit integer:");
		int number = a.nextInt();
		int num1= number/1000;
		int num2 = (number%1000)/100;
		int num3= (number%100)/10;
	    int num4= number%10;
	    
	    
	    int  num11 =Math.abs((num3-7)%10);
	    int  num22 =Math.abs((num4-7)%10);
	    int  num33=Math.abs((num1-7)%10);
	    int  num44=Math.abs((num2-7)%10);

	    if(num1>=3)
	    {
	    	num11=10-num11;
	    	
	    }
	    if(num2>=3)
	    {
	    	num22=10-num22;
	    	
	    }
	    if(num3>=3)
	    {
	    	num33=10-num33;
	    	
	    }
	    if(num4>=3)
	    {
	    	num44=10-num44;
	    	
	    }
	  
	    System.out.println("orgin number is: "+num11+num22+num33+num44);

	}

}
