package listBasicExample;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList catNameList=new ArrayList();
		catNameList.add("�ҹ�");
		catNameList.add("����");
		catNameList.add("����");
		
		//length�� �ٸ� size()�� ���
		System.out.println(catNameList);
		for(int i=0;i<catNameList.size();i++) {
			//catNameList.get(0);
			//catNameList.get(1);
			System.out.println(catNameList.get(i));
		}
		
		System.out.println("====================");
		
		ArrayList dogNameList=new ArrayList();
		dogNameList.add("��ġ");
		dogNameList.add("�Ѳ�");
		dogNameList.add("����");
		dogNameList.add("�����");
		
		System.out.println(dogNameList);
		for(int i=0;i<dogNameList.size();i++) {
			System.out.println(dogNameList.get(i));
		}
		System.out.println("===================");
		dogNameList.remove(1);
		System.out.println(dogNameList);
		for(int i=0;i<dogNameList.size();i++) {
			System.out.println(dogNameList.get(i));
		}
	}

}
