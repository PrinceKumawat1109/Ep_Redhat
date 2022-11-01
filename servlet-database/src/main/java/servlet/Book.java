package servlet;
public class Book {
	  int bookid;
	  String title;
	  double price;
	  public int bookid() {
	    return bookid;
	  }
	  public int getBookid() {
	    return bookid;
	  }
	  public void setBookid(int bookid) {
	    this.bookid = bookid;
	  }
	  public String getTitle() {
	    return title;
	  }
	  public void setTitle(String title) {
	    this.title = title;
	  }
	  public double getPrice() {
	    return price;
	  }
	  public void setPrice(double price) {
	    this.price = price;
	  }
	  @Override
	  public String toString() {
	    return "Book [bookid=" + bookid + ", title=" + title + ", price=" + price + "]";
	  }
	  

	}