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
			return "해당 포켓몬은 불 타입 포켓몬이며, 약점은 물 타입입니다.";
		case "WATER":
			return "해당 포켓몬은 물 타입 포켓몬이며, 약점은 풀 타입입니다.";
		case "LEAF":
			return "해당 포켓몬은 풀 타입 포켓몬이며, 약점은 풀 타입입니다.";
		default :
			return "포켓몬의 타입을 찾을 수 없습니다.";
		}
	}
	public void printPokemonList() {
		System.out.println("===포켓몬 리스트 출력===");
		for(int i=0;i<pokemonList.size();i++) {
			System.out.println("포켓몬 이름 : "+pokemonList.get(i).getName());
		}
		System.out.println("===포켓몬 리스트 종료===");
	}
	public void printDetail(Integer index) {
		System.out.println("==="+pokemonList.get(index).getName()+"의 정보 출력 ===");
		System.out.print(pokemonList.get(index).getName()+" : "+InformType(pokemonList.get(index).getType())+" / ");
		System.out.println(pokemonList.get(index).getName()+" LV : "+pokemonList.get(index).getLevel());
		System.out.println("============================");
		
	}
}
