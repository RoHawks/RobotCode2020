package common.drivetrain;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.geometry.Translation2d;
import edu.wpi.first.wpilibj.kinematics.SwerveModuleState;
import framework.mechanism.Mechanism;

public class SwerveModule extends Mechanism {
    public Translation2d offset;
    TalonSRX driveMotor;
    TalonSRX turnMotor;

    public SwerveModule(int drivePort, int turnPort) {
        super();
        driveMotor = new TalonSRX(drivePort);
        turnMotor = new TalonSRX(turnPort);
        //TODO: configure PID for turn motor
    }

    public void set(SwerveModuleState state) {
        driveMotor.set(ControlMode.PercentOutput, state.speedMetersPerSecond);
        turnMotor.set(ControlMode.Position, angleToPosition(state.angle.getDegrees()));
    }

    private double angleToPosition(double degrees) {
        //TODO: turn angle to position
        return 0;
    }

    @Override
    public void log() {
        // TODO Auto-generated method stub

    }

}