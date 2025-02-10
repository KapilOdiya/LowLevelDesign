package structuraldesingpatterns.adopterdesignpattern;
//The existing class with an incompatible interface (returns XML)
public class XMLStockData {
 public String getStockDataAsXML() {
     // Simulated XML data for stock information
     return "<stock><symbol>nifty50 stock</symbol><price>1500</price></stock>";
 }
}
