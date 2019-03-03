import java.util.Scanner;

class genarator
{
public static void printer(int n)
{
	int count = n * (n+1);
	int lineno =0;
	System.out.println("count ="+count);
	int checker = count / 2; //to find highest even number
	System.out.println("checker ="+checker);
	int dynamicnofrnt =0;
	//global loop
	for(int k=checker;k>=0;k-=2)
	{
		lineno = k;
		//System.out.println("line number ="+lineno);
	
	for(int m=1;m<=lineno;m++)
	{
		System.out.print("*"+(m+dynamicnofrnt));
		if(m == lineno/2)
		{
			for(int r=count-((lineno/2)-1);r<=count;r++)
			{
				System.out.print("*"+(r-dynamicnofrnt));
			}
		}
		if(m >= (lineno/2))
		{
			dynamicnofrnt = m + dynamicnofrnt;
			break;			
		}
		
	}
	System.out.println("\n");
	}
}

}
public class tricky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Integer");
		int n=in.nextInt();
		genarator.printer(n);
	}

}
