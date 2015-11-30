package lesson1;

import java.util.*;

public class Homework7 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter a choice:");
		int i=a.nextInt();
		
		Scanner b = new Scanner(System.in);
		System.out.println("enter your weight:");
		int weight1=b.nextInt();
		
		double weight=0;
		switch(i)
		{
		case 1:
			weight=0.78*weight1;
			System.out.print("in Venus ");
			break;
		case 2:
			weight=0.39*weight1;
			System.out.print("in Mars ");
			break;
		case 3:
			weight=2.65*weight1;
			System.out.print("in Jupiter ");
			break;
		case 4:
			weight=1.17*weight1;
			System.out.print("in Saturn ");
			break;
		case 5:
			weight=1.05*weight1;
			System.out.print("in Uranus ");
			break;
		case 6:
			weight=1.23*weight1;
			System.out.print("in Ueptune ");
			break;
		}
		System.out.printf("your weight is:%.2f",weight);

	}

}
