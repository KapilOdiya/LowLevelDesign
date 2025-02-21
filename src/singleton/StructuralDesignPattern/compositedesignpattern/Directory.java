package structuraldesingpatterns.compositedesignpattern;


/**
 * Composite class representing a Directory that can hold files and other directories.
 */
import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
	private String name;
	private List<FileSystemComponent> children;

	/**
	 * Constructor to initialize a Directory object.
	 * 
	 * @param name Name of the directory.
	 */
	public Directory(String name) {
		this.name = name;
		this.children = new ArrayList<>();
	}

	/**
	 * Adds a child component (file or directory) to the directory.
	 * 
	 * @param component The file system component to add.
	 */
	public void add(FileSystemComponent component) {
		children.add(component);
	}

	/**
	 * Removes a child component from the directory.
	 * 
	 * @param component The file system component to remove.
	 */
	public void remove(FileSystemComponent component) {
		children.remove(component);
	}

	/**
	 * Displays the directory details along with its children.
	 * 
	 * @param indent Indentation string for display hierarchy.
	 */
	@Override
	public void display(String indent) {
		System.out.println(indent + "Directory: " + name);
		// Recursively display each child component
		for (FileSystemComponent component : children) {
			component.display(indent + "    ");
		}
	}
}
