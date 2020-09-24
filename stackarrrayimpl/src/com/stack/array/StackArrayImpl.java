package com.stack.array;

import java.util.Scanner;

public class StackArrayImpl {
	
	
	    int top;   
	    int maxsize = 1;  
	    int[] arr = new int[maxsize];  
	      
	      
	    boolean isEmpty()  
	    {  
	    	System.out.println("Stack is Empty....");
	        return (top < 0);  
	        
	    }  
	    
	    
	    StackArrayImpl()  
	    {  
	        top = -1;  
	    }  
	    boolean push (Scanner sc)  
	    {  
	        if(top == maxsize-1)  
	        {  
	            System.out.println("Overflow !!");  
	            return false;  
	        }  
	        else   
	        {  
	            System.out.println("Enter Value");  
	            int val = sc.nextInt();  
	            top++;  
	            arr[top]=val;  
	            System.out.println("Item pushed");  
	            return true;  
	        }  
	    }  
	    boolean pop ()  
	    {  
	        if (top == -1)  
	        {  
	            System.out.println("Underflow !!");  
	            return false;  
	        }  
	        else   
	        {  
	            top --;   
	            System.out.println("Item popped");  
	            return true;  
	        }  
	    }  
	    
	    void peek()
	    {
	    	if(top>=(maxsize-1))
	    	{
	    		System.out.println("overflow");
	    	}
	    	else if(top<0)
	    	{
	    		System.out.println("underflow");
	    	}else
	    	{
	    		System.out.println(arr[top]);
	    	}
	    	
		
	    	
	    }
	    void display ()  
	    {  
	    	if(top>=(maxsize))
	    	{
	    		System.out.println("overflow");
	    	}
	    	else if(top<0)
	    	{
	    		System.out.println("underflow");
	    	}else {
	        System.out.println("Printing stack elements .....");  
	        for(int i = top; i>=0;i--)  
	        {  
	            System.out.println(arr[i]);  
	        }  
	    }  
	    }
	


}
