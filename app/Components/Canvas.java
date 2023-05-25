package Components;

import java.awt.*;
import javax.swing.*;

/**
 * A class for creating canvases.
 */
public class Canvas extends JPanel {
  public Utils.Cache cache;
  public int center;

  /**
   * Constructs a new Canvas object with the given cache and sets its background
   * color to white.
   *
   * @param cache the cache to use for the canvas
   */
  public Canvas(Utils.Cache cache) {
    super();
    this.cache = cache;
    super.setBackground(Color.WHITE);
  }

  // Paint components
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    this.center = super.getWidth() / 2;

    // Draw components
    new Pages.SearchPage(this);
  }
}