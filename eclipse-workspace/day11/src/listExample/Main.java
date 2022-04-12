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
		System.out.println("데이터 조회");
		for(int i=0;i<testList.size();i++) {
			System.out.println("데이터 최초 조회 testList : "+testList.get(i));
		}
		System.out.println("=======================");
		//2. 중간에 데이터 추가
		testList.add(2,808);
		for(int i=0;i<testList.size();i++) {
			System.out.println("데이터 중간 조회 testList : "+testList.get(i));
		}
		System.out.println("=======================");
		//3. 중간에 중복 데이터 추가
		testList.add(3,808);
		for(int i=0;i<testList.size();i++) {
			System.out.println("데이터 최종 조회 testList : "+testList.get(i));
		}
		//4. 리스트 전체길이
		System.out.println("testList의 건체 길이는? -> "+testList.size());
		System.out.println();
		//5. 데이터 삭제
		testList.remove(2);
		testList.remove(2);
		System.out.println("testList의 건체 길이는? -> "+testList.size());
		
		for(int i=0;i<testList.size();i++) {
			System.out.println("값 삭제 뒤 testList의 값 : "+testList.get(i));
		}
		
		System.out.println();
		System.out.println("testList에 808이 포함되어 있는지 : "+testList.contains(808));
		
	}
}
