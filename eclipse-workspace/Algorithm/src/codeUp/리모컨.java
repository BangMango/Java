package codeUp;

import java.util.Scanner;

public class Main {
	public static int first;
	public static int second;
	public static int count=0;
	public static int carculate(int big, int small) {
		int minus=big-small;
		if(minus>=8) {
			count+=1;
			return 10;
		}else if(minus>=4 && minus<=7) {
			count+=1;
			return 5;
		}else if(minus<=3) {
			count+=1;
			return 1;
		}else {
			return minus;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		first=sc.nextInt();
		second=sc.nextInt();
		while(first!=second) {
			if(first<second) {
				first=first+carculate(second,first);
			}else if(first>second) {
				second=second+carculate(first,second);
			}
		}
		System.out.println(count);
		sc.close();
	}

}
