package instanceOfExample;

public class CatMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat=new Cat();
		Somi somi=new Somi();
		
		System.out.println(cat instanceof Cat); //cat ������ Cat Ŭ������ �ν��Ͻ��� �´���
		System.out.println(somi instanceof Cat);//somi ������ Cat Ŭ������ �ν��Ͻ��� �´���
		System.out.println(cat instanceof Somi);// cat ������ Somi Ŭ������ �ν��Ͻ��� �´���
		System.out.println(somi instanceof Somi);// somi������ Somi Ŭ������ �ν��Ͻ��� �´���
	}

}
