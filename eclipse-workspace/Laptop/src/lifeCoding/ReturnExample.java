package lifeCoding;

public class ReturnExample {
	
	public static String[] getMembers() {
		String[] members= {"������","������","���̶�"};
		return members;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] members=getMembers();
		for(int i=0; i<3;i++) {
		System.out.println(members[i]);
		}
	}

}
