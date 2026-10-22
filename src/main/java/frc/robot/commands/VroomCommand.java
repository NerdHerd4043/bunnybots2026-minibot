package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.XRPDrivetrain;

public class VroomCommand extends Command{
    private final XRPDrivetrain drivetrain;
    private final Joystick joystick;
    
    public VroomCommand(XRPDrivetrain train, Joystick m_Joystick) {
        this.drivetrain = train;
        this.joystick = m_Joystick;
        addRequirements(drivetrain);
    }
    @Override
    public void execute() {
        drivetrain.arcadeDrive(joystick.getRawAxis(0), joystick.getRawAxis(1)*0.7);
    }
    @Override
    public void end(boolean inturupt) {
        drivetrain.arcadeDrive(0, 0);
    }
    @Override
    public boolean isFinished() {
        return false;
    }
}
