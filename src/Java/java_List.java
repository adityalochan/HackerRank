package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class java_List {
	static Scanner sc = new Scanner(System.in);
	static List<Integer> array = new ArrayList<>();
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	int N = sc.nextInt();
    	
    	for(int i=0; i<N; i++){
    		array.add(sc.nextInt());
    	}
    	int Q = sc.nextInt();
    	if ( 1<= N && N<=4000 && 1<=Q && Q<=4000){
    		for(int q=0; q<Q; q++){
    			String string_Input = sc.next();
    			if(string_Input.contains("Insert")){
    				Insertion();
    			}
    			if(string_Input.contains("Delete")){
    				Deletion();
    			}
    		}
//    		StringBuilder builder = new StringBuilder();
//    		for (Integer value : array) {
//    		    builder.append(value);
//    		}
//    		String text = builder.toString();
//        	System.out.println(text + " ");
    		String formattedString = array.toString()
    			    .replace(",", "")  //remove the commas
    			    .replace("[", "")  //remove the right bracket
    			    .replace("]", "");  //remove the left bracket
//    			    .trim();   
    		System.out.println(formattedString);
    	}
    	

    	
    }
    
    public static void Insertion(){
    	List<Integer> array1 = new ArrayList<>();
    	for(int i=0; i<2; i++){
    		array1.add(sc.nextInt());
    	}
		int x = array1.get(0);
		int y = array1.get(1);
		array.add(x, y);
	}
	public static void Deletion(){
		
    	int x = sc.nextInt();
		array.remove(x);
	}
}
