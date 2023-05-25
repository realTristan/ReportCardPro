package Pages;

import javax.swing.JFrame;

import Pages.SearchPage.SearchPage;
import Pages.StudentPage.StudentPage;

/**
 * A class for managing pages.
 */
public class Manager {
    // The pages
    public SearchPage searchPage;
    public StudentPage studentPage;

    // The cache
    public Utils.Cache cache;

    // The frame
    public JFrame frame;

    /**
     * Constructs a new Manager object.
     *
     * @param frame the frame to use for the manager
     * @param cache the cache to use for the manager
     */
    public Manager(JFrame frame, Utils.Cache cache) {
        this.cache = cache;
        this.frame = frame;

        // Set the content pane
        this.setStudentPage();

        // Set the content pane
        this.setSearchPage();
    }

    /**
     * Removes the search page from the content pane.
     */
    public void setSearchPage() {
        this.searchPage = new SearchPage();
        this.searchPage.setContent(this);
        this.frame.setContentPane(this.searchPage);
    }

    /**
     * Adds the student page to the content pane.
     */
    public void setStudentPage() {
        this.studentPage = new StudentPage();
        this.studentPage.setContent(this);
        this.frame.setContentPane(this.studentPage);
    }

    /**
     * Hide the student page from the content pane.
     */
    public void hideStudentPage() {
        this.studentPage.setVisible(false);
    }

    /**
     * Hide the search page from the content pane.
     */
    public void hideSearchPage() {
        this.searchPage.setVisible(false);
    }

    /**
     * Show the student page from the content pane.
     */
    public void showStudentPage() {
        this.studentPage.setVisible(true);
        this.frame.setContentPane(this.studentPage);
    }

    /**
     * Show the student page from the content pane.
     */
    public void showSearchPage() {
        this.searchPage.setVisible(true);
        this.frame.setContentPane(this.searchPage);
    }

    /**
     * Switches the content pane to the search page and makes it visible.
     */
    public void toSearchPage() {
        this.hideStudentPage();
        this.showSearchPage();
    }

    /**
     * Switches the content pane to the student page and makes it visible.
     */
    public void toStudentPage() {
        this.hideSearchPage();
        this.showStudentPage();
    }
}
