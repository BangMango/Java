package lifeCoding;

import java.util.Scanner;

public class IntanceExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ID id=new ID();
		System.out.println("����� ���̵� �Է��Ͻÿ�");
		String id1=sc.nextLine();
		System.out.println("��й�ȣ�� �Է��Ͻÿ�");
		String pw1=sc.nextLine();
		System.out.println("���̸� �Է��Ͻÿ�");
		int age1=sc.nextInt();
		sc.nextLine();
		System.out.println("������ �Է��Ͻÿ�");
		String nickname=sc.nextLine();
		System.out.println("�Է��� ���ƴٸ� �ϷḦ �Է��Ͻÿ�");
		String end=sc.nextLine();
		if(end.equals("�Ϸ�")) {
			sc.close();
			System.out.println("�Է��� �Ϸ�ƽ��ϴ�.");
			id.setID(id1, pw1, age1, nickname);
			id.printID();
		}else {
			System.out.println("Try it again");
		}
	}

}
