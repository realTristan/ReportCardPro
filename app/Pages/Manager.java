package Pages;

import javax.swing.JFrame;

import Pages.SearchPage.SearchPage;
import Pages.StudentPage.StudentPage;

/**
 * A class for managing pages.
 */
public class Manager {
  public SearchPage searchPage;
  public StudentPage studentPaged;
  public Lib.StudentsCache cache;
  public JFrame frame;

  /**
   * Constructs a new Manager object.
   *
   * @param frame the frame to use for the manager
   * @param cache the cache to use for the manager
   */
  public Manager(JFrame frame, Lib.StudentsCache cache) {
    this.cache = cache;
    this.frame = frame;
    this.setSearchPage();
  }

  /**
   * Removes the search page from the content pane.
   */
  private void setSearchPage() {
    this.searchPage = new SearchPage();
    this.searchPage.setContent(this);
    this.frame.setContentPane(this.searchPage);
  }

  /**
   * Adds the student page to the content pane.
   */
  public void openStudentPage(String id, String name) {
    StudentPage studentPage = new StudentPage(id, name);
    studentPage.setContent(this);
  }
}
