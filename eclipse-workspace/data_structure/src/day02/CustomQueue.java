package day02;

import java.util.ArrayList;

public class CustomQueue {
	//데이터 유뮤 확인
			private static Boolean isEmpty(ArrayList<Integer> arrayList) {
				if(arrayList.isEmpty()) {
					return true;
				}else {
					return false;
				}
			}
			//enqueue(데이터 삽입)
			private static void enqueue(ArrayList<Integer> arrayList,Integer data) {
				arrayList.add(data);
			}
			//dequeue(데이터 제거)
			private static Boolean dequeue(ArrayList<Integer> arrayList) {
				if(isEmpty(arrayList)) {
					return false;
				}else {
					arrayList.remove(0);
					return true;
				}
			}
			//print(출력)
			private static void printAllData(ArrayList<Integer> arrayList) {
				System.out.println("=================");
				for(int i=0;i<arrayList.size();i++) {
					System.out.println(i+"번째 데이터 ->"+arrayList.get(i));
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
