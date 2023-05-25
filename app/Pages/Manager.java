package Pages;

import javax.swing.JFrame;

import Pages.SearchPage.SearchPage;
import Pages.StudentPage.StudentPage;

public class Manager {
    public SearchPage searchPage;
    public StudentPage studentPage;
    public Utils.Cache cache;
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
        this.studentPage = new StudentPage();
        this.studentPage.setContent(this);

        // Set the content pane
        this.searchPage = new SearchPage();
        this.searchPage.setContent(this);
        this.frame.setContentPane(this.searchPage);
    }

    public void toSearchPage() {
        this.searchPage.setVisible(true);
        this.studentPage.setVisible(false);
        this.frame.setContentPane(this.searchPage);
    }

    public void toStudentPage() {
        this.studentPage.setVisible(true);
        this.searchPage.setVisible(false);
        this.frame.setContentPane(this.studentPage);
    }
}
