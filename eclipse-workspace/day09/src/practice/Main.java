package practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User[] users=new User[3];
        // 1.
        User user1 = new User();
        user1.userNo = 0L;
        user1.userType = "��ȸ��";
        user1.email = "luffy123@naver.com";

        // users[0] �ڸ��� user1 �� �־��ݴϴ�.
        users[0] = user1;

        // 2.
        User user2 = new User();
        user2.userNo = 1L;
        user2.userType = "��ȸ��";
        user2.email = "somi123@naver.com";

        // users[1] �ڸ��� user2 �� �־��ݴϴ�.
        users[1] = user2;

        // 3.
        User user3 = new User();
        user3.userNo = 2L;
        user3.userType = "��ȸ��";
        user3.email = "semi123@naver.com";

        // users[2] �ڸ��� user3 �� �־��ݴϴ�.
        users[2] = user3;

        // ���� ���
        for(Integer i = 0; i < users.length; i++) {
            System.out.println();
            System.out.println("user ��ȣ : " + users[i].userNo);
            System.out.println("user �̸� : " + users[i].userType);
            System.out.println("user ���� : " + users[i].email);
            System.out.println();
        }
    
	}

}
