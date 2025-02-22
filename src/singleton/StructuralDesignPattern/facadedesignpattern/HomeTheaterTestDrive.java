package structuraldesingpatterns.facadedesignpattern;

/**
 * Client class to demonstrate the Facade Pattern in a home theater system.
 */
public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		// Instantiate subsystem components
		Amplifier amplifier = new Amplifier();
		DVDPlayer dvdPlayer = new DVDPlayer();
		Projector projector = new Projector();
		TheaterLights theaterLights = new TheaterLights();
		Screen screen = new Screen();

		// Create the facade by passing the subsystem components
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvdPlayer, projector, theaterLights, screen);

		// Start watching a movie
		homeTheater.watchMovie("Inception");

		// End movie
		homeTheater.endMovie();
	}
}


//output
//Setting volume to 5
//DVD Player on
//Playing movie: Inception
//Shutting movie theater down...
//Theater lights on
//Screen going up
//Projector off
//Amplifier off
//DVD Player stopped
//DVD Player off
