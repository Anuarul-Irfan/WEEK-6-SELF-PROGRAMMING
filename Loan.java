package selfprogramming;

import java.util.Scanner;
public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		if ((age >= 25) && (age <= 50))
		{
			System.out.println("You are qualified to apply");
		}
		else 
		{
		     System.out.println("You are NOT qualified to apply"); 
		}


	}

}
