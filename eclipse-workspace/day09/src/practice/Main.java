package practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User[] users=new User[3];
        // 1.
        User user1 = new User();
        user1.userNo = 0L;
        user1.userType = "준회원";
        user1.email = "luffy123@naver.com";

        // users[0] 자리에 user1 을 넣어줍니다.
        users[0] = user1;

        // 2.
        User user2 = new User();
        user2.userNo = 1L;
        user2.userType = "정회원";
        user2.email = "somi123@naver.com";

        // users[1] 자리에 user2 을 넣어줍니다.
        users[1] = user2;

        // 3.
        User user3 = new User();
        user3.userNo = 2L;
        user3.userType = "정회원";
        user3.email = "semi123@naver.com";

        // users[2] 자리에 user3 을 넣어줍니다.
        users[2] = user3;

        // 전부 출력
        for(Integer i = 0; i < users.length; i++) {
            System.out.println();
            System.out.println("user 번호 : " + users[i].userNo);
            System.out.println("user 이름 : " + users[i].userType);
            System.out.println("user 설명 : " + users[i].email);
            System.out.println();
        }
    
	}

}
