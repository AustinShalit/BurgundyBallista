
package com.milkenknights.burgundyballista;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;


public class ShooterSubsystem extends Subsystem {
	Talon tWinch;
	JStick joystick;
	Solenoid sWinch;

	boolean loaded;

	int pullBack;

	public ShooterSubsystem(RobotConfig config) {
		tWinch = new Talon(config.getAsInt("tWinch"));
		joystick = JStickMultiton.getJStick(2);
		sWinch = new Solenoid(config.getAsInt("sWinch"));

		pullBack = config.getAsInt("winchPullBack");
	}

	public void teleopPeriodic() {
		if (joystick.isPressed(3) && loaded == false) {
			//Need code Here to pull back the shooter pullBack amount
			loaded = true;
		}
		
		if (joystick.isPressed(1) && loaded == true) {
			//Need code here to move winch back to where it was
			loaded = false;
		}
		
		

	}



}