package first;

import java.util.Scanner;

public class FirstClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("당신은 선주입니까 재현입니까?");
		String case1 = sc.nextLine();
		if(case1.equals("선주")) {
			System.out.println("당신은 바보입니다.");
		}else if(case1.equals("재현")) {
			System.out.println("당신은 똑똑이입니다.");
		}else {
			System.out.println(case1);
		}
		sc.close();
	}

}
