/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import framework.robot.interfaces.IRobot;
import robot.Robot2020Config;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  private IRobot robot;
  private Robot2020Config config;

  @Override
  public void robotInit() {
    config = new Robot2020Config();
    robot = config.build(null);
    robot.robotInit();
  }
  @Override
  public void robotPeriodic() {
    robot.robotPeriodic();
  }

  @Override
  public void autonomousInit() {
    robot.autonomousInit();
  }
  @Override
  public void autonomousPeriodic() {
    robot.autonomousPeriodic();
  }

  @Override
  public void teleopInit() {
    robot.teleopInit();
  }
  @Override
  public void teleopPeriodic() {
    robot.teleopPeriodic();
  }

  @Override
  public void testInit() {
    robot.testInit();
  }
  @Override
  public void testPeriodic() {
    robot.testPeriodic();
  }

  @Override
  public void disabledInit() {
    robot.disabledInit();
  }
  @Override
  public void disabledPeriodic() {
    robot.disabledPeriodic();
  }
}
