package calculateWeight;
import com.phidget22.*;

public class CalculateWeight3 {


//Add Phidgets Library

  public static void main(String[] args) throws Exception{

      //Create
      VoltageRatioInput scale = new VoltageRatioInput();
      
      //Open
      scale.open(1000);
      
      double offset = 0;
      double total = 0;
      
      for(int i = 0; i < 64; i++) {
    	
    	  total += scale.getVoltageRatio();
    	  offset = total/64;
    	  System.out.println("Calculating offset");
      }
      
      
      //Use your Offset Value
      double offsetValue = offset;
      
      //Use your Phidgets
      while(true){

          //Calculate Weight (kg)
          double weight = 4611 * (scale.getVoltageRatio() - offsetValue);
          
          //Display Weight
          System.out.println(String.format("%.3f kg", weight));      
          
          Thread.sleep(250);
      }
  }    
}

