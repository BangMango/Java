package listQuiz;

import java.util.ArrayList;

public class ListQuiz {

	public static void main(String[] args) {
		ArrayList<String> nameList =new ArrayList();
		nameList.add("소미");
		nameList.add("수미");
		nameList.add("세미");
		nameList.add("똑냥이");
		nameList.add("두치");
		nameList.add("냥아치");
		nameList.add("켓초딩");
		System.out.println("사진사 : 사진 촬영 전 한 줄로 서주세요!");
		System.out.println(nameList);
		System.out.println("찰칵! 찰칵!");
		System.out.println("사진사 : 강아지이신 분은 빠져주세요!");
		nameList.remove(4);
		System.out.println(nameList);
		System.out.println("찰칵! 찰칵!");
		System.out.println("사진사 : 같은 가족끼리 촬영");
		nameList.remove(3);	nameList.remove(3);nameList.remove(3);
		System.out.println(nameList);
		System.out.println("찰칵! 찰칵!");
		System.out.println("사진사 : 수고하셨습니다~");
	}

}
