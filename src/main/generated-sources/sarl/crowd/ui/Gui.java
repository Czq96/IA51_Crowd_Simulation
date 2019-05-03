package crowd.ui;

import framework.gui.AbstractFrameworkGUI;
import framework.math.Point2f;
import framework.math.Vector2f;
import framework.time.TimeManager;
import framework.util.Resources;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.io.Serializable;

@SarlSpecification("0.8")
@SarlElementType(10)
@SuppressWarnings("all")
public class Gui extends AbstractFrameworkGUI {
  public Gui(final float worldWidth, final float worldHeight, final TimeManager timeManager) {
    super(
      "Crowd Simulation", worldWidth, worldHeight, 
      Resources.getResource(Gui.class, "icon.png"), timeManager);
  }
  
  protected boolean isMouseCursorHidden() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void paintAgentBody(final Graphics2D g2d, final Point2f positionOnScreen, final Vector2f orientationOnScreen, final Shape shape, final Serializable type, final String name, final Point2f positionInMas, final Shape frustum) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void paintSituatedObject(final Graphics2D g2d, final Point2f positionOnScreen, final Vector2f orientationOnScreen, final Shape shape, final Serializable type, final String name, final Point2f positionInMas) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @SyntheticMember
  private static final long serialVersionUID = 3034679230L;
}
