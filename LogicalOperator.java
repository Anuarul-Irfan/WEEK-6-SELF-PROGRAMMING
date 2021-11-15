package selfprogramming;

import java.util.Scanner;
public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double balance = 5000;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount: ");
		double amount = sc.nextDouble();
		
		
		if  ((amount <= 1000.0) && (amount <= balance))
		{  
			balance = balance - amount;
			System.out.println("Acct new balance = " + balance);
		}


	}

}
