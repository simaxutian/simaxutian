package lesson1;

import java.util.*;

public class Homework6 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("input a number");
		int number = a.nextInt();
		for(int i =0;i<number;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<number;j++)
				{
					System.out.print("* ");
					
				}System.out.println();
			}else 
			{
				for(int j=0;j<number;j++)
				{
					System.out.print(" *");
					
				}System.out.println();
			}
		}

	}

}
