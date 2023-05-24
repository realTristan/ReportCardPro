package Components;

import java.awt.*;
import javax.swing.*;

public class Canvas extends JPanel {
  public Utils.Cache cache;

  // Constructor
  public Canvas(Utils.Cache cache) {
    this.cache = cache;
    super.setBackground(Color.WHITE);
  }

  // Paint components
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Draw components
    new Pages.SearchPage(this);
  }
}