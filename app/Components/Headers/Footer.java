package Components.Headers;

import java.awt.Font;

import Components.Canvas;

public class Footer extends Text {
  public Footer(Canvas canvas) {
    super("v1.0.0 made by Tristan, Jagger, Jett", 198, 330, 300, 30);
    Font font = new Font("Arial", Font.PLAIN, 11);
    super.setFont(font);
    canvas.add(this);
  }
}
