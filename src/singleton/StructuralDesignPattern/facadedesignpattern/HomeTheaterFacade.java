package structuraldesingpatterns.facadedesignpattern;
/**
 * HomeTheaterFacade simplifies the interface to the complex home theater subsystem.
 */
public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private TheaterLights theaterLights;
    private Screen screen;

    /**
     * Constructor to initialize the home theater components.
     *
     * @param amplifier     The amplifier of the home theater.
     * @param dvdPlayer     The DVD player.
     * @param projector     The projector.
     * @param theaterLights The theater lights.
     * @param screen        The screen.
     */
    public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer, Projector projector,
                             TheaterLights theaterLights, Screen screen) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
    }

    /**
     * Starts the movie experience by turning on and configuring all necessary components.
     *
     * @param movie The movie to play.
     */
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        theaterLights.dim(10);
        screen.down();
        projector.on();
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    /**
     * Ends the movie experience by turning off all components.
     */
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.off();
    }
}