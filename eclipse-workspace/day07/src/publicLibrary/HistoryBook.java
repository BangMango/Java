package publicLibrary;

public class HistoryBook extends Book{
	public String countryName;
	//�Ű����� X
	HistoryBook(){
		this.bookCover=new BookCover();
		this.paper=new Paper();
		//
		this.countryName="KOREA";
		this.wholeBookPaperCnt=300;
		this.bookName="����";
		this.authorName="�͸�";
	}
	//�Ű����� 4��
	HistoryBook(BookCover bookCover, Paper paper, String bookName, String authorName){
		this.bookCover=bookCover;
		this.paper=paper;
		
		this.countryName="KOREA";
		this.wholeBookPaperCnt=300;
		this.bookName=bookName;
		this.authorName=authorName;
	}
	HistoryBook(BookCover bookCover, Paper paper, String countryName, String bookName, String authorName){
		this(bookCover,paper,bookName,authorName);
		this.countryName=countryName;
	}
}
