package calculateWeight;

//Add Phidgets Library
import com.phidget22.*;

public class CalculateWeight1 {
    public static void main(String[] args) throws Exception{

        //Create
        VoltageRatioInput scale = new VoltageRatioInput();
        
        //Open
        scale.open(1000);
        
        //Use your Offset Value
        double offsetValue = 2.170428634700565E-4;
        
        //Use your Phidgets
        while(true){

            //Calculate Weight (kg)
            double weight = 4611000 * (scale.getVoltageRatio() - offsetValue);
            
            //Display Weight
            System.out.println(String.format("%.3f g", weight));      
            
            Thread.sleep(250);
        }
    }    
}
  
