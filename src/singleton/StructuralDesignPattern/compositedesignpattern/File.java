package structuraldesingpatterns.compositedesignpattern;

/**
 * Leaf class representing a File in the file system.
 */
public class File implements FileSystemComponent {
	private String name;
	private int size; // size in kilobytes

	/**
	 * Constructor to initialize a File object.
	 * 
	 * @param name Name of the file.
	 * @param size Size of the file in kilobytes.
	 */
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	/**
	 * Displays the file details.
	 * 
	 * @param indent Indentation string for display hierarchy.
	 */
	@Override
	public void display(String indent) {
		System.out.println(indent + "File: " + name + " (" + size + " KB)");
	}
}
