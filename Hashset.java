import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("hello");
		hs.add("How are");
		hs.add("you");
		for(String s:hs)				
		{
			System.out.println(s);
		}
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.addAll(hs);
		lhs.add("one");
		lhs.add("two");
		Iterator<String> it=lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("amit");
		queue.add("amit");
		queue.add("rraja");
		queue.add("rraja");
		System.out.println(queue.peek());
		for(String q:queue) {
			System.out.println(q);
		}
		
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("1");
		dq.add("2");
		for(String q:dq) {
			System.out.println(q);
		}
		
	}

}
