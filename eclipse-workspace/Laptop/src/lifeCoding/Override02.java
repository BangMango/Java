package lifeCoding;

import java.util.Scanner;

public class Override02 extends Override01 implements moeum{
	Scanner sc=new Scanner(System.in);
	
	public void addName() {
		String name;
		System.out.println("�̸��� �Է��Ͻÿ�.");
		name= sc.nextLine();
		System.out.println("����� �̸��� "+name+"�Դϴ�.");
		sc.close();
	}
	
	public void print() {
		System.out.print("������");super.print();
	}
	

}
