package oneDayoneCoding;

import java.util.ArrayList;

public class AccessModifierMain {

	public static void main(String[] args) {
		AccessModifier2 am=new AccessModifier2();
		ArrayList<AccessModifier1> amList=new ArrayList();
		AccessModifier1 am1=new AccessModifier1();
		AccessModifier1 am2=new AccessModifier1();
		AccessModifier1 am3=new AccessModifier1();
		AccessModifier1 am4=new AccessModifier1();
		am1.setName("������");am1.setAge(23);am1.setAddress("��⵵ ��õ��");am1.setGender(true);
		am2.setName("�̼���");am2.setAge(20);am2.setAddress("��õƯ����");am2.setGender(false);
		am3.setName("¯��");am3.setAge(5);am3.setAddress("���ٸ���");am3.setGender(true);
		am4.setName("�⿵��");am4.setAge(13);am4.setAddress("�ֹ���");am4.setGender(true);
		amList.add(am1);
		amList.add(am2);
		amList.add(am3);
		amList.add(am4);
		am.setList(amList);
		am.printAllMember();
		for(int index=0; index<amList.size();index++) {
			am.printDetail(index);
		}
		//������ �⿵�� ����
		amList.remove(3);
		am.printAllMember();
	}

}