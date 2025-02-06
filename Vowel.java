import java.util.Scanner;
class Vowel
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Alphabet : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?
			("Is a Vowel"):("Is a Consonent"));
	}
}
