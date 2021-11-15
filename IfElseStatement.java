package selfprogramming;

import java.util.Scanner;
public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int balance = 500, OVERDRAFT_PENALTY = 50;
		
		System.out.print("Enter your amount: ");
		int amount = sc.nextInt();
		
		if (amount <= balance)
		{
			balance = balance - amount;
			System.out.println("Acct new balance = " + balance);
		}
		else
		{
		      balance = balance - OVERDRAFT_PENALTY;
			  System.out.println("TRANSACTION NOT ALLOWED");
		} 

	}

}
