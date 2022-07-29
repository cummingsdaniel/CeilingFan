package CeilingFan;
/**
 * 
 * @author Dan Cummings
 * Medavie BlueCross coding assessment
 * 
 */
public class Fan {
	private int currentState;
	private int direction;
	public Fan() {
		currentState = 0;
		direction = 0;
	}
	
	
	
	
	public void pullChord1() {
		String dir = null;
		if(direction == 0) {
			dir = "Cloakwise";
		}
		else if(direction == 1) {
			dir = "Counter-Cloakwise";
		}
		if (currentState == 0) {
			currentState = 1;
			System.out.println("Fan Spinning at Speed 1 " + dir);
		}else if (currentState == 1) {
			currentState = 2;
			System.out.println("Fan Spinning at Speed 2 " + dir);			
		}
		else if (currentState == 2) {
			currentState = 3;
			System.out.println("Fan Spinning at Speed 3 " + dir);			
		}
		else if (currentState == 3) {
			currentState = 0;
			System.out.println("Fan is Off");			
		}
	}
	
	public void pullChord2() {
		if(direction == 0) {
			direction = 1;
			System.out.println("Fan Spinning Counter-Cloakwise at Speed " + currentState);
		}
		else if(direction == 1) {
			direction = 0;
			System.out.println("Fan Spinning Cloakwise at Speed" + currentState);
		}
	}
	
	public int getSpeed() {
		return currentState;
	}
	
	public int getDirection() {
		return direction;
	}
	
}
