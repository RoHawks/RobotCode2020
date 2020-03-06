package robot.mechanisms.drivetrain;

import framework.mechanism.configs.MechanismConfig;
import framework.mechanism.configs.interfaces.IMechanismConfig;
import framework.mechanism.interfaces.IMechanism;

public class DrivetrainConfig extends MechanismConfig {
    private GyroConfig gyroConfig;
    private SwerveModuleConfig frontLeftConfig;
    private SwerveModuleConfig frontRightConfig;
    private SwerveModuleConfig rearRightConfig;
    private SwerveModuleConfig rearLeftConfig;

    public DrivetrainConfig() {
        childrenConfigs = new IMechanismConfig[] {
            gyroConfig, 
            frontRightConfig,
            frontLeftConfig,
            rearLeftConfig,
            rearRightConfig
        };
    }

    @Override
    public IMechanism build(IMechanism parent) {
        return new Drivetrain(this, parent);
    }
}