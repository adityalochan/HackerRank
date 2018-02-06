package Java;

import java.util.*;

public class java_ArrayList {
	int n,d,q,x,y;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList[] a = new ArrayList[n];
		for(int i=0; i<n;i++){
			int d = sc.nextInt();
			a[i] = new ArrayList(d); 
			
			
			for(int j=0; j<d; j++){
				a[i].add(sc.nextInt());
			//putElements(a.get(i));
			//System.out.println(a.get(i));
		}
			sc.nextLine();
		}
		int q = sc.nextInt();
		for(int k=0;k<q;k++){
			// x = lines y = index 
		int x = sc.nextInt();
		int y= sc.nextInt();
		try{
	        System.out.println( a[x-1].get(y-1));
	        }
	        catch(Exception e)
	        {
	            System.out.println("ERROR!");
	        }
		//getElements(x,a);
		
		}	
	}
//	public static void putElements(Object object){
//		((ArrayList) object).add(sc.nextLine());
		
//		while(sc.hasNext()){
//			String s1 = sc.next();
//		((ArrayList) object).add(s1);
//		if(s1.equals(" ")){
//				break;
//		}
//		}
	
	public static void getElements(int x,Object object){
		try{
		System.out.println(((ArrayList) object).get(x-1));
	}
		catch(Exception e){
		System.out.println("Error");
	}
}
}