package pokemon;

public class Pokebox {
	
	// ���� ��Ÿ�� entry
	public static Entry startEntry;
	
	// �߰� ��ȭ entry
	public static Entry revMiddleEntry;
	
	// ���� ��ȭ entry
	public static Entry revFinalEntry;
	
	private static void circuitEntryForDataSet(Entry entry, Pokemon[] pokemonList) {
		for(int i=0; i < entry.pokemonList.length; i++) {
			
			if(i==0) {
				
				entry.addPokemon(i, pokemonList[0]);
			}else if(i==1) {
				
				entry.addPokemon(i, pokemonList[1]);
			}else {
				
				entry.addPokemon(i, pokemonList[2]);
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		//1 ��Ÿ�� ��Ʈ�� ���� ����
		
		//1.1 ��Ÿ�� ��Ʈ�� ����
		startEntry = new Entry();
		
		//1.2 �� ���ϸ� ����
		// �⺻�����ڰ� ��Ÿ��
		StrangeFlower strangeSeed = new StrangeFlower();
		Turtleking tutleBaby = new Turtleking();
		Lizamon paelee = new Lizamon();
		
		//1.3 ���ϸ� �߰�
		// ��Ʈ���� ���� ��Ÿ�� ���ϸ� �߰�
		startEntry.addPokemon(0, strangeSeed);
		startEntry.addPokemon(1, tutleBaby);
		startEntry.addPokemon(2, paelee);
		System.out.println();
		
		//1.4 �� ��, ��Ÿ�� ��Ʈ���� ��� ���ϸ� ���� ���
		startEntry.printAllPokemon();
		System.out.println();
		
		//1.5 ��Ÿ�� ��Ʈ�� Ư�� index�� �Ҽӵ� ���ϸ� ���� ���
		// - ���̸��� ���� ���(�Ʒ��� �Ȱ��� ������ �ι� ��µǹǷ� �ּ�ó�� �Ͽ����ϴ�.)
		// startEntry.printPokemon(2);
		// System.out.println();
		
		//1.5 �Ȱ��� ���(�����ε�)
		// - �Ű������� �ٸ����Ͽ�(�����ε�) ���ϸ��� ���� ���
		System.out.println("Ư�� ���ϸ� ���� ���");
		startEntry.printPokemon(paelee);
		System.out.println();
		System.out.println("===========================");
		System.out.println();
		System.out.println();
		System.out.println();
		
		//2 ��ȭü ��Ʈ�� ���� ����
		//2.1 ��ȭü ��Ʈ�� ����
		revMiddleEntry = new Entry("�߰� ��ȭü");
		
		//2.2 �� ���ϸ� ����
		StrangeFlower strangeGrass = new StrangeFlower("�̻���Ǯ",30,"���ٴ�","�Ⱑ�巹��");
		Turtleking tutlePuberty = new Turtleking("��Ϻα�",26,"�ĵ�Ÿ��","������");
		Lizamon lizard = new Lizamon("���ڵ�",28,"�Ҵ빮��","����");
		
		//2.3 �߰� ��ȭü entry data setting �ϱ�
		Pokemon[] middleEntryPokemonList = new Pokemon[3];
		middleEntryPokemonList[0] = strangeGrass;
		middleEntryPokemonList[1] = tutlePuberty;
		middleEntryPokemonList[2] = lizard;
		circuitEntryForDataSet(revMiddleEntry, middleEntryPokemonList);
		
		//2.4 ��� ���ϸ� ���
		revMiddleEntry.printAllPokemon();
		System.out.println();
		
		//2.5 ���ϸ� ������� �迭 �� ����ֱ�
		revMiddleEntry.printPokemon(revMiddleEntry.pokemonList[1]);
		System.out.println();
		System.out.println("===========================");
		System.out.println();
		System.out.println();
		System.out.println();
		
		//���� ��ȭü ��Ʈ�� ���� ����
		//3.1 ���� ��ȭü ��Ʈ�� ����
		revFinalEntry = new Entry(3,"���� ��ȭü");
		
		//3.2 �� ���ϸ� ����
		
		//3.2.1 �Ű����� �⺻ ������Ÿ�� ������
		StrangeFlower strangeFlower =new StrangeFlower("�̻��ز�",60,"Ǯ, ��",false,true,"�н���ġ","��������","�͵�");
		Turtleking turtleKing = new Turtleking("�źϿ�",90,"��",true,true,"�Դٳ��� ����","���̵������","������");
		
		//3.2.2 �Ű����� Ŭ���� ������Ÿ�� ������ ����
		// (���ڸ��� ��� Ư���ϰ� status�� tool �׸��� skill ����)
		//���� ����
		Status status = new Status();
		status.name = "���ڸ�";
		status.irochi = true;
		status.level = 100;
		status.type = "��, ����";
		
		//��ų ����
		Skill skill =new Skill();
		skill.main = "����Ʈ��";
		skill.sub = "�������";
		
		//���� ����
		Tool tool = new Tool();
		tool.had = true;
		tool.name ="�������ʴ� �Ҿ�";
		
		//Ŭ���� ������Ÿ���� �Ű������� �޴� ������ ���� �Ϸ�
		Lizamon lizamon = new Lizamon(status, skill, tool);
		
		// ���� ��ȭü entry data setting �ϱ�
		Pokemon[] finalEntryPokemonList = new Pokemon[3];
		finalEntryPokemonList[0] = strangeFlower;
		finalEntryPokemonList[1] = turtleKing;
		finalEntryPokemonList[2] = lizamon;
		circuitEntryForDataSet(revFinalEntry, finalEntryPokemonList);
		
		revFinalEntry.printAllPokemon();
		System.out.println();
		
		revFinalEntry.printPokemon(1);
		System.out.println();
		
		revFinalEntry.printPokemon(2);
	}
}
