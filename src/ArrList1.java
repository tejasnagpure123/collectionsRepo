import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrList1 {

	public static void main(String[] args) {
//		Student s1=new Student();
//		s1.setRollNo(1);
//		s1.setName("Tejas");
//		Student s2=new Student();
//		s2.setRollNo(2);
//		s2.setName("Saurabh");
//		
//		List l=new ArrayList();
//		l.add(s1);
//		l.add(s2);
//		
//		Iterator itr =l.iterator();
//		
//		while(itr.hasNext()) {
//			Student stu=(Student) itr.next();
//			System.out.println(stu.getRollNo());
//			System.out.println(stu.getName());
//		}
		
		
		List mh=new ArrayList();
		mh.add("Wardha");
		mh.add("Pune");
		List jh=new ArrayList();
		mh.add("Rani");
		mh.add("Bokaro");
		
		List ind=new ArrayList();
		ind.add(mh);
		ind.add(jh);
		
		
		Iterator itr=ind.iterator();
		
		while(itr.hasNext()) {
			List list=(List) itr.next();
			Iterator itr1=list.iterator();
			while(itr1.hasNext()) {
				String city=(String) itr1.next();
				System.out.println("Cities: : "+city);
			}
		}
		
	}

}
