package com.rise;

public class EnemyTank implements EnemyAttacker {

	@Override
	public void driveForward() {
		System.out.println("Enemy Tank will move forward!");
	}

	@Override
	public void fireWeapon() {
		System.out.println("Launch a granade!");
	}
}
