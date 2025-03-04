package structuraldesingpatterns.decoratordesignpattern;

/**
 * SugarDecorator adds sugar to the coffee.
 */
public class SugarDecorator extends CoffeeDecorator {
	/**
	 * Constructs a SugarDecorator for the given Coffee object.
	 * 
	 * @param coffee the Coffee object to decorate.
	 */
	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription() + ", Sugar";
	}

	@Override
	public double cost() {
		return decoratedCoffee.cost() + 0.30; // Sugar costs an extra $0.30
	}
}
