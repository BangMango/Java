package first;

import java.util.Scanner;

public class FirstClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("����� �����Դϱ� �����Դϱ�?");
		String case1 = sc.nextLine();
		if(case1.equals("����")) {
			System.out.println("����� �ٺ��Դϴ�.");
		}else if(case1.equals("����")) {
			System.out.println("����� �ȶ����Դϴ�.");
		}else {
			System.out.println(case1);
		}
		sc.close();
	}

}
