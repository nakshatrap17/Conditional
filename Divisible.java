import java.util.Scanner;
class Divisible
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println(
		(a%2==0 && a%5==0 )?("HiTwo HiFive"):( (a%2==0)?("HiTwo"):( (a%5==0)?("HiFive"):("Blank") ) )	
		);
	}
}

