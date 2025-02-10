/**
 * 
 */
package LLD.designPattern.singleton;

public class SingletonClient {
	public static void main(String[] args) {

		Logger logger = Logger.getInstance();
		logger.log(LogLevel.INFO, "message from INFO log ");

		Logger instance1 = logger.getInstance("DCL");
		if (instance1 == logger) {
			System.err.println("BOTH HAVE SAME HASH CODE "+ instance1.hashCode() + " : "+ logger.hashCode());
		}

	}

}
