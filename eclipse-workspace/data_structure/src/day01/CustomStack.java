package day01;
import java.util.ArrayList;

public class CustomStack {
	
	//stack ������ ���� ���� Ȯ��
	private static Boolean isEmpty(ArrayList<Integer> list) {
		//
		if(list.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	//stack�� �ִ� ��� ������ ���
	private static void printAllData(ArrayList<Integer> list) {
		if(isEmpty(list)) {
			//stack�� ��������� ����
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
		}else {
			//stack�� ������� �������� ����
			System.out.println();
			for(int i=0; i<list.size();i++) {
				System.out.print(list.get(i)+" ");
			}
		}
	}
	
	//stack���� ������ ����
	private static void pushData(ArrayList<Integer> list, Integer data) {
		list.add(data);
	}
	//stack���� ������ ������
	
	private static Integer popData(ArrayList<Integer> list) {
		if(isEmpty(list)) {
			return null;
		}
		
		return list.remove(list.size()-1);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> testDataList = new ArrayList();
		pushData(testDataList,1);
		pushData(testDataList,3);
		pushData(testDataList,4);
		pushData(testDataList,10);
		
		printAllData(testDataList);
		
		popData(testDataList);
		
		printAllData(testDataList);
	}
}
