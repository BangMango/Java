package pokemon;

public class PokeBox {
	public static Entry entry;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evee evee=new Evee();
		Chigoma chigoma=new Chigoma();
		
		
		String name="피카츄";
		String type="전기";
		Skill volttackle=new Skill("전기","볼트태클",10);
		Skill spark=new Skill("전기","스파크",20);
		Skill flash=new Skill("노말","플래쉬",40);
		Skill ironTail=new Skill("강철","아이언테일",15);
		Status stt=new Status("女",45,120);
		NewPokemon pikachu=new NewPokemon(name,type,volttackle,spark,flash,ironTail,stt);
		
		
		entry=new Entry(3);
		entry.addPokemon(0, chigoma);
		entry.addPokemon(1, evee);
		entry.addPokemon(2, pikachu);
		entry.printAllPokemon();
		for(int i=0;i<entry.entryList.length;i++) {
			System.out.println(i+1+"번");
			entry.printPokemon(entry.returnPokemon(i));
		}
		
	}

}
