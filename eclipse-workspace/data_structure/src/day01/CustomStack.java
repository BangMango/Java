package day01;
import java.util.ArrayList;

public class CustomStack {
	
	//stack 데이터 포함 여부 확인
	private static Boolean isEmpty(ArrayList<Integer> list) {
		//
		if(list.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	//stack에 있는 모든 데이터 출력
	private static void printAllData(ArrayList<Integer> list) {
		if(isEmpty(list)) {
			//stack이 비어있을때 로직
			System.out.println("데이터가 존재하지 않습니다.");
		}else {
			//stack이 비어있지 않을때의 로직
			System.out.println();
			for(int i=0; i<list.size();i++) {
				System.out.print(list.get(i)+" ");
			}
		}
	}
	
	//stack으로 데이터 삽입
	private static void pushData(ArrayList<Integer> list, Integer data) {
		list.add(data);
	}
	//stack에서 데이터 꺼내기
	
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
