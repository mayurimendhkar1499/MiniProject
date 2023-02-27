package BankApp;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name,city;
		int amount;
		int accno;
		ArrayList<Account>list=new ArrayList();
		list.add(new Account(" Mayuri mendhkar ","Pune ",10000));
		list.add(new Account(" pooja desai ","dhule ",50000));
		list.add(new Account(" neha dighe ","nagpur",7000));
		list.add(new Account(" rajni patil ","mumbai",9000));
		
		System.out.println("select oprations");
		System.out.println("1.Open Account");
		System.out.println("2.Money Deposite");
		System.out.println("3.Money withdrow ");
		System.out.println("4.View Account Details ");
		System.out.println("5.List of all Accounts Details");
		System.out.println("6.Exit");
		
		int choice;
		boolean found;
		do {
		System.out.println("Enter your choice ----> ");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Open Account ----> ");
			System.out.println("enter the name");
			name=sc.next();
			System.out.println("enter the city");
			city=sc.next();
			System.out.println("enter the amount");
			amount=sc.nextInt();
			Account acc=new Account(name,city,amount);
			System.out.println("Account open succesfully ....!");
			list.add(acc);
			break;
		case 2:
			System.out.println("Money Deposite ----> ");
			found=false;
			System.out.println("Enter the account number ");
			accno=sc.nextInt();
			for(Account ac:list)
			{
				if(accno==ac.getAccno()) {
				found=true;	
				System.out.println("customer name "+ac.getName());
				System.out.println("City "+ac.getCity());
				System.out.println("Account balence "+ac.getBal());
				
				System.out.println("Enter ammount to deposite the money ");
				amount=sc.nextInt();
				ac.setBal(ac.getBal()+amount);
				System.out.println("Deposite Succesfully ......!");
				break;
				}
			}
			if(!found) {
				System.out.println("Invalid Account number .... ");
			}
			break;
			
		case 3:
			System.out.println("Money withdrow ----> ");
			found=false;
			System.out.println("Enter the account number");
			accno=sc.nextInt();
			for(Account ac:list)
			{
				if(accno==ac.getAccno()) {
				found=true;	
				System.out.println("customer name "+ac.getName());
				System.out.println("City "+ac.getCity());
				System.out.println("Account balence "+ac.getBal());
				
				System.out.println("Enter ammount to withdrow the money ");
				amount=sc.nextInt();
				if(amount<=ac.getBal()) 
				{
				    ac.setBal(ac.getBal()-amount);
				    System.out.println("Withdrow Succesfully .....! ");
				}
				else 
				{
					System.out.println("Insufficient balance ....! ");
				}
				break;
				}
			}
			if(!found) {
				System.out.println("Invalid Account Number ..... ");
			}
			break;
			
		case 4:
			System.out.println("View Account Details ---->");
			found=false;
			System.out.println("enter the account number");
			accno=sc.nextInt();
			for(Account ac:list)
			{
				if(accno==ac.getAccno()) {
				found=true;	
				System.out.println("customer name "+ac.getName());
				System.out.println("City "+ac.getCity());
				System.out.println("Account balence "+ac.getBal());
				break;
				}
			}
			if(!found) {
				System.out.println("Invalid Account number ....");
			}
			break;
		
		case 5:
			System.out.println("List of all Accounts Details ...");
			for(Account ac:list)
				{
					System.out.println(ac);
				}
			break;
			
		case 6:
			System.out.println("Thanks for visiting...");
			break;
			default:
				System.out.println("Invalid choice .....");
				break;
		}
		}while(choice!=6);


	}

}
