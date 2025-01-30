package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapFlow {

	public static void main(String[] args) {
		
		Map<String,String>m=new HashMap<>();
		m.put("a", "ankita");
		m.put("b", "Saurabh");
		m.put("c", "Dipak");
		m.put("d", "Vaishali");
		Set<String>keys=m.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()) {
			String key= (String) itr.next();
			String names=m.get(key);
			System.out.println(names);
		}
	}

}
