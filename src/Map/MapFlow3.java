package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapFlow3 {

	public static void main(String[] args) {
		List mh=new ArrayList();
		mh.add("Nagpur");
		mh.add("Pune");
		List jh=new ArrayList();
		jh.add("Ranchi");
		jh.add("Bokaro");

		Map ind=new HashMap();
		ind.put(1, mh);
		ind.put(2,jh);
		
		Set keys=ind.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()) {
			int key=(int) itr.next();
			List values=(List) ind.get(key);
			//System.out.println(values);
			Iterator itr2=values.iterator();
			while(itr2.hasNext()) {
				String cities=(String) itr2.next();
				System.out.println(cities);
			}
		}
		
	}

}
