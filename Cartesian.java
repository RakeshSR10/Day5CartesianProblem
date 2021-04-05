//welcom to Line Comparision Computation Program
import java.util.Scanner;

public class Cartesian
{

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

		double length1=Math.sqrt((x2-x1)^2 + (y2-y1)^2);
		System.out.println(length1);

		System.out.print("enter x3 = ");
		int x3=sc.nextInt();
		System.out.print("enter x4 = ");
		int x4=sc.nextInt();
		System.out.print("enter y3 = ");
		int y3=sc.nextInt();
		System.out.print("enter y4 = ");
		int y4=sc.nextInt();

		double length2=Math.sqrt((x4-x3)^2 + (y4-y3)^2);
		System.out.println(length2);

		if(length1 == length2)//using Equal method
			System.out.print("Equal");
		else
			System.err.print("Not equal");

				System.out.print("Using compareTo = ");//using compareTo method
		String s1=String.valueOf(length1);
		String s2=String.valueOf(length2);

		if(s1.compareTo(s2) == 0)
			System.out.print("Equal");
		else
			System.out.print("Not Equal");
	}
}
