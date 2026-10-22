package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.VroomCommand;
import frc.robot.subsystems.XRPDrivetrain;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public class RobotContainer {
  private final XRPDrivetrain m_xrpDrivetrain = new XRPDrivetrain();
  private final Joystick m_driverJoystick = new Joystick(0);

  public RobotContainer() {
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    m_xrpDrivetrain.setDefaultCommand(
        new VroomCommand(m_xrpDrivetrain, m_driverJoystick)
    );
  }

  public Command getAutonomousCommand() {
    return new VroomCommand(m_xrpDrivetrain, m_driverJoystick);
  }
}