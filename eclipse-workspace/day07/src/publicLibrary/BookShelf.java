package publicLibrary;

public class BookShelf {
	public Book [] bookList; //Integer [] array; String [] array
	public String color="BLUE";
	//������
	
	//default ������
	BookShelf(){
		bookList=new Book[10];
		System.out.println("å�� ������ �⺻ ������ 10���� �����Ǿ����ϴ�.");
		System.out.println("�Ű������� å�� ������ �Ѿ���� �ʾҽ��ϴ�.");
	}
	//������ ����
	BookShelf(Integer bookCnt){
		bookList=new Book[bookCnt];
		color="BLUE";
	}
	//���� + �� ����
	BookShelf(Integer bookCnt,String color){
		bookList=new Book[bookCnt];
		this.color=color;
	}
	
	public void addBook(Integer bookIndex, Book book) {
		//bookList ~��°�� �ִ� �����͸� book���� ����
		bookList[bookIndex]=book;
	}
	//å �������� ��� �޼ҵ�
	public void printBook(Book book) {
		System.out.println("*");
		System.out.println(book.bookName+" ��ȭå ����");
		System.out.println("å ǥ�� ���� : "+book.bookCover.color);
		System.out.println("å ǥ�� ���� : "+book.bookCover.type);
		System.out.println("���� Ÿ�� : "+ book.paper.type);
		System.out.println("�۰� �̸� : "+book.authorName);
		System.out.println();
	}
	//å ������� ��� �޼ҵ�
	public void printAllBook() {
		System.out.println("");
		System.out.println("=======================å����ȸ==========================");
		System.out.println();
		
		for(int i=0; i<bookList.length; i++) {
			System.out.println(i+1+"��° å ���� : "+bookList[i].bookName);
		}
		System.out.println();
		System.out.println("===================================");
		System.out.println();
	}
	
	
}
