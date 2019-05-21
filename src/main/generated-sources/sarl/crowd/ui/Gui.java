package crowd.ui;

import environment.EnvironmentEvent;
import environment.EnvironmentListener;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.awt.Dimension;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.JFrame;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.8")
@SarlElementType(10)
@SuppressWarnings("all")
public class Gui extends JFrame implements EnvironmentListener {
  private AtomicBoolean isInit = new AtomicBoolean();
  
  private long waitingDuration;
  
  public Gui(final int worldWidth, final int worldHeight, final long waitingDuration) {
    this.waitingDuration = waitingDuration;
    Dimension _dimension = new Dimension(worldWidth, worldHeight);
    this.setPreferredSize(_dimension);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
  }
  
  public void environmentChanged(final EnvironmentEvent event) {
    boolean _get = this.isInit.get();
    if ((!_get)) {
      this.isInit.set(true);
      this.revalidate();
      this.pack();
      this.setVisible(true);
    }
    if ((this.waitingDuration > 0)) {
      try {
        Thread.sleep(this.waitingDuration);
      } catch (final Throwable _t) {
        if (_t instanceof InterruptedException) {
          final InterruptedException e = (InterruptedException)_t;
          throw new RuntimeException(e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Gui other = (Gui) obj;
    if (other.waitingDuration != this.waitingDuration)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + (int) (this.waitingDuration ^ (this.waitingDuration >>> 32));
    return result;
  }
  
  @SyntheticMember
  private static final long serialVersionUID = -986942904L;
}
