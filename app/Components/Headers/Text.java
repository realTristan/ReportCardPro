package Components.Headers;

import javax.swing.JLabel;

public class Text extends JLabel {
  public Text(String s, int x, int y, int w, int h) {
    super(s);
    super.setBounds(x, y, w, h);
  }
}