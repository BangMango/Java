package pokemon;

public class Entry {
	public Pokemon[] p_List;
	public String entry_Name;
	
	Entry(){
		p_List=new Pokemon[3];
		this.entry_Name="��Ÿ��";
		System.out.println("�⺻ ��Ʈ�� ���� �Ϸ�");
		System.out.println("==============================");
		System.out.println("��Ʈ���� 3���� ������ �����ƽ��ϴ�.");
		System.out.println();
	}
	Entry(String name){
		this.entry_Name=name;
		p_List=new Pokemon[3];
		System.out.println(name+" ��Ʈ�� ���� �Ϸ�");
		System.out.println("==============================");
		System.out.println("��Ʈ���� 3���� ������ �����ƽ��ϴ�.");
		System.out.println();
	}
	
	Entry(Integer index, String name ){
		this.entry_Name=name;
		p_List=new Pokemon[index];
		System.out.println(name+" ��Ʈ�� ���� �Ϸ�");
		System.out.println("==============================");
		System.out.println("��Ʈ���� "+index+"���� ������ �����ƽ��ϴ�.");
		System.out.println();
	}
	
	public void addPokemon(Integer index, Pokemon p) {
		p_List[index]=p;
		System.out.println(entry_Name+" ��Ʈ���� "+(index+1)+"��° ������ "+p.st.name+"��(��) �����Ǿ����ϴ�.");
	}
	//���� ���ϸ� ���� ���
	public void printPokemon(Pokemon p) {
		System.out.println(p.st.name+"�� ����");
		System.out.print(p.st.name+"�� ���� :"+p.st.level+"  ");
		System.out.print(p.st.name+"�� ���� : "+p.t.name+"  ");
		System.out.print(p.st.name+"�� ���ν�ų :"+p.s.main+"  ");
		System.out.print(p.st.name+"�� ���꽺ų : "+p.s.sub+"  ");
	}
	//���� ���ϸ� ���� ��� �����ε�
	public void printPokemon(Integer index) {
		System.out.println(p_List[index].st.name+"�� ����");
		System.out.print(p_List[index].st.name+"�� ���� : "+p_List[index].st.level+"  ");
		System.out.print(p_List[index].st.name+"�� ���� : "+p_List[index].t.name+"  ");
		System.out.print(p_List[index].st.name+"�� ���ν�ų : "+p_List[index].s.main+"  ");
		System.out.print(p_List[index].st.name+"�� ���꽺ų : "+p_List[index].s.sub+"  ");	
		if(p_List[index].st.irochi==true) {
			System.out.println(p_List[index].st.name+"�� ���� �ٸ� ����� ���ϸ��Դϴ�.");
		}
	}
	public void printAllPokemon() {
		System.out.println(entry_Name+" ��Ʈ���� ��� ���ϸ�");
		//for���� �⺻ ����
		/*for(int i=0; i<p_List.length;i++) {
			System.out.print(p_List[i].st.name+" ("+p_List[i].st.level+") ["+p_List[i].st.type+"]");
			System.out.println();
		}*/
		//�迭 ����� ���ϰ� �ϴ� for each����
		for(Pokemon i:p_List) {
			System.out.println(i.st.name+" Lv."+i.st.level+" ["+i.st.type+"] Ÿ��    ");
		}
	}
	
}
