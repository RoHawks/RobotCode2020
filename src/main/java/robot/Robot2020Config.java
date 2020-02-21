package robot;

import framework.mechanism.interfaces.IMechanism;
import framework.mechanism.configs.interfaces.IMechanismConfig;
import framework.robot.configs.interfaces.IRobotConfig;
import framework.robot.interfaces.IRobot;

public class Robot2020Config implements IRobotConfig {
    @Override
    public IRobot build(IMechanism parent) {
        return new Robot2020(this);
    }

    @Override
    public IMechanismConfig[] getChildrenConfigs() {
        // TODO Auto-generated method stub
        return null;
    }
}