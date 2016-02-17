package org.usfirst.frc.team1829.robot;


import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;

//local imports
import org.usfirst.frc.team1829.robot.command.*;
import org.usfirst.frc.team1829.robot.Arm;
import org.usfirst.frc.team1829.robot.Camera;
import org.usfirst.frc.team1829.robot.Collector;
import org.usfirst.frc.team1829.robot.Drive;
import org.usfirst.frc.team1829.robot.HighShooter;
import org.usfirst.frc.team1829.robot.LowShooter;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
@SuppressWarnings("unused")
public class Robot extends IterativeRobot {
    final String defaultAuto = "Default";
    final String customAuto = "My Auto";
    String autoSelected;
    SendableChooser chooser;
    
    //Defines variables as fields for our robot class
    //Unique IDs
    //CAN ids
    CANTalon talon1 = new CANTalon(1); // reserved for Drive subsystem
    CANTalon talon2 = new CANTalon(2); // reserved for Drive subsystem
    CANTalon talon3 = new CANTalon(3); // not assigned
    CANTalon talon4 = new CANTalon(4); // not assogned
    CANTalon talon5 = new CANTalon(5); // not assigned
    CANTalon talon6 = new CANTalon(6); // not assigned
    //CANTalon talon7 = new CANTalon(7); slaved to CANTalon1
    //CANTalon talon8 = new CANTalon(8); slaved to CANTalon2
    CANTalon talon9 = new CANTalon(9); // not assigned
    //DIO ports
    //PWM ports
    //Analog ports
    //Inversion constants
    
    //Instantiate subsystems
    private static Arm arm;
    private static Camera camera;
    private static Collector collector;
    private static Drive trogdorDrive;
    private static HighShooter hiShooter;
    private static LowShooter loShooter;
    private static MyJoystick joystick;
    
    //building block commands
    /* 1.dead reckoning command
     * 2._hiShooter comand
     * 3._lowShooter command
     * 4._cameraCCW command
     * 5._cameraCw command
     * 6._collector command
     */
    
    
    
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        chooser = new SendableChooser();
        chooser.addDefault("Default Auto", defaultAuto);
        chooser.addObject("My Auto", customAuto);
        SmartDashboard.putData("Auto choices", chooser);
       /* anything that teleop and autonomous share goes here.
        * initialize commands */
       //initializing subsytems
        arm = new Arm();
        camera = new Camera();
        trogdorDrive = new Drive();
        collector = new Collector();
        trogdorDrive = new Drive();
        hiShooter = new HighShooter();
        loShooter = new LowShooter();
        
        
        /*1. deadrackoning navigation
        * 2. camera feed at 0 degrees
        * 3. collector operation
        * 4. low shooter operation
        */
        
        
        
    }
    
	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString line to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the switch structure below with additional strings.
	 * If using the SendableChooser make sure to add them to the chooser code above as well.
	 */
    public void autonomousInit() {
    	autoSelected = (String) chooser.getSelected();
//		autoSelected = SmartDashboard.getString("Auto Selector", defaultAuto);
		System.out.println("Auto selected: " + autoSelected);
		/* 1. deadrackoning navigation
	        * 2. camera feed at 0 degrees
	        * 3. collector operation
	        * 4. low shooter operation
	        * */
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	switch(autoSelected) {
    	case customAuto:
        //Put custom auto code here  
    		//run daed reckoning program and lowshooter
            break;
    	case defaultAuto:
    	default:
    	//Put default auto code here
            break;
    	}
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        // 1. joystick
    	MyJoystick joystick = new MyJoystick();
         /* 2. cameratable movements
         * 3. collector
         * 4. high shooter
         * 5. low shooter
         * 6. arm
         */
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
