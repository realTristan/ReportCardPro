package pages;

import javax.swing.JFrame;

import pages.searchPage.SearchPage;
import pages.studentPage.StudentPage;

/**
 * A class for managing pages.
 */
public class Manager {
  // The search page component
  public SearchPage searchPage;

  // The cache of students
  public lib.StudentsCache cache;

  // The main frame to use for the manager
  public JFrame frame;

  /**
   * Constructs a new Manager object.
   *
   * @param frame the frame to use for the manager
   * @param cache the cache to use for the manager
   */
  public Manager(JFrame frame, lib.StudentsCache cache) {
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
