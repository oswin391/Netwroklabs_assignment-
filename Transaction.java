package javaProject;
import java.util.*;
public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int BalanceMoney = 500000,withdraw,deposit,pin = 6753;
		Scanner in = new Scanner(System.in);
		
			    System.out.println("enter the ATM pin");
			    int number = in.nextInt();
			    if(number == pin)
			    {
			    	System.out.println("ATM");
			    	System.out.println("enter 1 for Withdraw");
		            System.out.println("enter 2 for Deposit");
		            System.out.println("enter 3 for Check Balance");
		            System.out.println("enter 4 for EXIT");
		            System.out.println("chose the oparation u need to follow:");
		            int input = in.nextInt();
		            
		            switch(input)
		            {
		            case 1:
		            	System.out.println("enter money to withdraw");
		            	withdraw = in.nextInt();
		            	if(BalanceMoney >= withdraw)
		            	{
		            		BalanceMoney = BalanceMoney - withdraw;
		            		System.out.println("you can take your money");
		            		System.out.println("your balance is "+BalanceMoney);
		            	}
		            	else
		            	{
		            		System.out.println("you are out of balance");
		            	}
		            	System.out.println("");
		            	break;
		            	
		            case 2:
		                System.out.print("Enter money to be deposited:");
		                deposit = in.nextInt();
	            		BalanceMoney = BalanceMoney + deposit;
		                System.out.println("Your Money has been successfully depsited");
		                System.out.println("your balance is "+BalanceMoney);
		                System.out.println("");
		                break;
		                
		            case 3:
		                System.out.println("Balance : "+BalanceMoney);
		                System.out.println("");
		                break;
		 
		                case 4:
		                System.exit(0);
		            }
			    }
			    else
			    {
			    	System.out.println("enter correct pin");
			    }
	            
	            
	            
	       
		

	}

}
