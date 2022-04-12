package lifeCoding;

import java.util.Scanner;

public class Override02 extends Override01 implements moeum{
	Scanner sc=new Scanner(System.in);
	
	public void addName() {
		String name;
		System.out.println("이름을 입력하시오.");
		name= sc.nextLine();
		System.out.println("당신의 이름은 "+name+"입니다.");
		sc.close();
	}
	
	public void print() {
		System.out.print("박재현");super.print();
	}
	

}
