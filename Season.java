import java.util.Scanner;
class Season
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st 3 character of month: ");
		String mo = sc.next().toUpperCase();
		System.out.println( (mo.equals("FEB")||mo.equals("MAR")||mo.equals("APR")||mo.equals("MAY"))?("Summer"):
							( (mo.equals("JUN")||mo.equals("JUL")||mo.equals("AUG")||mo.equals("SEP"))?("Monsoon"):
								( (mo.equals("OCT")||mo.equals("NOV")||mo.equals("DEC")||mo.equals("JAN"))?("Winter"):("Invalid Input") ) ) );

	}
}
 
 
