package robot;

import framework.mechanism.interfaces.IMechanism;
import framework.mechanism.configs.interfaces.IMechanismConfig;
import framework.robot.configs.interfaces.IRobotConfig;
import framework.robot.interfaces.IRobot;
import robot.mechanisms.drivetrain.DrivetrainConfig;

public class Robot2020Config implements IRobotConfig {
    private DrivetrainConfig drivetrainConfig;
    private IMechanismConfig[] childrenConfigs;

    public Robot2020Config() {
        drivetrainConfig = new DrivetrainConfig();
        childrenConfigs = new IMechanismConfig[] { drivetrainConfig };
    }
    
    @Override
    public IRobot build(IMechanism parent) {
        return new Robot2020(this);
    }

    @Override
    public IMechanismConfig[] getChildrenConfigs() {
        return childrenConfigs;
    }
}