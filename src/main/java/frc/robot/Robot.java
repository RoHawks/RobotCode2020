/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import java.util.ArrayList;

import edu.wpi.first.wpilibj.TimedRobot;
import framework.interfaces.IMechanism;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot implements IMechanism {
  protected ArrayList<IMechanism> children;

  @Override
  public void robotInit() {

  }

  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {

  }

  @Override
  public void teleopInit() {

  }

  @Override
  public void teleopPeriodic() {

  }

  @Override
  public void testInit() {

  }

  @Override
  public void testPeriodic() {

  }

  @Override
  public void robotPeriodic() {
    log();
  }

  /**
   * Log relevant information, should be called every iteration of the robot.
   * Only log information local to this class, and then call log functions of all children mechanisms.
   */
  @Override
  public void log() {
    //TODO: log robot information

    for (IMechanism child : children) {
      child.log();
    }
  }

  @Override
  public IMechanism[] getChildren() {
    var result = new IMechanism[children.size()];
    return children.toArray(result);
  }

  @Override
  public IMechanism getParent() {
    return null;
  }

}
