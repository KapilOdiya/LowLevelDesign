package structuraldesingpatterns.compositedesignpattern;
/**
 * Component interface that declares common operations for both simple and complex objects.
 */
public interface FileSystemComponent {
    /**
     * Displays the details of the component.
     */
    void display(String indent);
}