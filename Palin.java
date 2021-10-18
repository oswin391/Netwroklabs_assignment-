package javaProject;

import java.util.Scanner;

public class Palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num, rem, orig, rev=0;
	        Scanner in = new Scanner(System.in);
	       System.out.println("entert the number");
	       num = in.nextInt();
	       orig = num;
	       
	       while(num !=0)
	       {
	    	   rem = num%10;
	    	   rev =rev*10+rem;
	    	   num = num/10;
	       }
	       
	       if(rev == orig)
	       {
	    	   System.out.println("its a pal");
	       }
	       else
	       {
	    	   System.out.println("its a  not pal");
	       }
	}

}
