package Pages.SearchPage;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import Pages.Manager;
import Pages.SearchPage.Components.Footer;
import Pages.SearchPage.Components.MainHeader;
import Pages.SearchPage.Components.ResultsList;
import Pages.SearchPage.Components.SearchHeader;
import Pages.SearchPage.Components.SearchInput;

/**
 * A class for creating search pages.
 */
public class SearchPage extends JPanel {
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

		// Search Bar
		ResultsList rl = new ResultsList(manager);
		rl.setSize(300, 150);
		SearchInput si = new SearchInput(manager);

		// Set the search input listener
		si.setListener(manager, rl);
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
