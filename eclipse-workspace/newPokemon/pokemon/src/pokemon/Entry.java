package pokemon;

public class Entry {
	
	public Pokemon[] pokemonList;
	public String entryName;
	
	Entry(){
		pokemonList = new Pokemon[3];
		this.entryName="��Ÿ��";
		
		System.out.println("�⺻ ��Ʈ�� ���� �Ϸ�");
		System.out.println("==============================");
		System.out.println("��Ʈ���� 3���� ������ �����ƽ��ϴ�.");
		System.out.println();
	}
	
	Entry(String name){
		pokemonList = new Pokemon[3];
		this.entryName = name;
		
		System.out.println(name+" ��Ʈ�� ���� �Ϸ�");
		System.out.println("==============================");
		System.out.println("��Ʈ���� 3���� ������ �����ƽ��ϴ�.");
		System.out.println();
	}
	
	Entry(Integer index, String name ){
		pokemonList = new Pokemon[index];
		this.entryName = name;
		
		System.out.println(name+" ��Ʈ�� ���� �Ϸ�");
		System.out.println("==============================");
		System.out.println("��Ʈ���� "+index+"���� ������ �����ƽ��ϴ�.");
		System.out.println();
	}
	
	public void addPokemon(Integer index, Pokemon pokemon) {
		pokemonList[index] = pokemon;
		System.out.println(entryName+" ��Ʈ���� "+(index+1)+"��° ������ "+pokemon.st.name+"��(��) �����Ǿ����ϴ�.");
	}
	
	//���� ���ϸ� ���� ���
	public void printPokemon(Pokemon pokemon) {
		System.out.println(pokemon.st.name+"�� ����");
		System.out.print(pokemon.st.name+"�� ���� :"+pokemon.st.level+"  ");
		System.out.print(pokemon.st.name+"�� ���� : "+pokemon.t.name+"  ");
		System.out.print(pokemon.st.name+"�� ���ν�ų :"+pokemon.s.main+"  ");
		System.out.print(pokemon.st.name+"�� ���꽺ų : "+pokemon.s.sub+"  ");
	}
	
	//���� ���ϸ� ���� ��� �����ε�
	public void printPokemon(Integer index) {
		System.out.println(pokemonList[index].st.name+"�� ����");
		System.out.print(pokemonList[index].st.name+"�� ���� : "+pokemonList[index].st.level+"  ");
		System.out.print(pokemonList[index].st.name+"�� ���� : "+pokemonList[index].t.name+"  ");
		System.out.print(pokemonList[index].st.name+"�� ���ν�ų : "+pokemonList[index].s.main+"  ");
		System.out.print(pokemonList[index].st.name+"�� ���꽺ų : "+pokemonList[index].s.sub+"  ");	
		
		if(pokemonList[index].st.irochi==true) {
			System.out.println(pokemonList[index].st.name+"�� ���� �ٸ� ����� ���ϸ��Դϴ�.");
		}
	}
	
	public void printAllPokemon() {
		System.out.println(entryName+" ��Ʈ���� ��� ���ϸ�");
	
		//�迭 ����� ���ϰ� �ϴ� for each����
		for(Pokemon i: pokemonList) {
			System.out.println(i.st.name+" Lv."+i.st.level+" ["+i.st.type+"] Ÿ��    ");
		}
	}
	
}
