package publicLibrary;

public class BookShelf {
	public Book [] bookList; //Integer [] array; String [] array
	public String color="BLUE";
	//생성사
	
	//default 생성자
	BookShelf(){
		bookList=new Book[10];
		System.out.println("책의 개수가 기본 개수인 10개로 지정되었습니다.");
		System.out.println("매개변수로 책의 개수가 넘어오지 않았습니다.");
	}
	//개수만 지정
	BookShelf(Integer bookCnt){
		bookList=new Book[bookCnt];
		color="BLUE";
	}
	//개수 + 색 지정
	BookShelf(Integer bookCnt,String color){
		bookList=new Book[bookCnt];
		this.color=color;
	}
	
	public void addBook(Integer bookIndex, Book book) {
		//bookList ~번째에 있는 데이터를 book으로 세팅
		bookList[bookIndex]=book;
	}
	//책 개별정보 출력 메소드
	public void printBook(Book book) {
		System.out.println("*");
		System.out.println(book.bookName+" 만화책 정보");
		System.out.println("책 표지 색상 : "+book.bookCover.color);
		System.out.println("책 표지 종류 : "+book.bookCover.type);
		System.out.println("종이 타입 : "+ book.paper.type);
		System.out.println("작가 이름 : "+book.authorName);
		System.out.println();
	}
	//책 모든정보 출력 메소드
	public void printAllBook() {
		System.out.println("");
		System.out.println("=======================책장조회==========================");
		System.out.println();
		
		for(int i=0; i<bookList.length; i++) {
			System.out.println(i+1+"번째 책 제목 : "+bookList[i].bookName);
		}
		System.out.println();
		System.out.println("===================================");
		System.out.println();
	}
	
	
}
