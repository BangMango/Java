package oneDayoneCoding;

import java.util.ArrayList;

public class AccessModifier2 {
	ArrayList<AccessModifier1> am=new ArrayList();
	
	public void setList(ArrayList<AccessModifier1> am) {
		this.am=am;
	}
	private String translateGender(Boolean gender) {
		if(gender==true) {
			return "����";
		}else {
			return "����";
		}
	}
	public void printAllMember() {
		System.out.println("===��� ȸ������ ���===");
		for(int index=0; index<am.size();index++) {
		System.out.println(am.get(index).getName()+" / "+am.get(index).getAge());
		}
		System.out.println("===ȸ������ ��� �Ϸ�===");
	}
	public void printDetail(Integer index) {
		System.out.println("===���� ȸ������ ���===");
		System.out.println("�̸� : "+am.get(index).getName());
		System.out.println("���� : "+am.get(index).getAge());
		System.out.println("�ּ� : "+am.get(index).getAddress());
		System.out.println("���� : "+translateGender(am.get(index).getGender()));
		System.out.println("===���� ȸ������ ��¿Ϸ�===");
	}
}