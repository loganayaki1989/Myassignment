package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintCharacSet {

	public static void main(String[] args) {
		String companyName="google";
		char[] ch=companyName.toCharArray();
		Set<Character> use=new LinkedHashSet<Character>();
		for(Character c:ch)
		{
			use.add(c);
			
		}
		System.out.println(use);
		// TODO Auto-generated method stub

	}

}
