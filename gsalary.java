import java.util.*;
class gsalary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Basic Salary:");
		double a=sc.nextDouble();
		double DA=a*15/100;
		double HRA=a*10/100;
		double GS=a+DA+HRA;
		System.out.println("Grossed Salary:"+GS);
		}
	}
