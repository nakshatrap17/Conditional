class SumOfEvenOdd 
{
	public static void main(String[] args) 
	{
		int no = 7264;
		int ev = 0;
		int od = 0; 
		int rem;
		int temp;
		
		rem = no%10;
		temp = (rem%2==0)?(ev=ev+rem):(od=od+rem);
		no = no/10;
		
		rem = no%10;
		temp = (rem%2==0)?(ev=ev+rem):(od=od+rem);
		no = no/10;
		
		rem = no%10;
		temp = (rem%2==0)?(ev=ev+rem):(od=od+rem);
		no = no/10;
		
		rem = no%10;
		temp = (rem%2==0)?(ev=ev+rem):(od=od+rem);
		
		System.out.println("Sum of even Dig: "+ev);
		System.out.println("Sum of off Dig: "+od);
	}
}
