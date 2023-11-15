package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.robot.Robot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.Range;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.TouchSensor;




@Autonomous(name = "AutoBlueLeft")


public class AutoBlueLeft extends LinearOpMode{


    /// Establishes the "robot" object from the "RobotMap" class
    RobotMap robot = new RobotMap();
    
    // Establishes the "runtime" object from the "ElapsedTime" class
    private ElapsedTime runtime = new ElapsedTime();
    
    @Override
    public void runOpMode() {
        
        // Initialize the hardware variables
        robot.init(hardwareMap);
        Methods methods = new Methods(robot);
        // Wait for driver to hit PLAY
        waitForStart();
        methods.strafe(-24, 537);
        robot.extender.setTargetPosition(2906);
        robot.extender.setVelocity(armSpeed);
        methods.drive(40, 537);
        robot.extender.setTargetPosition(2117);
        robot.servo1.setPosition(1);


        robot.leftFrontDrive.setPower(0);
        robot.leftBackDrive.setPower(0);
        robot.rightFrontDrive.setPower(0);
        robot.rightBackDrive.setPower(0);
        robot.extender.setPower(0);
        robot.servo1.setPosition(0.3);


     }
}