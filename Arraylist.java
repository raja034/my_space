import java.util.*;
class student
{
	String FirstName,LastName;
	student(String FirstName,String LastName)
	{
		this.FirstName=FirstName;
		this.LastName=LastName;
	}
	
}
public class Arraylist {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Raja");
		list.add("Gandham");
		list.add("");
		list.add("");
		list.add("");
		
		list.set(0,"FirstName:");
		list.set(1,"LastName");
		System.out.println(list.size());
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		student s1=new student("Raja","Gandham");
		student s2=new student("Girish","Gandham");
		List<student> stu=new ArrayList<student>();
		stu.add(s1);
		stu.add(s2);
		for(student s:stu)
		{
			System.out.println("First Name:"+s.FirstName+"\tLast Name:"+s.LastName);
		}

	}

}
