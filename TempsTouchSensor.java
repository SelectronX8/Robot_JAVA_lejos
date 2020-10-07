import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

public class TempsTouchSensor {
	
	public static long start1;
	public static long end1;
	public static long delai;	
	
  public static void main(String[] args) throws Exception {
  	
    TouchSensor touch = new TouchSensor(SensorPort.S1);
    
    start1=System.currentTimeMillis(); //Début compteur
  
    
   while((touch.isPressed())!= true){
   }
    
   end1=System.currentTimeMillis();
    	
   delai = end1 - start1;
    	
   while(true){
    LCD.drawInt((int)delai, 4, 0, 2);
   }
    
  }
}