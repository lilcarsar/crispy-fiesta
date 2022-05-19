package challenge;

import com.phidget22.*;


public class PhidgetsChallenge {

	public static void main(String[] args) throws Exception {
		
		
		 Net.addServer("", "192.168.100.1", 5661, "", 0);

	      //Create
	      DCMotor leftMotors = new DCMotor();
	      DCMotor rightMotors = new DCMotor();

	      //Address
	      leftMotors.setChannel(0);
	      rightMotors.setChannel(1);

	      //Open
	      leftMotors.open(5000);
	      rightMotors.open(5000);
	      
	      leftMotors.setTargetVelocity(-1);
	      rightMotors.setTargetVelocity(-1);
	      
	      
	      Thread.sleep(1750);
	      
	      leftMotors.setTargetVelocity(-1);
	      rightMotors.setTargetVelocity(1);
	      
	      Thread.sleep(375);
	      
	}

}
