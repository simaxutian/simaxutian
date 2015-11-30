package lesson1;

import java.util.*;

public class Homework4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter your first name:");
		String firstname = a.next();
		String Firstname = firstname.substring(0,1);
	
		Scanner b = new Scanner(System.in);
		System.out.println("enter your last name:");
		String lastname = b.next(); 
		String Lastname = lastname.substring(0,5);
		Random t = new Random();
		 int random1 =t.nextInt(999);
		 if(random1<100&&random1>10)
		 {
			 System.out.println(Firstname+Lastname+"0"+random1);
		 }
		 if(random1<10)
		 {
			 System.out.println(Firstname+Lastname+"00"+random1);
		 }
		 else
		 {
			 System.out.println(Firstname+Lastname+random1);
		 }
		
	}
}
