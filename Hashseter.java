import java.util.HashSet;

public class Hashseter {

	public static void main(String args[]) {
	HashSet<String> hs=new HashSet<String>();
	hs.add("Raja");
	hs.add("Gandham");
	System.out.println(hs);
	for(String s:hs)
	{
		System.out.println(s);
	}
	}
}
