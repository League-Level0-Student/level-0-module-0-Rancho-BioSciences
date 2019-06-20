package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class L {
public static void main(String[] args)  {
	Robot one=new Robot();
	one.setSpeed(5);
	one.penDown();
	for (int i = 0; i < 375; i++) {
		one.move(2);
		one.turn(1);
	}
	one.hide();
}
}
