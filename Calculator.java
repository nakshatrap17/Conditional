import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		float n1 = sc.nextFloat();
		System.out.println("Enter num2: ");
		float n2 = sc.nextFloat();
		System.out.println("Enter operand: ");
		char op = sc.next().charAt(0);
		
		float opt = 0;
		
		opt =(op=='+')?n1+n2: 
			 (op=='-')?n1-n2:
			 (op=='*')?n1*n2:
			 (op=='/')?n1/n2:
			 (op=='%')?n1%n2:0.000001f;
		
		if(!(opt==0.000001f))
		{
			System.out.println(n1+" "+op+" "+n2+" = "+opt);
		}
	}
}
