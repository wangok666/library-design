package library.PO;

public class Book {
	
	private String bookID;		// ����ţ�����ID
	private String booktypeID;	// ��������ID
	private String clcID1;		// ��ͼ�����1
	private Integer clcID2;		// ��ͼ�����2
	private String findID;		// �����
	private String bookName;	// ����������
	private String authorName;	// �����ߣ�����
	private String isbn;		// ISBN���
	private float price;		// ����
	private String info;		// ���ݼ��
	private Integer stocknum;	// ����������ڽ��顢����ʱ��Ҫ�ı䡿
	
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public String getBooktypeID() {
		return booktypeID;
	}
	public void setBooktypeID(String booktypeID) {
		this.booktypeID = booktypeID;
	}
	public String getClcID1() {
		return clcID1;
	}
	public void setClcID1(String clcID1) {
		this.clcID1 = clcID1;
	}
	public Integer getClcID2() {
		return clcID2;
	}
	public void setClcID2(Integer clcID2) {
		this.clcID2 = clcID2;
	}
	public String getFindID() {
		return findID;
	}
	public void setFindID(String findID) {
		this.findID = findID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Integer getStocknum() {
		return stocknum;
	}
	public void setStocknum(Integer stocknum) {
		this.stocknum = stocknum;
	}

}
