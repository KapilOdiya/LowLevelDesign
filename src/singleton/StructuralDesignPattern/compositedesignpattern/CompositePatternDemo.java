package structuraldesingpatterns.compositedesignpattern;

/**
 * Client code demonstrating the Composite Pattern in action.
 */
public class CompositePatternDemo {
	public static void main(String[] args) {
		// Create files
		File file1 = new File("Document.pdf", 120);
		File file2 = new File("Image.png", 300);
		File file3 = new File("Video.mp4", 15000);

		// Create directories and build the hierarchy
		Directory root = new Directory("Root");
		Directory subDir1 = new Directory("SubDirectory1");
		Directory subDir2 = new Directory("SubDirectory2");

		subDir1.add(file1);
		subDir1.add(file2);

		subDir2.add(file3);

		root.add(subDir1);
		root.add(subDir2);

		// Display the entire file system structure
		root.display("");
	}
}

//output 
//Directory: Root
//Directory: SubDirectory1
//    File: Document.pdf (120 KB)
//    File: Image.png (300 KB)
//Directory: SubDirectory2
//    File: Video.mp4 (15000 KB)
