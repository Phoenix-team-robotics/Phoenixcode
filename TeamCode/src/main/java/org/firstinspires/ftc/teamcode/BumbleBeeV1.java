package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

// tele op lets you know either its autonomus or tele
@TeleOp
public class BumbleBeeV1 extends OpMode {
    //calls the motors and makes them variables
    DcMotor RFMotor;
    DcMotor LFMotor;
    DcMotor RBMotor;
    DcMotor LBMotor;

    public void moveDriveTrain(){
        //drivetrain programming naming variables the gamepads
        double vertical;
        double horizontal;
        double pivot;
        vertical = -gamepad1.left_stick_y;
        horizontal = gamepad1.left_stick_x;
        pivot = gamepad1.right_stick_x;


        RFMotor.setPower(pivot+(-vertical+horizontal));
        RBMotor.setPower(pivot+(-vertical-horizontal));
        LFMotor.setPower(pivot+(-vertical-horizontal));
        LBMotor.setPower(pivot+(-vertical+horizontal));
    }
    @Override //starts new section of code
    public void init() {
        /* void init always initializes new section of code */
        /* The line of code under this connects the motor  */
        RFMotor = hardwareMap.get(DcMotor.class, "RFMotor");
        LFMotor = hardwareMap.get(DcMotor.class,"LFMotor");
        RBMotor = hardwareMap.get(DcMotor.class, "RBMotor");
        LBMotor = hardwareMap.get(DcMotor.class,"LBMotor");

        RFMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        RBMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }
    @Override
    public void init_loop(){

    }
    @Override
    public void loop(){

    }
}
