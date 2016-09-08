package com.rise;

public class RobotBuilderTest {

	public static void main(String[] args) {
		
		Robot robot = new Robot.RobotBuilder("Jarvis")
				.setCanFly(true)
				.setCanJump(false)
				.setFuel("2MWatt")
				.build();
		
		System.out.println("Robot : " + robot.getRobotName() + 
				", canFly : " + robot.canFly() + 
				", canJump : " + robot.canJump() + 
				", Fuel : " + robot.getFuel());
	}

}
