//welcom to Line Comparision Computation Program
import java.util.Scanner;

public class Cartesian
{
	int length1=0;
	int length2=0;

	public void length(int x1,int x2,int x3,int x4,int y1,int y2,int y3,int y4)
	{
		double length1=Math.sqrt((x2-x1)^2 + (y2-y1)^2);
		System.out.println(length1);
		double length2=Math.sqrt((x4-x3)^2 + (y4-y3)^2);
		System.out.println(length2);
	}

	public void Equal()
	{
		if(length1 == length2)//using Equal method
			System.out.println("Equal");
		else
			System.err.println("Not equal");
	}

	public void compareto()
	{
		System.out.print("Using compareTo = ");//using compareTo method
		String s1=String.valueOf(length1);
		String s2=String.valueOf(length2);

		if(s1.compareTo(s2) == 0)
			System.out.print("Equal");
		else
			System.out.print("Not Equal");

	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);

		System.out.print("enter x1 = ");
		int x1=sc.nextInt();
		System.out.print("enter x2 = ");
		int x2=sc.nextInt();
		System.out.print("enter y1 = ");
		int y1=sc.nextInt();
		System.out.print("enter y2 = ");
		int y2=sc.nextInt();
		System.out.println(".........................................");

		System.out.print("enter x3 = ");
		int x3=sc.nextInt();
		System.out.print("enter x4 = ");
		int x4=sc.nextInt();
		System.out.print("enter y3 = ");
		int y3=sc.nextInt();
		System.out.print("enter y4 = ");
		int y4=sc.nextInt();

		Cartesian tl=new cartesian();
		tl.length(x1,x2,x3,x4,y1,y2,y3,y4);
		tl.Equal();
		tl.compareto();


	}

}
