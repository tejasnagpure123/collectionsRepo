package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(20);
		list.add(90);
		list.add(10);
		list.add(20);
		
		//Linked HashSet
		LinkedHashSet<Integer>set=new LinkedHashSet<>();
		set.addAll(list);
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			int num=(int) itr.next();
			System.out.println("Linked HashSet Output--Where duplicate removed and Insertion order is Maintained : "+num);
		}
		
		//Tree Set
		TreeSet<Integer>setTree=new TreeSet<>();
		setTree.addAll(list);

		Iterator itr1=setTree.iterator();

		while(itr1.hasNext()) {
			int num=(int) itr1.next();
			System.out.println("TreeSet Output--Where duplicate removed and set is sorted: "+num);
		}
	}

}
