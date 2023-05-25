package Components;

import javax.swing.*;

/**
 * A class for creating canvases.
 */
public class Canvas extends JPanel {
  public Utils.Cache cache;
  public int center;
  public JFrame frame;

  /**
   * Constructs a new Canvas object with the given cache and sets its background
   * color to white.
   *
   * @param cache the cache to use for the canvas
   */
  public Canvas(JFrame frame, Utils.Cache cache) {
    super();

    // Set the cache
    this.cache = cache;
    this.frame = frame;
  }
}