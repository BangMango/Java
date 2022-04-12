package publicLibrary;

public class Library {
	public static BookShelf comicBookShelf;
	public static BookShelf historyBookShelf;
	public static void main(String[] args) {
		//1 만화책 관련 로직 시작
		
		// 1.1 북커버 만들기
		BookCover comicBookCover=new BookCover();
		comicBookCover.color="BLACK";
		comicBookCover.type="PLASTIC";
		
		// 1.2 종이 만들기
		Paper comicPaper=new Paper();
		comicPaper.type="THIN";
		
		//2 드래곤볼 만화책 만들기
		ComicBook dragonBall=new ComicBook(comicBookCover,comicPaper,"드래곤볼","개발자1");
		
		//3 책장 만들기
		comicBookShelf = new BookShelf(2, "BLACK");
		
		//4 책장에 만화책 꽂아넣기
		comicBookShelf.addBook(0, dragonBall);
		
		//5 드래곤볼 책 정보 출력하기
		comicBookShelf.printBook(dragonBall);
		
		//////////////////////////////////////////////////////////////////////////////////
		
		//6 원피스 만화책 만들기
		comicBookCover.color="BLUE";
		ComicBook onePiece = new ComicBook(comicBookCover, comicPaper,true,"원피스","개발자2");
		
		//7 책장에 원피스 만화책 꽂아넣기
		comicBookShelf.addBook(1, onePiece);
		
		//8 원피스 책 정보 출력하기
		comicBookShelf.printBook(onePiece);
		
		//9 모든 책 정보 출력하기
		comicBookShelf.printAllBook();
		
		////////////////////////////////////////////////////////////////////////////////////
		//1. 역사책 관련 로직 시작
		BookCover historyBookCover=new BookCover();
		historyBookCover.color="WHITE";
		
		historyBookCover.type="LEATHER";
		
		Paper historyPaper=new Paper();
		historyPaper.type="THICK";
		
		//2. 한국의 역사책 만들기
		HistoryBook koreaHistoryBook = new HistoryBook(historyBookCover,historyPaper,"KOREA","한국의 역사","개발자1");
		
		//3. 책장제작
		historyBookShelf = new BookShelf(2);
		
		//4. 책장에 책 추가하기
		historyBookShelf.addBook(0, koreaHistoryBook);
		
		//5. 한국의 역사 책 정보 출력하기
		historyBookShelf.printBook(koreaHistoryBook);
		
		//6. 일본 역사책만들기
		historyBookCover.color="BLACK";
		
		HistoryBook japanHistoryBook=new HistoryBook(historyBookCover,historyPaper,"JAPAN","일본의 역사","개발자2");
		//7. 책장에 일본 역사책 꽂아넣기
		historyBookShelf.addBook(1, japanHistoryBook);
		
		//8 일본 역사책 정보 출력
		historyBookShelf.printBook(japanHistoryBook);
		
		historyBookShelf.printAllBook();
	}
}
