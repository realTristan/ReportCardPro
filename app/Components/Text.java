package Components;

import java.awt.Font;
import javax.swing.*;

public class Text {
  public static JLabel make(String text, int x, int y, int w, int h) {
    JLabel label = new JLabel();
    label.setText(text);
    label.setBounds(x, y, w, h);
    return label;
  }

  //
  public static JLabel drawMainHeader(Canvas canvas) {
    JLabel label = Text.make("Report Card Pro", 75, 20, 300, 30);
    Font font = new Font("Arial", Font.BOLD, 30);
    label.setFont(font);
    canvas.add(label);
    return label;
  }

  public static JLabel drawSearchHeader(Canvas canvas) {
    JLabel label = Text.make("Search for Student", 125, 70, 300, 30);
    Font font = new Font("Arial", Font.PLAIN, 15);
    label.setFont(font);
    canvas.add(label);
    return label;
  }

  public static JLabel drawFooter(Canvas canvas) {
    JLabel label = Text.make("v1.0.0 made by Tristan, Jagger, Jett", 198, 330, 300, 30);
    Font font = new Font("Arial", Font.PLAIN, 11);
    label.setFont(font);
    canvas.add(label);
    return label;
  }
}