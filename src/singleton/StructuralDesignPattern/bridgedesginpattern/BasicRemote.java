package structuraldesingpatterns.bridgedesignpattern;

// Refined Abstraction: Basic Remote
public class BasicRemote implements RemoteControl {
	private boolean isOn = false;
	private int volume = 10;
	private Device device;


	public BasicRemote(Device device) {
		this.device  = device;
	}

	@Override
	public void togglePower() {
		if (isOn) {
			device.turnOff();
			isOn = false;
		} else {
			device.turnOn();
			isOn = true;
		}
	}

	@Override
	public void volumeUp() {
		volume++;
		device.setVolume(volume);
	}

	@Override
	public void volumeDown() {
		volume--;
		device.setVolume(volume);
	}
}
