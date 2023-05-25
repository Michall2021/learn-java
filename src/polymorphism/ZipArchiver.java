package polymorphism;

import java.io.File;

public class ZipArchiver implements Archiver{
//	overriding
	public void archiveFiles(File... files) {
		System.out.println("Method of Zip Archiver is called");
	}
//	overloading(different signature)
	public void archiveFiles(int maxArchiveSize, File... files) {
		// stub method for the demo purposes
	}
}
