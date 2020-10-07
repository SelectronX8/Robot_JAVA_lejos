import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.addon.ColorSensor;

public class TempsColorSensor {
	
	
		public static long start1;
		public static long end1;
		public static long delai;
	
  public static void main(String[] args) throws Exception {
		
		ColorSensor color = new ColorSensor(SensorPort.S1);

		start1=System.currentTimeMillis(); //Début compteur
		
	int i;
	
		for(i=0; i<150; i++){// 5ms pour une tache, 760 pour 160 (150*5 = 750))
     /* LCD.drawInt(light.getLightValue(), 4, 0, 0);
      LCD.drawInt(light.getNormalizedLightValue(), 4, 0, 1);
      LCD.drawInt(SensorPort.S1.readRawValue(), 4, 0, 2);
      LCD.drawInt(SensorPort.S1.readValue(), 4, 0, 3);*/
      
      LCD.drawInt(color.getColorNumber(), 4, 0, 1);
      }
      
    	end1=System.currentTimeMillis();
    	
    	delai = end1 - start1;
    	
    	while(true){
    	LCD.drawInt((int)delai, 4, 0, 2);
    	}
  }
}
