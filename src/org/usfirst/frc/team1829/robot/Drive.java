package org.usfirst.frc.team1829.robot;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Joystick;
/**
 *
 */
public class Drive extends Subsystem{

	private SpeedController talon1;
	private SpeedController talon2;

	private Joystick leftJoystick;
	private Joystick rightJoystick;

	private Encoder leftEncoder;
	private Encoder rightEncoder;

	RobotDrive drive = new RobotDrive(talon1, talon2); //declares Drive to return type RobotDrive when called
        // Put methods for controlling this subsystem
    // here. Call these from Commands.

	/**
	 * Always remember to build a constructor for your subsystems so you can
	 * initialize variables here.
	 */
	public Drive() {

		//Make sure you replace these numbers with the port these talons are plugged into.
		talon1 = new Talon(0);
		talon2 = new Talon(1);

		//Make sure you replace these numbers with your desired joystick usb ports.
		leftJoystick = new Joystick(0);
		rightJoystick = new Joystick(1);

		//Replace these encoder numbers with proper encoder ports. (There may
		//need to be two ports for each encoder, but I can't remember off the top of my head.
		leftEncoder = new Encoder(0);
		rightEncoder = new Encoder(1);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

	/**
	 * Allows a Joystick to be passed in to act as the left joystick.
	 */
	public void setLeftJoystick(Joystick left) {

		leftJoystick = left;
	}

	/**
	 * Allows a Joystick to be passed in to act as the right joystick.
	 */
	public void setRightJoystick(Joystick right) {

		rightJoystick = right;
	}

	//After calling these two functions (from, say, Robot.java) you can then
	//use the references to 'leftJoystick' and 'rightJoystick'

	public Encoder getLeftEncoder() {

		return leftEncoder;
	}

	public Encoder getRightEncoder() {

		return rightEncoder;
	}
}

