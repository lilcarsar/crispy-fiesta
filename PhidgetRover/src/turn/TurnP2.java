package turn;


//Add Phidgets Library
import com.phidget22.*;

public class TurnP2 {
  public static void main(String[] args) throws Exception {

      //Connect to wireless rover
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

      //Turn in one direction
      leftMotors.setTargetVelocity(1);
      rightMotors.setTargetVelocity(1);

      //Wait for 2 second
      Thread.sleep(2000);

      leftMotors.setTargetVelocity(0);
      rightMotors.setTargetVelocity(0);
      
      Thread.sleep(500);
      
      leftMotors.setTargetVelocity(-1);
      rightMotors.setTargetVelocity(1);
      
      Thread.sleep(750);
      
      leftMotors.setTargetVelocity(0);
      rightMotors.setTargetVelocity(0);
      
      Thread.sleep(500);
      
      leftMotors.setTargetVelocity(1);
      rightMotors.setTargetVelocity(1);
      
      Thread.sleep(2000);

      
      //Stop motors
      leftMotors.setTargetVelocity(0);
      rightMotors.setTargetVelocity(0);
  }
}
