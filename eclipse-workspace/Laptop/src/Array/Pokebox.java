package Array;

import java.util.ArrayList;

public class Pokebox {

	public static void main(String[] args) {
		Entry et=new Entry();
		ArrayList<Pokemon> pokemonList=new ArrayList();
		//�� ���ϸ� �߰�
		Pokemon red1=new Pokemon();Pokemon red2=new Pokemon();Pokemon red3=new Pokemon();
		//�� ���ϸ� �߰�
		Pokemon blue1=new Pokemon();Pokemon blue2=new Pokemon();Pokemon blue3=new Pokemon();
		//Ǯ ���ϸ� �߰�
		Pokemon green1=new Pokemon();Pokemon green2=new Pokemon();Pokemon green3=new Pokemon();
		//�� ���ϸ� �ν��Ͻ� ���� �������� ���� ����
		red1.setType("FIRE"); red1.setName("���̸�"); red1.setLevel(5);
		red2.setType("FIRE"); red2.setName("���ڵ�"); red2.setLevel(25);
		red3.setType("FIRE"); red3.setName("���ڸ�"); red3.setLevel(50);
		blue1.setType("WATER"); blue1.setName("���α�"); blue1.setLevel(5);
		blue2.setType("WATER"); blue2.setName("��Ϻα�"); blue2.setLevel(25);
		blue3.setType("WATER"); blue3.setName("�źϿ�"); blue3.setLevel(50);
		green1.setType("LEAF"); green1.setName("�̻��ؾ�"); green1.setLevel(5);
		green2.setType("LEAF"); green2.setName("�̻���Ǯ"); green2.setLevel(25);
		green3.setType("LEAF"); green3.setName("�̻��ز�"); green3.setLevel(50);
		//pokemonList �迭�� Pokemon �ν��Ͻ� ����
		pokemonList.add(red1);pokemonList.add(blue1);pokemonList.add(green1); pokemonList.add(red2); pokemonList.add(blue2);pokemonList.add(green2);
		pokemonList.add(red3);pokemonList.add(blue3);pokemonList.add(green3);
		//Entry �ν��Ͻ� ���� pokemonList �迭�� pokemonList ����
		et.setPokemonList(pokemonList);
		//Entry �ν��Ͻ����� pokemonList�� ��� ���ϸ� ���� ���
		et.printPokemonList();
		//pokemonList ���� ��� ���ϸ� �������� ���
		for(int i=0;i<pokemonList.size();i++) {
			et.printDetail(i);
		}
		//pokemonList �迭�� ��� Ǯ Ÿ�� ���ϸ� ����
		pokemonList.remove(2);pokemonList.remove(4);pokemonList.remove(6);
		//���� �����Ǿ����� �����
		et.printPokemonList();
		
	}

}