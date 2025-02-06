import java.util.Scanner;
class Larger 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd no: ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd no: ");
		int c = sc.nextInt();
		int lar = (a>b) ? ((a>c)?(a):(c)) : ((b>c)?(b):(c));
		System.out.println("Largest No: "+lar);
	}
}
