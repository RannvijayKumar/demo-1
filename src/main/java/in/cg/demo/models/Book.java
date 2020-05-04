package in.cg.demo.models;

public class Book {
	private int bookId;
	private int price;
	private int qty;
	private int total;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void calculateTotal() {
		this.total = this.price * this.qty;
	}

	public Book(int bookId, int price, int qty) {
		super();
		this.bookId = bookId;
		this.price = price;
		this.qty = qty;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
}
