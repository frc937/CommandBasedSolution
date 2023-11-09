// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

/**
 * This is a subsystem that represents an arbitrary motor driven by a Talon.
 * 
 * <p>This subsystem is for demonstration/education purposes only; it has very little practical
 * use on an actual robot.
 */
public class Motor extends SubsystemBase {
  private Talon motor;

  /** 
   * Creates a new Motor. This is a subsystem that represents an arbitrary motor driven by a
   * Talon.
   * 
   * <p>This subsystem is for demonstration/education purposes only; it has very little practical
   * use on an actual robot.
   */
  public Motor() {
    this.motor = new Talon(Constants.Motor.PWM_PORT_TALON);
  }

  /**
   * Turns the motor.
   */
  public void turnMotor() {
    motor.set(Constants.Motor.SPEED_TALON);
  }

  /**
   * Stops the motor.
   */
  public void stop() {
    motor.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
