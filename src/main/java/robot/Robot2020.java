package robot;

import framework.mechanism.Mechanism;
import framework.robot.interfaces.IRobot;

public class Robot2020 extends Mechanism implements IRobot {    
    public Robot2020(Robot2020Config config) {
        super(config, null);
    }

    /**
     * This is called by the FRC robotInit after it has build the configuration for the robot.
     */
    @Override
    public void robotInit() {
        // TODO Auto-generated method stub
        
    }
    /**
     * This shouldn't do much more than log.  
     * Needs to be lightning fast because it's called every iteration of the robot
     */
    @Override
    public void robotPeriodic() {
        logMechanisms();
    }

    @Override
    public void autonomousInit() {
        // TODO Auto-generated method stub

    }
    @Override
    public void autonomousPeriodic() {
        // TODO Auto-generated method stub

    }

    @Override
    public void teleopInit() {
        // TODO Auto-generated method stub

    }
    @Override
    public void teleopPeriodic() {
        // TODO Auto-generated method stub

    }

    @Override
    public void testInit() {
        // TODO Auto-generated method stub

    }
    @Override
    public void testPeriodic() {
        // TODO Auto-generated method stub

    }

    @Override
    public void disabledInit() {
        // TODO Auto-generated method stub

    }
    @Override
    public void disabledPeriodic() {
        // TODO Auto-generated method stub

    }

    @Override
    public void log() {
        //TODO: log from Robot level only

    }    
}