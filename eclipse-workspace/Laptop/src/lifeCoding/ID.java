package lifeCoding;

public class ID {
	public String id;
	public String pw;
	public int age;
	public String nickname;
	
	public void setID(String id, String pw, int age, String nickname) {
		this.id=id; 
		this.pw=pw; 
		this.age=age; 
		this.nickname=nickname;
	}
	
	public void printID() {
		System.out.println("ȯ���մϴ�. "+this.nickname+"��, ������ ����մϴ�.");
		System.out.println(nickname+"���� ���̵� :"+this.id);
		System.out.println(nickname+"���� ��й�ȣ :"+this.pw);
		System.out.println(nickname+"���� ���� :"+this.age);
	}
}
