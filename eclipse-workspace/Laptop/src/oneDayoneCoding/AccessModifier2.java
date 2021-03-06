package oneDayoneCoding;

import java.util.ArrayList;

public class AccessModifier2 {
	ArrayList<AccessModifier1> am=new ArrayList();
	
	public void setList(ArrayList<AccessModifier1> am) {
		this.am=am;
	}
	private String translateGender(Boolean gender) {
		if(gender==true) {
			return "남성";
		}else {
			return "여성";
		}
	}
	public void printAllMember() {
		System.out.println("===모든 회원정보 출력===");
		for(int index=0; index<am.size();index++) {
		System.out.println(am.get(index).getName()+" / "+am.get(index).getAge());
		}
		System.out.println("===회원정보 출력 완료===");
	}
	public void printDetail(Integer index) {
		System.out.println("===세부 회원정보 출력===");
		System.out.println("이름 : "+am.get(index).getName());
		System.out.println("나이 : "+am.get(index).getAge());
		System.out.println("주소 : "+am.get(index).getAddress());
		System.out.println("성별 : "+translateGender(am.get(index).getGender()));
		System.out.println("===세부 회원정보 출력완료===");
	}
}
