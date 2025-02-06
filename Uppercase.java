import java.util.Scanner;
class Uppercase
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.nextLine().charAt(0);
		System.out.println((ch>=65 && ch<=90)?("Uppercase character"):("Not an uppercase character"));
	}
}
