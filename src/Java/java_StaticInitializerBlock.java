package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class java_StaticInitializerBlock {

	public static int myVar = initializeClassVariable();
	private static boolean flag;
	private static Integer B;
	private static Integer H;
    
    private static int initializeClassVariable()
    {
        flag = true;
    	Scanner sc1 = new Scanner(System.in);
    	B =sc1.nextInt();
    	//Scanner sc2 = new Scanner(System.in);
		H = sc1.nextInt();
    		
    		if( B<=0 || B>=100 || 0>=H || H>=100)
    		{
    			try
    	    	{
    				flag = false;
    				throw new InputMismatchException();
    	    	}
    			catch(InputMismatchException e)
    			{
    						System.out.println("java.lang.Exception: Breadth and height must be positive");
    						flag = false;
    			}
    		}
    		
    		return B+H;	
    }
	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
