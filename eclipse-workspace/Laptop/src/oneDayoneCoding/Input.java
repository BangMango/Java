package oneDayoneCoding;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("앵무새 : 무슨 말이 하고싶어? 멈추고싶으면 그만을 외쳐");
		String input1 = "";
		while(!(input1.equals("그만"))) {
		input1=sc.nextLine();
		System.out.println("앵무새 : "+input1);
		}
		sc.close();
		System.out.println("앵무새 : 이제 그만할게");
		

	}

}
