package Components.Headers;

import java.awt.Font;

import Components.Canvas;

public class Footer {
  public Footer(Canvas canvas) {
    Text text = new Text("v1.0.0 made by Tristan, Jagger, Jett", 198, 330, 300, 30);
    Font font = new Font("Arial", Font.PLAIN, 11);
    text.setFont(font);
    canvas.add(text);
  }
}
