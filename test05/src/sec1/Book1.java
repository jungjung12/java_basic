package sec1;

public class Book1 {
	private int bno;
	private String bname;
	private int price;
	private String author;
	private String pub;
	
//	public void 
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	@Override
	public String toString() {
		return "Book1 [bno=" + bno + ", bname=" + bname + ", price=" + price + ", author=" + author + ", pub=" + pub
				+ "]";
	}

	
}
