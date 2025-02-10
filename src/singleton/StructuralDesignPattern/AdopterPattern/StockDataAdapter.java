package structuraldesingpatterns.adopterdesignpattern;

//The adapter implements the target interface and uses an instance of XMLStockData
public class StockDataAdapter implements StockDataJSON {
 private XMLStockData xmlStockData;

 // Constructor accepts the adaptee instance
 public StockDataAdapter(XMLStockData xmlStockData) {
     this.xmlStockData = xmlStockData;
 }

 @Override
 public String getStockDataAsJSON() {
     String xmlData = xmlStockData.getStockDataAsXML();
     // For demonstration, a simple manual conversion from XML to JSON:
     // In a production system, consider using proper XML parsers and JSON libraries.
     String symbol = xmlData.replaceAll(".*<symbol>(.*)</symbol>.*", "$1");
     String price = xmlData.replaceAll(".*<price>(.*)</price>.*", "$1");
     return "{\"symbol\":\"" + symbol + "\", \"price\":" + price + "}";
 }
}
