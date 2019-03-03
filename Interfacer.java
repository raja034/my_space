import java.time.*;
import java.time.format.*;
interface multi1
{
	abstract void display();
}
interface multi2
{
	abstract void display();
}

class imnt implements multi1,multi2
{

	@Override
	public void display() {
		System.out.println("Multiple inheritence");
		
	}
	

}
class imnt2 implements multi1
{
	public void display()	{
		
		System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd").format(LocalDateTime.now()));
	}

}
public class Interfacer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imnt ob=new imnt();
		ob.display();
		imnt2 obj=new imnt2();
		obj.display();
	}

}
