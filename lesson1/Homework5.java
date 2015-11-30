package lesson1;

import java.util.*;

public class Homework5 {

	public static void main(String[] args) {
		
		String[] inputArray = new String[]{"horse","dog","cat","dog"};
		ArrayList<String> outputArray = new ArrayList<String>();
		for(int i=0; i<inputArray.length; i++)
		{
		if(!outputArray.contains(inputArray[i]))
		{
			outputArray.add(inputArray[i]);
		}
		}
		Iterator<String> inter = outputArray.iterator();
		while(inter.hasNext())
		System.out.print("\""+inter.next()+"\",");
		
	}

}
