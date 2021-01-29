package question4;

import java.util.Scanner;

public class BankAcc {
	
	String acc,accnum,acctype;
	String name, branch;
	double balance,deposit,withdraw;
	static int option;
	
	static Scanner s = new Scanner(System.in);
	
	 void NewAcc() {
		
		System.out.println("Enter your Name : ");
		 name = s.next();
		System.out.println("Enter your Account Number : ");
		 acc = s.next();
		System.out.println("Enter your balance : ");
		 balance = s.nextDouble();
		System.out.println("Enter the branch : ");
         branch = s.next();
      //   System.out.println("Enter your account type : ");
        // acctype=s.next();
        System.out.println("Your Account is created :) ");
       // 		"\n Account Holder Name : " +name+ "\nBalance :  " +balance);
        
	}
	 
	 void AccDetails() {
		//System.out.println("Enter the Account Number : ");
		//int acc = s.nextInt();
		//NewAcc();
		 System.out.println("Enter the Account Number : ");
		 accnum = s.next();
		 if(accnum.equals(acc)) {
			 System.out.println(" \n Account Number : "+acc+
		        		"\n Account Holder Name : " +name+ "\nBalance :  " +balance);
			 
		 }
		 else {
			 System.out.println("Account not found");
		 }
		}
	 
	 void TotalAmt() {
		 System.out.println("\nTotal Money in your Account : "+balance);
	 }

	 void Deposit() {
		System.out.println("Enter the amount to be deposited : "); 
		deposit = s.nextDouble();
		balance = balance + deposit;
		System.out.println("Current Balance is : " +balance);
	 }
	 
	 void Withdraw() {
		 System.out.println("Enter the amount to be withdrawn : ");
		 withdraw = s.nextDouble();
		// String savings = null;
		//if(acctype == savings) {
		 //if (balance>=10000) {
		 balance = balance - withdraw;
		// }
	//else{
			 System.out.println("Minimum Balance in the account should be 5000");
			 System.out.println("Current Balance After withdrawal : \" +balance");
		// }
		//}
		/*else {
			 if (balance>=2000) {
			balance = balance - withdraw;
		}
			 else {
				 System.out.println("Minimum Blance in the account should be 1000");				 
			 }}
		 System.out.println("Current Balance after withdrawal : " +balance);*/
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAcc a = new BankAcc();
		do {
		System.out.println("Enter your option to proceed : ");
		option = s.nextInt();
		switch(option) {
		
		case 1 : a.NewAcc();
		break;
		case 2 : a.AccDetails();
		break;
		case 3 : a.TotalAmt();
		break;
		case 4 : a.Deposit();
		break;
		case 5 : a.Withdraw();
		break;
		case 6 : System.out.println("Exited");
		break;
		default : System.out.println("Invalid option");
		}
	}
	
	while(option!=6);
}}
