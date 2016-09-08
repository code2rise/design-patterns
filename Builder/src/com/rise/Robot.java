package com.rise;

public class Robot {
	
	private String robotName;
	
	private boolean canFly;
	private boolean canJump;
	private String fuel;
	
	private Robot(RobotBuilder robotBuilder) {
		robotName = robotBuilder.robotName;
		canFly = robotBuilder.canFly;
		canJump = robotBuilder.canJump;
		fuel = robotBuilder.fuel;
	}
	
	public String getRobotName() {
		return robotName;
	}
	
	public boolean canFly() {
		return canFly;
	}
	
	public boolean canJump() {
		return canJump;
	}
	
	public String getFuel() {
		return fuel;
	}
	
	public static class RobotBuilder {
		
		private String robotName;
		
		private boolean canFly;
		private boolean canJump;
		private String fuel;
		
		public RobotBuilder(String robotName) {
			this.robotName = robotName;
		}
		
		public RobotBuilder setCanFly(boolean canFly) {
			this.canFly = canFly;
			return this;
		}
		
		public RobotBuilder setCanJump(boolean canJump) {
			this.canJump = canJump;
			return this;
		}

		public RobotBuilder setFuel(String fuel) {
			this.fuel = fuel;
			return this;
		}
		
		public Robot build() {
			
			return new Robot(this);
		}
	}
}
