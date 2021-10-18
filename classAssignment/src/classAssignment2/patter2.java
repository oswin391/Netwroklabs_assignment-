package classAssignment2;

import java.util.Scanner;

public class patter2
{
    public static void main(String[] args) 
    {
         
        int n = 5;
         
         
       /* for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            for (int k = i; k <= n; k++) 
            { 
                System.out.print(k+" "); 
            } 
             
            System.out.println(); 
        }*/ 
         
        for (int i = n; i >= 1; i--) 
        {
             for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++)
            {
                System.out.print(k+" ");
            }
             
            System.out.println();
        }
        
    }
}