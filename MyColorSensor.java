import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.addon.ColorSensor;

public class MyColorSensor {
  public static void main(String[] args) throws Exception {
		
		
		ColorSensor color = new ColorSensor(SensorPort.S1);

		
		
	while(true){
      LCD.drawInt(light.getLightValue(), 4, 0, 0);
      LCD.drawInt(light.getNormalizedLightValue(), 4, 0, 1);
      LCD.drawInt(SensorPort.S1.readRawValue(), 4, 0, 2);
      LCD.drawInt(SensorPort.S1.readValue(), 4, 0, 3);
      
      LCD.drawInt(color.getColorNumber(), 4, 0, 1);
    }  
    	
  }
}

