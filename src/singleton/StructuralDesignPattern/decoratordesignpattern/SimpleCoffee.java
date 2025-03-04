package structuraldesingpatterns.decoratordesignpattern;

/**
 * SimpleCoffee represents the basic coffee without any extras.
 */
public class SimpleCoffee implements Coffee {
	@Override
	public String getDescription() {
		return "Simple Coffee";
	}

	@Override
	public double cost() {
		return 2.00;
	}
}
