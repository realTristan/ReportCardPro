import java.awt.BorderLayout;

import javax.swing.JFrame;

import Components.Canvas;
import Utils.Cache;

/**
 * The main class for the application.
 */
class Main {
  public static void main(String[] args) {
    // Initialize a new JFrame
    JFrame window = new JFrame("Report Card Pro");

    // Initialize the cache
    Cache cache = new Cache();

    // Establish Canvas
    Canvas content = new Canvas(cache);
    window.setContentPane(content);

    // Set the UI Parameters
    window.setSize(400, 400);
    window.setLayout(new BorderLayout());
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    window.setResizable(false);
  }
}