package structuraldesingpatterns.bridgedesignpattern;

public class ClientCode {

	public static void main(String[] args) {
		// Control a TV using the BasicRemote
		Device tv = new TV();
		RemoteControl tvRemote = new BasicRemote(tv);
		tvRemote.togglePower(); // TV is now ON.
		tvRemote.volumeUp(); // TV volume set to 11.
		tvRemote.togglePower(); // TV is now OFF.

		// Control a Radio using the BasicRemote
		Device radio = new Radio();
		RemoteControl radioRemote = new BasicRemote(radio);
		radioRemote.togglePower(); // Radio is now ON.
		radioRemote.volumeUp(); // Radio volume set to 11.
		radioRemote.togglePower(); // Radio is now OFF.
	}

}

//Output:-
//TV is now ON.
//TV volume set to 11
//TV is now OFF.
//Radio is now ON.
//Radio volume set to 11
//Radio is now OFF.
