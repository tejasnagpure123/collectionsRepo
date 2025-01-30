package SortBtNotRemoveDuplicatesCollenctionsSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSORT {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(20);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(10);
		list.add(5);
		list.add(7);
		list.add(50);
		list.add(60);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		System.out.println(Collections.frequency(list, 50));
	}

}
