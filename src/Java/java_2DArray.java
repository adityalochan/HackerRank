package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class java_2DArray {

           public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
//        for(int x=0; x <6 ; x++){
//            for(int y=0; y <6; y++){
//            	System.out.print(arr[x][y] + " ");
//            }
//            System.out.println();
//        }
//        int l=0;
//        int m=0;
//        int max = 0;
//        int o = 0;
//        int max_array[] = new int[20];
//      
//        	for(int n=3;n<7; n++){
//        		System.out.println("n is :" + n);
//        		for( l=n-3; l < n; l++){
//        			System.out.println("l is "+ l);
//        			for(m=n-3; m<n; m++){
//        				max = max +	arr[l][m];
//        				System.out.println("m is "+ m);
//        				System.out.println("array value is :" + arr[l][m]);
//        				System.out.println("max is:"+ max);
//        			}      
//        		}
//        		max_array[o] = max;
//        		o++;
//        		max =0;
//        		System.out.println(max_array[o]);
//        	}
//        for(int d=0 ; d <max_array.length; d++){
//        	int max_final = 0; 
//        	if(max_array[d] > max_final)
//        		max_array[d] = max_final;
//        	System.out.println(max_array[d]);
//        }
        int max = -100; 
        for(int l=0;l< 4 ; l++){
        	for(int m=0;m< 4; m++){
        		int sum = arr[l][m] + arr[l][m+1] + arr[l][m+2] 
        							+ arr[l+1][m+1] +
        				  arr[l+2][m] + arr[l+2][m+1] + arr[l+2][m+2]; 
        		if(sum > max)
        			max = sum;
        	}
        }
        System.out.println(max);
    }
}
