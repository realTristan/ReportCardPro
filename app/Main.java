import java.awt.BorderLayout;

import javax.swing.JFrame;

import Pages.SearchPage.SearchPage;
import Pages.StudentPage.StudentPage;
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

    // Init pages
    SearchPage searchPage = new SearchPage(cache);
    StudentPage studentPage = new StudentPage();

    // Set the content panes
    window.setContentPane(searchPage);

    // Set the UI Parameters
    window.setSize(400, 400);
    window.setLayout(new BorderLayout());
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    window.setResizable(false);
  }
}