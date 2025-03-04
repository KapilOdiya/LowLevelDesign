package structuraldesingpatterns.decoratordesignpattern;

/**
 * The Coffee interface declares operations that can be altered by decorators.
 */
public interface Coffee {
	/**
	 * Returns a description of the coffee.
	 * 
	 * @return the description as a String.
	 */
	String getDescription();

	/**
	 * Calculates the cost of the coffee.
	 * 
	 * @return the cost as a double.
	 */
	double cost();
}
