package assignment1;
import java.util.Scanner;
public class prime10to99 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number");
		int number=s.nextInt();
		int temp=0;
		for(int i=10;i<=99;i++)
		{
			if(number%2==0)
			{
				temp=temp+1;
			}
		}
		
		if(temp==0)
		{
			System.out.println("it is a prime number");
		}
		else
		{
			System.out.println("it is not a prime number");
		}
		
		
	}



	}


