import javax.swing.JFrame;

import lib.Cache;
import pages.Manager;

/**
 * The main class for the application.
 * 
 * 
 * Test students:
 * 1. wilcock, gary
 * 2. simpson, tristan
 * 
 * 
 */
class Main {
  public static void main(String[] args) {
    // Initialize a new JFrame
    JFrame frame = new JFrame("Report Card Pro");

    // Initialize the cache
    Cache cache = new Cache();

    // Init page manager
    new Manager(frame, cache);

    // Set the UI Parameters
    frame.setSize(400, 400);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}