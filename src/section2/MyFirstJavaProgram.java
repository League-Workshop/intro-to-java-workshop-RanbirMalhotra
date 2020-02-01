package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot ranbir= new Robot("batman");
ranbir.penDown();
ranbir.setSpeed(100);
for(int i=0; i<4; i++) {
ranbir.turn(90);	 
ranbir.move(100);		
ranbir.sparkle();
	ranbir.setPenColor(Color.ORANGE);	
}
	}
}
