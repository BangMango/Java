package publicLibrary;

public class Library {
	public static BookShelf comicBookShelf;
	public static BookShelf historyBookShelf;
	public static void main(String[] args) {
		//1 ��ȭå ���� ���� ����
		
		// 1.1 ��Ŀ�� �����
		BookCover comicBookCover=new BookCover();
		comicBookCover.color="BLACK";
		comicBookCover.type="PLASTIC";
		
		// 1.2 ���� �����
		Paper comicPaper=new Paper();
		comicPaper.type="THIN";
		
		//2 �巡�ﺼ ��ȭå �����
		ComicBook dragonBall=new ComicBook(comicBookCover,comicPaper,"�巡�ﺼ","������1");
		
		//3 å�� �����
		comicBookShelf = new BookShelf(2, "BLACK");
		
		//4 å�忡 ��ȭå �ȾƳֱ�
		comicBookShelf.addBook(0, dragonBall);
		
		//5 �巡�ﺼ å ���� ����ϱ�
		comicBookShelf.printBook(dragonBall);
		
		//////////////////////////////////////////////////////////////////////////////////
		
		//6 ���ǽ� ��ȭå �����
		comicBookCover.color="BLUE";
		ComicBook onePiece = new ComicBook(comicBookCover, comicPaper,true,"���ǽ�","������2");
		
		//7 å�忡 ���ǽ� ��ȭå �ȾƳֱ�
		comicBookShelf.addBook(1, onePiece);
		
		//8 ���ǽ� å ���� ����ϱ�
		comicBookShelf.printBook(onePiece);
		
		//9 ��� å ���� ����ϱ�
		comicBookShelf.printAllBook();
		
		////////////////////////////////////////////////////////////////////////////////////
		//1. ����å ���� ���� ����
		BookCover historyBookCover=new BookCover();
		historyBookCover.color="WHITE";
		
		historyBookCover.type="LEATHER";
		
		Paper historyPaper=new Paper();
		historyPaper.type="THICK";
		
		//2. �ѱ��� ����å �����
		HistoryBook koreaHistoryBook = new HistoryBook(historyBookCover,historyPaper,"KOREA","�ѱ��� ����","������1");
		
		//3. å������
		historyBookShelf = new BookShelf(2);
		
		//4. å�忡 å �߰��ϱ�
		historyBookShelf.addBook(0, koreaHistoryBook);
		
		//5. �ѱ��� ���� å ���� ����ϱ�
		historyBookShelf.printBook(koreaHistoryBook);
		
		//6. �Ϻ� ����å�����
		historyBookCover.color="BLACK";
		
		HistoryBook japanHistoryBook=new HistoryBook(historyBookCover,historyPaper,"JAPAN","�Ϻ��� ����","������2");
		//7. å�忡 �Ϻ� ����å �ȾƳֱ�
		historyBookShelf.addBook(1, japanHistoryBook);
		
		//8 �Ϻ� ����å ���� ���
		historyBookShelf.printBook(japanHistoryBook);
		
		historyBookShelf.printAllBook();
	}
}
