package structuraldesingpatterns.facadedesignpattern;

/**
 * Amplifier subsystem class.
 */
class Amplifier {
	public void on() {
		System.out.println("Amplifier on");
	}

	public void off() {
		System.out.println("Amplifier off");
	}

	public void setVolume(int level) {
        System.out.println("Setting volume to " + level);
    }
}