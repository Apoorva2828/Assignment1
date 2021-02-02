package assignment1;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		int num= s.nextInt();
		int temp=num;
		int rev=0,rem;
		
		while(temp !=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}

		if(num==rev)
		{
			System.out.println("it is a palindrome number");
			
		}
		else
		{
			System.out.println("it is not a palindrome number");
		
		}
	}

}
