package lifeCoding;

import java.util.Scanner;

public class IntanceExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ID id=new ID();
		System.out.println("당신의 아이디를 입력하시오");
		String id1=sc.nextLine();
		System.out.println("비밀번호를 입력하시오");
		String pw1=sc.nextLine();
		System.out.println("나이를 입력하시오");
		int age1=sc.nextInt();
		sc.nextLine();
		System.out.println("별명을 입력하시오");
		String nickname=sc.nextLine();
		System.out.println("입력을 마쳤다면 완료를 입력하시오");
		String end=sc.nextLine();
		if(end.equals("완료")) {
			sc.close();
			System.out.println("입력이 완료됐습니다.");
			id.setID(id1, pw1, age1, nickname);
			id.printID();
		}else {
			System.out.println("Try it again");
		}
	}

}
