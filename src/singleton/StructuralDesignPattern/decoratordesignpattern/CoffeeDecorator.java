package structuraldesingpatterns.decoratordesignpattern;

/**
 * CoffeeDecorator is the abstract decorator that implements the Coffee
 * interface. It maintains a reference to a Coffee object and delegates
 * operations to it.
 */
public abstract class CoffeeDecorator implements Coffee {
	protected Coffee decoratedCoffee;

	/**
	 * Constructs a CoffeeDecorator with the given Coffee object.
	 * 
	 * @param coffee the Coffee object to decorate.
	 */
	public CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee = coffee;
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription();
	}

	@Override
	public double cost() {
		return decoratedCoffee.cost();
	}
}
