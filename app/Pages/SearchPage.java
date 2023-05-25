package Pages;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import Components.*;
import Components.Headers.*;
import Components.Inputs.SearchInput;
import Components.Lists.ResultsList;

/**
 * A class for creating search pages.
 */
public class SearchPage extends Canvas {
  // The cache variable
  public Utils.Cache cache;

  // The center width
  public int center;

  /**
   * Constructs a new SearchPage object and initializes it with the necessary
   * components.
   * 
   * @param cache the cache to use for the page
   */
  public SearchPage(JFrame frame, Utils.Cache cache) {
    super(frame, cache);

    // Set the cache
    this.cache = cache;

    // Set the background color
    super.setBackground(Color.WHITE);

    // Set the content pane
    // super.frame.setContentPane(this);
  }

  /**
   * Paints the components on the canvas.
   * 
   * @param canvas the canvas to add the components to
   */
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Set the center width
    this.center = super.getWidth() / 2;

    // Text headers
    new MainHeader(this);
    new SearchHeader(this);
    new Footer(this);

    // Search Bar
    ResultsList rl = new ResultsList(this);
    rl.setSize(300, 150);
    SearchInput si = new SearchInput(this);

    // Set the search input listener
    si.setListener(this, rl);
  }
}
