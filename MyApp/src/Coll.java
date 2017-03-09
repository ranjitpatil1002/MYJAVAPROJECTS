import java.util.*;
import java.util.Collections;
public class Coll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add("Ranjit");
		l.add("Pranju");
		l.add("katali");
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		l.remove(1);
		//l.remove(2);
		l.remove(0);
		System.out.println(l);
		if(l.isEmpty())
			return;
		System.out.println(l);
		
		
		List ll=new LinkedList();
		ll.add("10");
		ll.add("20");
		ll.add("30");
		System.out.println(ll.get(1));
		System.out.println(ll.lastIndexOf("20"));
		System.out.println(ll.size());
		System.out.println(ll.hashCode());
		System.out.println(l==ll);
		l.clear();
		System.out.println(l.isEmpty());
		System.out.println(ll.contains("20"));
		
		
		Set ss=new HashSet();
		ss.add("rama");
		ss.add("soma");
		ss.add("roma");
		System.out.println(ss);
		
		SortedSet s=new TreeSet();
		s.add("n");
		s.add("a");
		s.add("y");
		s.add("l");
		System.out.println(s);
		Iterator it=s.iterator();
		while(it.hasNext())
			{Object e=it.next();
			System.out.println(e.toString());}
		
		
		
		Map mp= new HashMap();
		mp.put("anna","10");
		mp.put("tanna","20");
		System.out.println(mp.entrySet());
		System.out.println(mp.keySet());
		System.out.println(mp);
		
		Enumeration days;
		Vector dn=new Vector();
		dn.add("Sunday");
		dn.add("Monday");
		dn.add("Tuesday");
		dn.add("Wednseday");
		dn.add("Thursday");
		dn.add("Friday");
		dn.add("Saturday");
		days=dn.elements();
		while(days.hasMoreElements())
			System.out.println(days.nextElement());
		
	}

}
