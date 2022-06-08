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
	      DistanceSensor sonar = new DistanceSensor();
	      int count = 0;
	      
	      sonar.open(5000);
	      
	      
	      while (true) {

	            System.out.println("Distance: " + sonar.getDistance() + " mm");
	            count++;
	            
	            if (sonar.getDistance() < 400) {
	            	
	                //Object detected! Stop motors
	                leftMotors.setTargetVelocity(0);
	                rightMotors.setTargetVelocity(0);
	                
	                //Wait for 2 second
	    	        Thread.sleep(1000);
	    	        
	    	        
	    	        //Turn in one direction
	    	        leftMotors.setTargetVelocity(-1);
	    	        rightMotors.setTargetVelocity(1);

	                
	                //Wait for 2 second
	    	        Thread.sleep(800);

	    	        //Move forward at full speed
	    	        leftMotors.setTargetVelocity(0);
	    	        rightMotors.setTargetVelocity(0);
	    	        
	    	        Thread.sleep(2000);
	    	        
	    	        leftMotors.setTargetVelocity(-1);
	    	        rightMotors.setTargetVelocity(-1);

	                
	                //Wait for 2 second
	    	        Thread.sleep(1000);
	    	        
	    	        count = 10 - count;
	            }    
	            else            	
	            {
	            	
	            	if (count < 10){
	            	
	            	//Move forward at full speed
	                leftMotors.setTargetVelocity(-0.75);
	                rightMotors.setTargetVelocity(-0.75);
	                
	            	}
	            	
	            	
	            	else 
	            	{
	                    count = 0;
	            	}
	
	            }
	            //Wait for 2 second
	            Thread.sleep(100);
	            }
	}

		}

