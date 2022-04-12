package pokemon;

public class Pokebox {
	public static Entry start_entry;
	public static Entry rev1_entry;
	public static Entry rev2_entry;
	public static void main(String[] args) {
		//1 ��Ÿ�� ��Ʈ�� ���� ����
		
		//1.1 ��Ÿ�� ��Ʈ�� ����
		start_entry=new Entry();
		
		//1.2 �� ���ϸ� ���� (�⺻�����ڰ� ��Ÿ��)
		Green g_starting=new Green();
		Turtleking t_starting=new Turtleking();
		Lizamon l_starting=new Lizamon();
		//1.3 ���ϸ� �߰�
		start_entry.addPokemon(0, g_starting);
		start_entry.addPokemon(1, t_starting);
		start_entry.addPokemon(2, l_starting);
		System.out.println();
		//1.4 ��Ÿ�� ��Ʈ�� ��� ���ϸ� ���
		start_entry.printAllPokemon();
		System.out.println();
		//1.5 ��Ÿ�� ��Ʈ�� Ư�� index�� �Ҽӵ� ���ϸ� ���� ���
		start_entry.printPokemon(2);
		System.out.println();
		//1.5 �Ȱ��� ���(�����ε�)
		start_entry.printPokemon(g_starting);
		
		//2 ��ȭü ��Ʈ�� ���� ����
		//2.1 ��ȭü ��Ʈ�� ����
		rev1_entry=new Entry("�߰� ��ȭü");
		
		//2.2 �� ���ϸ� ����
		Green g_rev1=new Green("�̻���Ǯ",30,"���ٴ�","�Ⱑ�巹��");
		Turtleking t_rev1=new Turtleking("��Ϻα�",26,"�ĵ�Ÿ��","������");
		Lizamon l_rev1=new Lizamon("���ڵ�",28,"�Ҵ빮��","����");
		//2.3 �ݺ���+���ǹ����� ����ֱ�
		for(int i=0;i<rev1_entry.p_List.length;i++) {
			if(i==0) {
				rev1_entry.addPokemon(i, g_rev1);
			}else if(i==1) {
				rev1_entry.addPokemon(i, t_rev1);
			}else {
				rev1_entry.addPokemon(i, l_rev1);
			}
		}
		System.out.println();
		//2.4 ��� ���ϸ� ���
		rev1_entry.printAllPokemon();
		System.out.println();
		//2.5 ���ϸ� ������� �迭 �� ����ֱ�
		rev1_entry.printPokemon(rev1_entry.p_List[1]);
		System.out.println();
		//���� ��ȭü ��Ʈ�� ���� ����
		//3.1 ���� ��ȭü ��Ʈ�� ����
		rev2_entry=new Entry(3,"���� ��ȭü");
		
		//3.2 �� ���ϸ� ����
		//3.2.1 �Ű����� �⺻ ������Ÿ�� ������
		Green g_rev2=new Green("�̻��ز�",60,"Ǯ, ��",false,true,"�н���ġ","��������","�͵�");
		Turtleking t_rev2=new Turtleking("�źϿ�",90,"��",true,true,"�Դٳ��� ����","���̵������","������");
		//3.2.2 �Ű����� Ŭ���� ������Ÿ�� ������ ����
		//���� ����
		Status st=new Status();
		st.name="���ڸ�"; st.irochi=true; st.level=100; st.type="��, ����";
		//���� ����
		Tool t=new Tool();
		t.had=true; t.name="�������ʴ� �Ҿ�";
		//��ų ����
		Skill s=new Skill();
		s.main="����Ʈ��"; s.sub="�������";
		//Ŭ���� ������Ÿ���� �Ű������� �޴� ������ ���� �Ϸ�
		Lizamon l_rev2=new Lizamon(st,s,t);
		
		for(int i=0;i<rev2_entry.p_List.length;i++) {
			if(i==0) {
				rev2_entry.addPokemon(i, g_rev2);
			}else if(i==2) {
				rev2_entry.addPokemon(i, t_rev2);
			}else {
				rev2_entry.addPokemon(i, l_rev2);
			}
		}
		System.out.println();
		rev2_entry.printAllPokemon();
		System.out.println();
		rev2_entry.printPokemon(1);
		System.out.println();
		rev2_entry.printPokemon(2);
	}

}
