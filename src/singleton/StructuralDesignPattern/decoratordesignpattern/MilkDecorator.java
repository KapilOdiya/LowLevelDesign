package structuraldesingpatterns.decoratordesignpattern;

/**
 * MilkDecorator adds milk to the coffee.
 */
public class MilkDecorator extends CoffeeDecorator {
	/**
	 * Constructs a MilkDecorator for the given Coffee object.
	 * 
	 * @param coffee the Coffee object to decorate.
	 */
	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return decoratedCoffee.cost() + 0.50; // Milk costs an extra $0.50
	}
}
