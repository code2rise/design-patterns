package com.rise;

public class EnemyRobotAdapter implements EnemyAttacker {

	private EnemyRobot robot;
	
	public EnemyRobotAdapter(EnemyRobot robot) {
		this.robot = robot;
	}
	
	@Override
	public void driveForward() {
		
		robot.walkForward();
	}

	@Override
	public void fireWeapon() {
		
		robot.smashWithHand();
	}

}
