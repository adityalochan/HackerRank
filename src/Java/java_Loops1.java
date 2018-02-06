package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class java_Loops1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int result = 0; 
        for(int i=1;i <= 10 ; i++){
            result = N * i;
            System.out.println(N +" x " + i + " = " + result);
        }
    }
}
