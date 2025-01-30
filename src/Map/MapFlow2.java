package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapFlow2 {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "tejas");
		m.put(2, "Saurabh");
		m.put(3, "Ankita");
		m.put(4, "dj");

		Set<Integer>keys=m.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()) {
			int key=(int) itr.next();
			String names=m.get(key);
			System.out.println(names);
		}
	}

}
