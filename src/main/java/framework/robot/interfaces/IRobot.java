package framework.robot.interfaces;

import framework.mechanism.interfaces.IMechanism;

public interface IRobot extends IMechanism {
    void robotInit();
    void robotPeriodic();

    void autonomousInit();
    void autonomousPeriodic();

    void teleopInit();
    void teleopPeriodic();

    void testInit();
    void testPeriodic();

    void disabledInit();
    void disabledPeriodic();
}