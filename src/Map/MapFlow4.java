package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapFlow4 {

	public static void main(String[] args) {
		Map mh=new HashMap();
		mh.put(1, "Nagpur");
		mh.put(2, "Pune");
		
		Map jh=new HashMap();
		jh.put(3, "Ranchi");
		jh.put(4, "Bokaro");
		
		Map india=new HashMap();
		india.put(5, mh);
		india.put(6, jh);
		
		//Set for India
		Set keysCountry=india.keySet();
		Iterator itr=keysCountry.iterator();
		while(itr.hasNext()) {
			int keysCount=(int) itr.next();
			Map state=(Map) india.get(keysCount);
			System.out.println(state
					);
			Set keyStates=state.keySet();
			Iterator itr2=keyStates.iterator();
			while(itr2.hasNext()) {
				int citesKey=(int) itr2.next();
				String cities=(String) state.get(citesKey);
				System.out.println(cities);
			}
			
		}
		
		
		
		
	}

}
