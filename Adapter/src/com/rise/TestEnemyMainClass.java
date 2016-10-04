package com.rise;

public class TestEnemyMainClass {

	public static void main(String[] args) {
		
		EnemyTank enemyTank = new EnemyTank();
		enemyTank.driveForward();
		enemyTank.fireWeapon();
		
		EnemyRobot enemyRobot = new EnemyRobot();
		EnemyRobotAdapter robotAdapter = new EnemyRobotAdapter(enemyRobot);
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
	}

}
