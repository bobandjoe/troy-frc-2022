// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Lifter extends SubsystemBase {

    //feeding system

    private final Talon lifter_1;
    private final Talon lifter_2;



  /** Creates a new ExampleSubsystem. */
  public Lifter() {

    lifter_1 = new Talon(8);
    lifter_2 = new Talon(7);
  }




// logic to be continues TODO

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  
}
