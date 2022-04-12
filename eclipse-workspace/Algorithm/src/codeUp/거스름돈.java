package codeUp;

import java.util.ArrayList;
import java.util.Scanner;

public class °Å½º¸§µ· {
	public static Integer count=0;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		ArrayList<Integer> money=new ArrayList();
		money.add(50000); money.add(10000); money.add(5000); money.add(1000); money.add(500); money.add(100); money.add(50); money.add(10);
		
		while(input!=0) {
			for(int i=0; i<money.size();i++) {
				while(input>=money.get(i)) {
					count+=1; input-=money.get(i);
				}
			}
		}
		System.out.println(count);
	}

}
