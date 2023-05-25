package booksManagement;

import java.util.Objects;

public class Author {
	private int id;
	private String firstName;
	private String lastName;

	public Author() {

	}

	public Author(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, lastName);
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null)
			return false;
		if (getClass() != object.getClass())
			return false;
		Author otherAuthor = (Author) object;

		return Objects.equals(firstName, otherAuthor.firstName) && id == otherAuthor.id
				&& Objects.equals(lastName, otherAuthor.lastName);
	}

	@Override
	public String toString() {
		return "Author [ id = " + id + ", first name " + firstName + ", last name " + lastName + "]";
	}

}
