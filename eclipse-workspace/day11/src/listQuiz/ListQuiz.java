package listQuiz;

import java.util.ArrayList;

public class ListQuiz {

	public static void main(String[] args) {
		ArrayList<String> nameList =new ArrayList();
		nameList.add("�ҹ�");
		nameList.add("����");
		nameList.add("����");
		nameList.add("�ȳ���");
		nameList.add("��ġ");
		nameList.add("�ɾ�ġ");
		nameList.add("���ʵ�");
		System.out.println("������ : ���� �Կ� �� �� �ٷ� ���ּ���!");
		System.out.println(nameList);
		System.out.println("��Ĭ! ��Ĭ!");
		System.out.println("������ : �������̽� ���� �����ּ���!");
		nameList.remove(4);
		System.out.println(nameList);
		System.out.println("��Ĭ! ��Ĭ!");
		System.out.println("������ : ���� �������� �Կ�");
		nameList.remove(3);	nameList.remove(3);nameList.remove(3);
		System.out.println(nameList);
		System.out.println("��Ĭ! ��Ĭ!");
		System.out.println("������ : �����ϼ̽��ϴ�~");
	}

}
