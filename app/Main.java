import javax.swing.JFrame;

import Components.Canvas;
import Utils.Cache;

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
    window.setLayout(null);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    window.setResizable(false);
  }
}