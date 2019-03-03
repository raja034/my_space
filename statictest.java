class child
{
	static int counter =1;
	public child() {
	System.out.println("Initial value is "+counter);
	}
	public void method()
	{
		System.out.println("Value updated to "+counter);
	}
}
public class statictest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child ch=new child();
		child.counter++;
		ch.method();
		child.counter++;
		ch.method();
		child.counter++;
		ch.method();
	}

}
