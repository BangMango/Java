package pokemon;

public class Entry {
	public Pokemon [] entryList;
	public String name;
	Entry(){
		entryList=new Pokemon[6];
		name="�⺻ ��Ʈ��";
		System.out.println("��Ʈ���� �̸��� "+name+"�Դϴ�.");
	}
	Entry(Integer num){
		entryList=new Pokemon[num];
	}
	//��Ʈ���� ���ϸ� �߰�
	public void addPokemon(Integer entryindex,Pokemon pokemon) {
		entryList[entryindex]=pokemon;
	}
	//���ϸ� �������� ���
	public void printPokemon(Pokemon pokemon) {
		System.out.println("���ϸ� �̸� : "+pokemon.name);
		System.out.println("���ϸ� Ÿ�� : "+pokemon.type);
		System.out.println("���ϸ� ���� : "+pokemon.status.level);
		System.out.println("===========================");
		System.out.println("���ϸ� ���1 : "+pokemon.skill1.name);
		System.out.println("���ϸ� ���1 Ÿ�� : "+pokemon.skill1.type);
		System.out.println("���ϸ� ���1 pp : "+pokemon.skill1.pp);
		System.out.println("===========================");
		System.out.println("���ϸ� ���2 : "+pokemon.skill2.name);
		System.out.println("���ϸ� ���2 Ÿ�� : "+pokemon.skill2.type);
		System.out.println("���ϸ� ���2 pp : "+pokemon.skill2.pp);
		System.out.println("===========================");
		System.out.println("���ϸ� ���3 : "+pokemon.skill3.name);
		System.out.println("���ϸ� ���3 Ÿ�� : "+pokemon.skill3.type);
		System.out.println("���ϸ� ���3 pp : "+pokemon.skill3.pp);
		System.out.println("===========================");
		System.out.println("���ϸ� ���4 : "+pokemon.skill4.name);
		System.out.println("���ϸ� ���4 Ÿ�� : "+pokemon.skill4.type);
		System.out.println("���ϸ� ���4 pp : "+pokemon.skill4.pp);
		System.out.println();
		System.out.println();
	}
	//��Ʈ���� �ִ� ��� ���ϸ� �̸�,���� ���
	public void printAllPokemon() {
		for(int i=0;i<entryList.length;i++) {
			System.out.println(i+1+"��° ���ϸ� �̸� : "+entryList[i].name);
			System.out.println(i+1+"��° ���ϸ� ���� : "+entryList[i].status.level);
			System.out.println();
		}
	}
	
	public Pokemon returnPokemon(Integer index) {
	return	entryList[index];
	}
}
