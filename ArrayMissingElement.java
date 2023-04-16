package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> m=new ArrayList<Integer>();
		m.add(1);
		m.add(2);
		m.add(3);
		m.add(4);
		m.add(7);
		m.add(6);
		m.add(8);
		
		Collections.sort(m);
		System.out.println(m);
		int length=m.size();
		
		int arr[]=new int[length];
		
		for(int i=0;i<length;i++)
		{
			arr[i]=m.get(i);
		}
		for(int i=0;i<length;i++)
		{
			int j = i + 1;
			if (arr[i] != j) {
				System.out.println("Missing element is: " + j);
				break;
			}
				
		}
	}

	}


