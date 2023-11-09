// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Motor;

/**
 * Commands that turns the arbitrary motor.
 */
public class TurnMotor extends CommandBase {
  Motor motor;

  /** 
   * Creates a new TurnMotor.
   * This is a command that turns our arbitrary training motor.
   */
  public TurnMotor(Motor motor) {
    this.motor = motor;

    /* This makes this command "dependent" on the motor subsystem, meaning that it will kick off
     * any other commands that are using the motor subsystem when it starts.
     * 
     * You should always make your commands dependent on all subsystems they use.
     */
    addRequirements(motor);
  }

  /** Called when the command is initially scheduled. */
  @Override
  public void initialize() {
    motor.turnMotor();
  }

  /** Called every time the scheduler runs while the command is scheduled. */
  @Override
  public void execute() {}

  /** Called once the command ends or is interrupted. */
  @Override
  public void end(boolean interrupted) {
    motor.stop();
  }

  /** 
   * Returns true when the command should end. Will always return false, since we only want this
   * command to end when it is interrupted (the button is released).
   */
  @Override
  public boolean isFinished() {
    return false;
  }
}
