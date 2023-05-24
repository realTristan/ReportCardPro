package Components.Buttons;

import javax.swing.JButton;

public class Button extends JButton {
  public Button(String t, int x, int y, int w, int h) {
    super(t);
    super.setBounds(x, y, w, h);
  }
}
