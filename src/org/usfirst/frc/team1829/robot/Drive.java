 package org.usfirst.frc.team1829.robot;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
/**
 *
 */
public class Drive extends Subsystem{
    
	private SpeedController talon1;
	private SpeedController talon2;
	RobotDrive drive = new RobotDrive(talon1, talon2); //declares Drive to return type RobotDrive when called
        // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

