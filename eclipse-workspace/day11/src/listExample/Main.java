package listExample;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList testList=new ArrayList();
		
		testList.add(11);
		testList.add(22);
		testList.add(33);
		testList.add(44);
		testList.add(55);
		System.out.println("������ ��ȸ");
		for(int i=0;i<testList.size();i++) {
			System.out.println("������ ���� ��ȸ testList : "+testList.get(i));
		}
		System.out.println("=======================");
		//2. �߰��� ������ �߰�
		testList.add(2,808);
		for(int i=0;i<testList.size();i++) {
			System.out.println("������ �߰� ��ȸ testList : "+testList.get(i));
		}
		System.out.println("=======================");
		//3. �߰��� �ߺ� ������ �߰�
		testList.add(3,808);
		for(int i=0;i<testList.size();i++) {
			System.out.println("������ ���� ��ȸ testList : "+testList.get(i));
		}
		//4. ����Ʈ ��ü����
		System.out.println("testList�� ��ü ���̴�? -> "+testList.size());
		System.out.println();
		//5. ������ ����
		testList.remove(2);
		testList.remove(2);
		System.out.println("testList�� ��ü ���̴�? -> "+testList.size());
		
		for(int i=0;i<testList.size();i++) {
			System.out.println("�� ���� �� testList�� �� : "+testList.get(i));
		}
		
		System.out.println();
		System.out.println("testList�� 808�� ���ԵǾ� �ִ��� : "+testList.contains(808));
		
	}
}
