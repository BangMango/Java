package oneDayoneCoding;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�޹��� : ���� ���� �ϰ��;�? ���߰������� �׸��� ����");
		String input1 = "";
		while(!(input1.equals("�׸�"))) {
		input1=sc.nextLine();
		System.out.println("�޹��� : "+input1);
		}
		sc.close();
		System.out.println("�޹��� : ���� �׸��Ұ�");
		

	}

}