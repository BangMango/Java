package practice04;

public class Office {
	User[] users;
	
	Office(Integer userCnt){
		//userCnt 개의 공간을 만들어준다
		users=new User[userCnt];
	}
	
	public void addUser(Integer userIndex, User user) {
		users[userIndex]=user;
	}
	
	public void printUser(User user) {
        System.out.println();
        System.out.print("*");
        System.out.println("userNo : " + user.userNo);
        System.out.println("userType : " + user.userType);
        System.out.println("userType : " + user.email);
        System.out.println();
    }
	
	public void printAllUsers() {
        if(users.length != 0) {
            for(Integer i = 0; i < users.length; i++) {
                System.out.print("*");
                System.out.println("userNo : " + users[i].userNo);
                System.out.println("userType : " + users[i].userType);
                System.out.println("userType : " + users[i].email);
                System.out.println();
            }
        } else {
            System.out.println("아무런 데이터가 없습니다.");
        }
    }
}
