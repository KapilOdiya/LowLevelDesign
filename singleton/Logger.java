/**
 * 
 */
package LLD.designPattern.singleton;

public class Logger {

	// Eager Loading

	private static Logger instance;

	private Logger() {
	}

	// Method to create or instantiated the object
	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	public static Logger getInstance(String instanceName) {
		if (instance == null) {
			synchronized (Logger.class) {
				if (instance == null)
					instance = new Logger();
			}
		}
		return instance;

	}

	public void log(LogLevel logLevel, String message) {
		System.err.println(logLevel + " : " + message);
	}

}
