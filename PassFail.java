import java.util.Scanner;
class PassFail 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter HSC obtained marks: ");
		int marks = sc.nextInt();
		int per = (marks*100)/600;
		System.out.println("Percentage: "+per);
		System.out.println((per>75)?("A grade"):( 
		(per<=75&&per>60)?("B Grade"):( (per<=60&&per>35)?("C Grade"):("Fail") ) ) );
	}
}
