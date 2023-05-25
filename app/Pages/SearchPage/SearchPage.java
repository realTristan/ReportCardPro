package Pages.SearchPage;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import Components.Footer;
import Pages.SearchPage.Components.MainHeader;
import Pages.SearchPage.Components.ResultsList;
import Pages.SearchPage.Components.SearchHeader;
import Pages.SearchPage.Components.SearchInput;

/**
 * A class for creating search pages.
 */
public class SearchPage extends JPanel {
	public int center;

	public Utils.Cache cache;

	//
	public SearchPage(Utils.Cache cache) {
		super();

		// Set the cache
		this.cache = cache;

		// Set the background color
		super.setBackground(Color.WHITE);
	}

	// Paint components
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Set the center width
		this.center = super.getWidth() / 2;

		// Text headers
		new MainHeader(this);
		new SearchHeader(this);
		new Footer(this);

		// Search Bar
		ResultsList rl = new ResultsList(this);
		rl.setSize(300, 150);
		SearchInput si = new SearchInput(this);

		// Set the search input listener
		si.setListener(this, rl);
	}
}
