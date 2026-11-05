package dailyassignment17;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Remove_Duplicate_Numbers_HashSet {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(50);
		list.add(30);
		System.out.println("Input array list : ");
		System.out.println(list);
		System.out.println();
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
		System.out.println("Output set list : ");
		System.out.println(set);
		System.out.println();
		System.out.println("Total unique elements : " +set.size());

	}

}
