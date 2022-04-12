package publicLibrary;

public class HistoryBook extends Book{
	public String countryName;
	//매개변수 X
	HistoryBook(){
		this.bookCover=new BookCover();
		this.paper=new Paper();
		//
		this.countryName="KOREA";
		this.wholeBookPaperCnt=300;
		this.bookName="무제";
		this.authorName="익명";
	}
	//매개변수 4개
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
