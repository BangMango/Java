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
		System.out.println("환영합니다. "+this.nickname+"님, 정보를 출력합니다.");
		System.out.println(nickname+"님의 아이디 :"+this.id);
		System.out.println(nickname+"님의 비밀번호 :"+this.pw);
		System.out.println(nickname+"님의 나이 :"+this.age);
	}
}
