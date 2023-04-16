package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntersection {
	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Integer[] arr1 = { 66,11,22,33,44,55,66,7,8};

		List<Integer> var1 = new ArrayList<Integer>(Arrays.asList(arr1));
		List<Integer> var = new ArrayList<Integer>(Arrays.asList(arr));

		for (int i = 0; i < var.size(); i++) {


			for (int j = 0; j < var1.size(); j++) {

				if (arr[i] == arr1[j]) {

					System.out.println(arr[i]);

				}
			}

		}
	}
}
