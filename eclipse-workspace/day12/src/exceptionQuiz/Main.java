package exceptionQuiz;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList  dogsNameList=new ArrayList();
		dogsNameList.add("??ġ");
		dogsNameList.add("??????");
		dogsNameList.add("??ĥ??");
		dogsNameList.add("????");
		System.out.println("?Ѳ? : ?????? ????");
		try {
		for(int i=0; i<dogsNameList.size();i++) {
			System.out.println(dogsNameList.get(i)+": "+(i+1)+"!");
			if(dogsNameList.get(i).equals("??ĥ??")) {
				throw new Exception();
			}
		}
		}catch(Exception exception) {
			System.out.println("?Ѳ? : ?? ??????!");
		}

	}

}
