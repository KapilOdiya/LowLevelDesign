package structuraldesingpatterns.decoratordesignpattern;

/**
 * CoffeeShop demonstrates the Decorator pattern in action.
 */
public class CoffeeShop {
	public static void main(String[] args) {
		// Create a simple coffee
		Coffee coffee = new SimpleCoffee();
		System.out.println(coffee.getDescription() + " $" + coffee.cost());

		// Decorate the coffee with milk
		coffee = new MilkDecorator(coffee);
		System.out.println(coffee.getDescription() + " $" + coffee.cost());

		// Further decorate the coffee with sugar
		coffee = new SugarDecorator(coffee);
		System.out.println(coffee.getDescription() + " $" + coffee.cost());
	}
}
//output 
//Simple Coffee $2.0
//Simple Coffee, Milk $2.5
//Simple Coffee, Milk, Sugar $2.8