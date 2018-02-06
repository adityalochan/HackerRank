package Java;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class java_Map{
 public static void main(String []argh)
 {
	  HashMap h = new HashMap();
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    in.nextLine();
    for(int i=0;i<n;i++)
    {
       String name=in.nextLine();
       int phone=in.nextInt();
       in.nextLine();
       h.put(name, phone);
    }
    while(in.hasNext())
    {
  	  // Set s = h.entrySet();
       String s1 =in.nextLine();
       if(h.containsKey(s1)){
      	 System.out.println(s1 + "="+ h.get(s1));
       }
       else{
      	 System.out.println("Not found");
       }
    }
 }
}
