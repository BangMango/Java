package day02;

import java.util.ArrayList;

public class CustomQueue {
	//������ ���� Ȯ��
			private static Boolean isEmpty(ArrayList<Integer> arrayList) {
				if(arrayList.isEmpty()) {
					return true;
				}else {
					return false;
				}
			}
			//enqueue(������ ����)
			private static void enqueue(ArrayList<Integer> arrayList,Integer data) {
				arrayList.add(data);
			}
			//dequeue(������ ����)
			private static Boolean dequeue(ArrayList<Integer> arrayList) {
				if(isEmpty(arrayList)) {
					return false;
				}else {
					arrayList.remove(0);
					return true;
				}
			}
			//print(���)
			private static void printAllData(ArrayList<Integer> arrayList) {
				System.out.println("=================");
				for(int i=0;i<arrayList.size();i++) {
					System.out.println(i+"��° ������ ->"+arrayList.get(i));
				}
				System.out.println("=================");
			}
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<>();
		enqueue(arrayList,3);
		enqueue(arrayList,5);
		enqueue(arrayList,66);
		enqueue(arrayList,100);
		printAllData(arrayList);
		dequeue(arrayList);
		printAllData(arrayList);
	}

}