package practice04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Office office =new Office(3);
		User user1=new User();
		user1.setUserNo(0L);
		user1.setUserType("ÁØÈ¸¿ø");
		user1.setEmail("luffy123@naver.com");
		
		office.addUser(0, user1);
		
	}

}
