import java.util.Scanner;
class UpperLower
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.nextLine().charAt(0);
		System.out.println( ((ch>=65&&ch<=90)||(ch>=97&&ch<=122))?
			((ch>=65 && ch<=90)?("Uppercase character"):("Lowercase character")):
			((ch>=48&&ch<=57)?("It is a Digit"):("It is a Special Character"))
			);
	}
}