import java.util.*;
class students
{
	String FirstName,LastName;
	students(String FirstName,String LastName)
	{
		this.FirstName=FirstName;
		this.LastName=LastName;
	}
	
}
public class Linkedlist {

	public static void main(String[] args) {
		List<String> ll=new LinkedList<String>();
		ll.add("Welcome");
		ll.add("Student");
		ll.set(0, "To");
		ll.add("");
		((LinkedList<String>) ll).addFirst("Hello");
		((LinkedList<String>) ll).addLast("Gud");
		for(String s:ll)
		{
			System.out.println(s);
		}
		students s1=new students("Raja","Gandham");
		students s2=new students("Giri","Gandham");
		List<students> stu=new LinkedList<students>();
		stu.add(s1);
		stu.add(s2);
		for(students s:stu)
		{
			System.out.println(s.FirstName+"<=>"+s.LastName);
		}

	}

}
