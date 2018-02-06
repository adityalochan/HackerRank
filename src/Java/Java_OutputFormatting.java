package Java;

import java.util.Scanner;

public class Java_OutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                			int stringLength = s1.length();
			int stringSpace = 14 - stringLength;
			Java_OutputFormatting p = new Java_OutputFormatting();
			System.out.print(s1);
			p.stringValue(stringSpace);
			p.integerValue(x);
			
		}
        System.out.println("================================");
	}
			public void integerValue(int x){
				if(x<10)
					System.out.println("00"+x);
				if(x>=10 && x<100)
					System.out.println("0"+x);
				if(x>=100 && x<1000)
					System.out.println(x);
			}
			public void stringValue(int y){
				
				for(int i=0;i<=y;i++)
					System.out.print(" ");
			}
          }

