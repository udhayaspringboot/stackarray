package com.stack.array;

import java.util.Scanner;

public class StackArray {
	
	
	
	public static void main(String[] args)
	{
		 int choice=0;  
		 char ch = ' ';
		    Scanner sc = new Scanner(System.in);  
		    StackArrayImpl s = new StackArrayImpl();  
		    System.out.println("*********Stack operations using array*********\n");  
		    System.out.println("\n------------------------------------------------\n");  
		    do
		    {  
		        System.out.println("\nChose one from the below options...\n");  
		        System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Peek\n5.Exit");  
		        System.out.println("\n Enter your choice \n");        
		        choice = sc.nextInt();  
		        switch(choice)  
		        {  
		            case 1:  
		            {   
		                s.push(sc);  
		                break;  
		            }  
		            case 2:  
		            {  
		                s.pop();  
		                break;  
		            }  
		            case 3:  
		            {  
		                s.display();  
		                break;  
		            }  
		            case 4:  
		            {  
		                s.peek();  
		                break;  
		            }  
		            default:  
		            {  
		                System.out.println("Please Enter valid choice ");  
		            }  
		        }
		            System.out.println("Do you want to continue ? (Y/N)");
					Scanner acb = new Scanner(System.in);
					ch = acb.next().charAt(0);
				
		    }while (ch == 'y' || ch == 'Y');
		        
		    
	}
		
	
		
}


