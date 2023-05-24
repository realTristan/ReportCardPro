package Components;

import java.awt.*;
import javax.swing.*;

/**
 * A class for creating canvases.
 */
public class Canvas extends JPanel {
  public Utils.Cache cache;

  /**
   * Constructs a new Canvas object with the given cache and sets its background
   * color to white.
   *
   * @param cache the cache to use for the canvas
   */
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