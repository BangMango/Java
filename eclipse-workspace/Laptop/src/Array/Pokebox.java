package Array;

import java.util.ArrayList;

public class Pokebox {

	public static void main(String[] args) {
		Entry et=new Entry();
		ArrayList<Pokemon> pokemonList=new ArrayList();
		//불 포켓몬 추가
		Pokemon red1=new Pokemon();Pokemon red2=new Pokemon();Pokemon red3=new Pokemon();
		//물 포켓몬 추가
		Pokemon blue1=new Pokemon();Pokemon blue2=new Pokemon();Pokemon blue3=new Pokemon();
		//풀 포켓몬 추가
		Pokemon green1=new Pokemon();Pokemon green2=new Pokemon();Pokemon green3=new Pokemon();
		//각 포켓몬 인스턴스 내부 변수들의 값을 지정
		red1.setType("FIRE"); red1.setName("파이리"); red1.setLevel(5);
		red2.setType("FIRE"); red2.setName("리자드"); red2.setLevel(25);
		red3.setType("FIRE"); red3.setName("리자몽"); red3.setLevel(50);
		blue1.setType("WATER"); blue1.setName("꼬부기"); blue1.setLevel(5);
		blue2.setType("WATER"); blue2.setName("어니부기"); blue2.setLevel(25);
		blue3.setType("WATER"); blue3.setName("거북왕"); blue3.setLevel(50);
		green1.setType("LEAF"); green1.setName("이상해씨"); green1.setLevel(5);
		green2.setType("LEAF"); green2.setName("이상해풀"); green2.setLevel(25);
		green3.setType("LEAF"); green3.setName("이상해꽃"); green3.setLevel(50);
		//pokemonList 배열에 Pokemon 인스턴스 삽입
		pokemonList.add(red1);pokemonList.add(blue1);pokemonList.add(green1); pokemonList.add(red2); pokemonList.add(blue2);pokemonList.add(green2);
		pokemonList.add(red3);pokemonList.add(blue3);pokemonList.add(green3);
		//Entry 인스턴스 내부 pokemonList 배열에 pokemonList 대입
		et.setPokemonList(pokemonList);
		//Entry 인스턴스에서 pokemonList의 모든 포켓몬 정보 출력
		et.printPokemonList();
		//pokemonList 내의 모든 포켓몬 세부정보 출력
		for(int i=0;i<pokemonList.size();i++) {
			et.printDetail(i);
		}
		//pokemonList 배열의 모든 풀 타입 포켓몬 삭제
		pokemonList.remove(2);pokemonList.remove(4);pokemonList.remove(6);
		//정상 삭제되었는지 재출력
		et.printPokemonList();
		
	}

}
