package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class java_HashSet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}

		//
		// for (int l = 0; l < t; l++) {
		// pair_left[l].toLowerCase();
		// pair_right[l].toLowerCase();
		// }
		// int k = 1;
		// HashSet<Object> h = new HashSet<>();
		// h.add(pair_left[0]);
		// h.add(pair_right[0]);
		// System.out.println(k);
		// for(int j =1 ; j < t; j++){
		// // System.out.println(h + "///////////");
		//// for(int l =1; l < t; l++) {
		// if(((h.contains(pair_left[j]) == true)) &&
		// ((h.contains(pair_right[j]) == true))){
		//// System.out.println("contains value");
		// }else{
		// h.add(pair_left[j]);
		// h.add(pair_right[j]);
		// k++;}
		// System.out.println(k);
		// }
		//// }
		HashSet<Object> h = new HashSet<>();
		for (int j = 0; j < t; j++) {
			h.add(pair_left[j] + " " + pair_right[j]);
			System.out.println(h.size());
		}
	}
}