package pages.searchPage;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import pages.Manager;
import pages.searchPage.components.AddStudentButton;
import pages.searchPage.components.Footer;
import pages.searchPage.components.MainHeader;
import pages.searchPage.components.SearchHeader;
import pages.searchPage.components.search.SearchInput;
import pages.searchPage.components.search.StudentScrollPane;

/**
 * A class for creating search pages.
 */
public class SearchPage extends JPanel {
  // The search input component. We store this here so that
  // When an user is deleted, we can reset the search input
  public SearchInput searchInput;

  /**
   * Constructs a new SearchPage object.
   */
  public SearchPage() {
    super();
    super.setBackground(Color.WHITE);
  }

  /**
   * Sets the content of the search page.
   *
   * @param manager the manager to use for the search page
   */
  public void setContent(Manager manager) {
    // Text headers
    new MainHeader(manager);
    new SearchHeader(manager);
    new Footer(manager);
    new AddStudentButton(manager);

    // Search Bar
    StudentScrollPane scollPane = new StudentScrollPane(manager);
    this.searchInput = new SearchInput(manager);

    // Set the search input listener
    this.searchInput.setListener(manager, scollPane);
  }

  /**
   * Paints the components on the canvas.
   *
   * @param g the graphics object to use for painting
   */
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
  }
}
