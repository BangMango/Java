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
		am1.setName("박재현");am1.setAge(23);am1.setAddress("경기도 부천시");am1.setGender(true);
		am2.setName("이선주");am2.setAge(20);am2.setAddress("인천특별시");am2.setGender(false);
		am3.setName("짱구");am3.setAge(5);am3.setAddress("떡잎마을");am3.setGender(true);
		am4.setName("기영이");am4.setAge(13);am4.setAddress("쌍문동");am4.setGender(true);
		amList.add(am1);
		amList.add(am2);
		amList.add(am3);
		amList.add(am4);
		am.setList(amList);
		am.printAllMember();
		for(int index=0; index<amList.size();index++) {
			am.printDetail(index);
		}
		//폐지된 기영이 삭제
		amList.remove(3);
		am.printAllMember();
	}

}
