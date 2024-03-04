package edu.monmouth.book;

public class Book {
	private double price;
	private BookTypes bookType;
	private int numberOfPages;
	private String title;
	private int publicationYear;
	
	public Book(int numberOfPages,BookTypes bookType,String title,double price,int publicationYear) throws BookException {
		setPrice(price);
		setBookType(bookType);
		setNumberOfPages(numberOfPages);
		setTitle(title);
		setPublicationYear(publicationYear);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws BookException{
		if (price < 0) {
			throw new BookException("price can not be a negative number");
		} else {
			this.price = price;
		}
	}

	public BookTypes getBookType() {
		return bookType;
	}

	public void setBookType(BookTypes bookType) {
		this.bookType = bookType;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) throws BookException{
		if (numberOfPages < 1) {
			throw new BookException("Number of pages does not exceed 1");
		} else {
			this.numberOfPages = numberOfPages;
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws BookException{
		if (title == null || title.length()==0) {
			throw new BookException("No book title given");
		} else {
			this.title = title;
		}
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) throws BookException {
		if(publicationYear < 0 || publicationYear > BookConstants.CURRENTTIME + BookConstants.MAXFUTUREYEARS) {
			throw new BookException("Not valid publication year(either negative or more than two years in future)");
		} else {
			this.publicationYear = publicationYear;

		}
	}

	@Override
	public String toString() {
		return "Book [price=" + price + ", bookType=" + bookType + ", numberOfPages=" + numberOfPages + ", title="
				+ title + ", publicationYear=" + publicationYear + "]";
	}
	
	
	
	
	

}
