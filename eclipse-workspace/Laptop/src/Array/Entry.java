package Array;

import java.util.ArrayList;

public class Entry {
	private ArrayList<Pokemon> pokemonList= new ArrayList();
	
	public void setPokemonList(ArrayList<Pokemon> pokemonList) {
		this.pokemonList=pokemonList;
	}
	
	private String InformType(String type) {
		switch(type) {
		case "FIRE":
			return "�ش� ���ϸ��� �� Ÿ�� ���ϸ��̸�, ������ �� Ÿ���Դϴ�.";
		case "WATER":
			return "�ش� ���ϸ��� �� Ÿ�� ���ϸ��̸�, ������ Ǯ Ÿ���Դϴ�.";
		case "LEAF":
			return "�ش� ���ϸ��� Ǯ Ÿ�� ���ϸ��̸�, ������ Ǯ Ÿ���Դϴ�.";
		default :
			return "���ϸ��� Ÿ���� ã�� �� �����ϴ�.";
		}
	}
	public void printPokemonList() {
		System.out.println("===���ϸ� ����Ʈ ���===");
		for(int i=0;i<pokemonList.size();i++) {
			System.out.println("���ϸ� �̸� : "+pokemonList.get(i).getName());
		}
		System.out.println("===���ϸ� ����Ʈ ����===");
	}
	public void printDetail(Integer index) {
		System.out.println("==="+pokemonList.get(index).getName()+"�� ���� ��� ===");
		System.out.print(pokemonList.get(index).getName()+" : "+InformType(pokemonList.get(index).getType())+" / ");
		System.out.println(pokemonList.get(index).getName()+" LV : "+pokemonList.get(index).getLevel());
		System.out.println("============================");
		
	}
}