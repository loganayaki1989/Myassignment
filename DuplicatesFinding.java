package week3.day3;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesFinding {

	public static void main(String[] args) 
	{
		String name="kavkavi";
		String newName="";
		Set<Character> original=new HashSet<Character>();
		Set<Character> duplicate=new HashSet<Character>();
		char[] charArray = name.toCharArray();
		for (char c : charArray) 
		{
			if(!original.add(c))
			{
				duplicate.add(c);
			}
		}
		for (char c : duplicate) 
		{
			newName=newName+c;
		}
		System.out.println("The Duplicate Letters are : "+newName);
	}

}
