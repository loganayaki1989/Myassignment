package week3.day1;


	
		// TODO Auto-generated method stub
		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.Collections;
		import java.util.List;
		public class ArrayFindSecondLargest {
	
		public static void main(String[] args) {
			
			List<Integer> b=new ArrayList<Integer>();
				b.add(3);
				b.add(2);
				b.add(11);
				b.add(4);
				b.add(6);
				b.add(7);
				Collections.sort(b);
				System.out.println(b);
				
				int length=b.size();
				int data[]=new int[length];
				//System.out.println(length);
				for(int i=0;i<length;i++)
				{
					data[i]=b.get(i);
				}
			
				System.out.println("Second Largest Element:"+ data[length-2]);
			}

		
	}


