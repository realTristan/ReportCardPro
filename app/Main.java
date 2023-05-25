import java.awt.BorderLayout;

import javax.swing.JFrame;

import Pages.SearchPage;
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
    SearchPage content = new SearchPage(window, cache);
    window.setContentPane(content);

    /*
    JSONObject student = (JSONObject) cache.students.get("123456789");
    StudentPage content2 = new StudentPage(window, cache, student);
    window.setContentPane(content2);
    */

    // Set the UI Parameters
    window.setSize(400, 400);
    window.setLayout(new BorderLayout());
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    window.setResizable(false);
  }
}