package booksManagement;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Book {

	private int id;
	private String name;
	private Author[] authors;
	private Publisher publisher;
	private int publishingYear;
	private int amountOfPages;
	private BigDecimal price;
	private CoverType coverType;

	public Book() {

	}

	public Book(int id, String name, Author[] authors, Publisher publisher,
			int publishingYear, int amountOfPages, BigDecimal price,
			CoverType coverType) {

		super();
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.publishingYear = publishingYear;
		this.amountOfPages = amountOfPages;
		this.price = price;
		this.coverType = coverType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public int getAmountOfPages() {
		return amountOfPages;
	}

	public void setAmountOfPages(int amountOfPages) {
		this.amountOfPages = amountOfPages;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public CoverType getCoverType() {
		return coverType;
	}

	public void setCoverType(CoverType coverType) {
		this.coverType = coverType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(authors);
		result = prime * result
				+ Objects.hash(amountOfPages, id, name, publisher, publishingYear, price, authors, coverType);
		return result;
	}

@Override
public boolean equals(Object object) {
	if(this == object) 
		return true;
	if (object==null)
		return false;
	if (getClass()!=object.getClass())
		return false;
	Book otherBook = (Book) object;
	return amountOfPages == otherBook.amountOfPages 
			&& Arrays.deepEquals(authors,otherBook.authors) 
			&& coverType == otherBook.coverType 
			&& id==otherBook.id 
			&& Objects.equals(name, otherBook.name)
			&& Objects.equals(price, otherBook.price)
			&& Objects.equals(publisher, otherBook.publisher)
			&& publishingYear == otherBook.publishingYear;
}
	
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", authors"
			+Arrays.toString(authors) + ", publisher = " + publisher + ", publishing year = " + publishingYear + 
			" amout of pages = " + amountOfPages + ", price = " + price + ", coverType = " + coverType + "]";
}
public boolean hasAuthor(Author authorCriteria) {
	for (Author author : authors) {
		if (author.equals(authorCriteria)) {
			return true;
		}
		
	}
	return false;
}

	
}


