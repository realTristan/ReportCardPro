package Pages;

import javax.swing.JFrame;

import Pages.SearchPage.SearchPage;
import Pages.StudentPage.StudentPage;

/*
 * Instead of switching pages, just make the home window the search,
 * and when the user clicks on the student, it will make a new window
 * for that student. This way, we don't have to worry about switching
 * pages, and we can just make a new window for each student. And we
 * can make the student page a JFrame and not a JPanel.
 */

/**
 * A class for managing pages.
 */
public class Manager {
    // The pages
    public SearchPage searchPage;
    public StudentPage studentPage;

    // The cache
    public Utils.StudentCache cache;

    // The frame
    public JFrame frame;

    /**
     * Constructs a new Manager object.
     *
     * @param frame the frame to use for the manager
     * @param cache the cache to use for the manager
     */
    public Manager(JFrame frame, Utils.StudentCache cache) {
        this.cache = cache;
        this.frame = frame;

        // Set the content pane
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
    public void openStudentPage(String id) {
        this.studentPage = new StudentPage(id);
        this.studentPage.setContent(this);
    }
}
