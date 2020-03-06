package common.drivetrain;

import edu.wpi.first.wpilibj.drive.Vector2d;
import edu.wpi.first.wpilibj.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj.kinematics.SwerveDriveKinematics;
import edu.wpi.first.wpilibj.kinematics.SwerveModuleState;
import framework.mechanism.Mechanism;
import framework.mechanism.interfaces.IMechanism;
import common.drivetrain.enums.DriveMode;
import common.drivetrain.enums.RotationMode;

public class SwerveDrive extends Mechanism {
    public static final double TRANSLATION_NUDGE_SPEED = .2;
    public static final double ROTATION_NUDGE_SPEED = .2;

    SwerveDriveKinematics calculator;
    SwerveModule frontLeft, frontRight, rearRight, rearLeft;
    SwerveModule[] children;
    DriveMode mode;

    public SwerveDrive(SwerveDriveConfig config, IMechanism parent) {
        super(config, parent);
        mode = DriveMode.RobotRelative;
        //TODO: ports
        frontLeft = new SwerveModule(0,0);
        frontRight = new SwerveModule(0,0);
        rearRight = new SwerveModule(0,0);
        rearLeft = new SwerveModule(0,0);
        SwerveModule[] children = { frontLeft, frontRight, rearRight, rearLeft };
        this.children = children;
        calculator = new SwerveDriveKinematics(frontLeft.offset, frontRight.offset, rearRight.offset, rearLeft.offset);
    }

    public void toggleDriveMode() {
        switch (mode) {
        case FieldRelative:
            mode = DriveMode.RobotRelative;
            break;
        case RobotRelative:
            mode = DriveMode.FieldRelative;
            break;
        }
    }

    public void drive(Vector2d translationDirection, double translationSpeed, RotationMode rotationMode,
            double rotationSpeed) {
        // normalize translation vector to magnitude 1
        double originalMagnitude = translationDirection.magnitude();
        if (originalMagnitude != 0) {
            translationDirection.x /= originalMagnitude;
            translationDirection.y /= originalMagnitude;
        }
        // scale translation vector by speed
        translationDirection.x *= translationSpeed;
        translationDirection.y *= translationSpeed;
        switch (rotationMode) {
        case Target:
            // TODO: target rotation mode
            // need swerve drive odometry class to do this, i think
            break;
        case Nudge:
            rotationSpeed *= ROTATION_NUDGE_SPEED;
        case Normal:
            // assumes range of -1 to 1
            rotationSpeed *= 2 * Math.PI;
            break;
        }
        //chassis speeds object expects speeds in meters per seconds and radians per seconds but we are currently calculating as percent of full speed
        //need to scale correctly
        ChassisSpeeds target = new ChassisSpeeds(translationDirection.x, translationDirection.y, rotationSpeed);
        SwerveModuleState[] swerveStates = calculator.toSwerveModuleStates(target);
        for (int i = 0; i < swerveStates.length; i++) {
            children[i].set(swerveStates[i]);
        }
    }

    @Override
    public void log() {
        // TODO Auto-generated method stub

    }
}