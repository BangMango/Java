package virtualGame;

public class VirtualMF {
	public String[] monsterList;
	
	VirtualMF(){}
	
	VirtualMF(String[] monsterList){
		this.monsterList=monsterList;
	}
	
	public void printMonsterInfo(Integer index) {
		System.out.println("*");
		System.out.println(monsterList[index]+"¸¦ È¹µæÇÏ¿´½À´Ï´Ù.");
	}
}
