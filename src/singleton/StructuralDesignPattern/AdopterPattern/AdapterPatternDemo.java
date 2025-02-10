package structuraldesingpatterns.adopterdesignpattern;

//The client uses the target interface to get JSON stock data
public class AdapterPatternDemo {
	public static void main(String[] args) {
		// Create an instance of the adaptee
		XMLStockData xmlStockData = new XMLStockData();
		// Wrap it with the adapter that implements the target interface
		StockDataJSON stockData = new StockDataAdapter(xmlStockData);
		// Use the adapter to retrieve JSON-formatted stock data
		System.out.println("Converted JSON Stock Data: " + stockData.getStockDataAsJSON());
	}
}


//output :-
//Converted JSON Stock Data: {"symbol":"nifty50 stock", "price":1500}
