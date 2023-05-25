import java.awt.BorderLayout;

import javax.swing.JFrame;

import Pages.Manager;
import Utils.Cache;

/**
 * The main class for the application.
 */
class Main {
  public static void main(String[] args) {
    // Initialize a new JFrame
    JFrame frame = new JFrame("Report Card Pro");

    // Initialize the cache
    Cache cache = new Cache();

    // Init manager
    new Manager(frame, cache);

    // Set the UI Parameters
    frame.setSize(400, 400);
    frame.setLayout(new BorderLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setResizable(false);
  }
}