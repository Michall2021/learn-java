package booksManagement;

import java.util.Objects;

public class Publisher {
private int id;
private String publisherName;

public Publisher() {
	}

public Publisher(int id,String publisherName) {
	super();
	this.id=id;
	this.publisherName = publisherName;
}



@Override
public int hashCode() {
	return Objects.hash(id,publisherName);
}

@Override
public boolean equals(Object object) {
	if(this==object) return true;
	if (object==null)return false;
	if (getClass() != object.getClass()) return false;
	
	Publisher otherPublisher = (Publisher) object;
	return id==otherPublisher.id 
			&& Objects.equals(publisherName, otherPublisher.publisherName);
}

@Override
public String toString() {
	return "Publisher [id=" + id + ", publisher name = " + publisherName + "]";
}
}
