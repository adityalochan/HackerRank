package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class java_SubArray {

    public static void main(String[] args) {
    int count = 0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];
    for(int i=0;i<n;i++){
    	array[i] = sc.nextInt();
    }
    for(int j=0;j<n;j++){
    int sum =0;
    for(int k=j;k<n;k++){
    	sum = array[k]+ sum;
    	if(sum< 0){
    		count++;
    		}
    	}
    }
    System.out.println(count);
  }
   
}
