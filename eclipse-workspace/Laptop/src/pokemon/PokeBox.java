package pokemon;

public class PokeBox {
	public static Entry entry;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evee evee=new Evee();
		Chigoma chigoma=new Chigoma();
		
		
		String name="��ī��";
		String type="����";
		Skill volttackle=new Skill("����","��Ʈ��Ŭ",10);
		Skill spark=new Skill("����","����ũ",20);
		Skill flash=new Skill("�븻","�÷���",40);
		Skill ironTail=new Skill("��ö","���̾�����",15);
		Status stt=new Status("ҳ",45,120);
		NewPokemon pikachu=new NewPokemon(name,type,volttackle,spark,flash,ironTail,stt);
		
		
		entry=new Entry(3);
		entry.addPokemon(0, chigoma);
		entry.addPokemon(1, evee);
		entry.addPokemon(2, pikachu);
		entry.printAllPokemon();
		for(int i=0;i<entry.entryList.length;i++) {
			System.out.println(i+1+"��");
			entry.printPokemon(entry.returnPokemon(i));
		}
		
	}

}
