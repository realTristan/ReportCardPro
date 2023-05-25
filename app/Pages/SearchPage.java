package Pages;

import Components.*;
import Components.Headers.*;
import Components.Inputs.SearchInput;
import Components.Lists.ResultsList;

/**
 * A class for creating search pages.
 */
public class SearchPage {
	/**
	 * Constructs a new SearchPage object and initializes it with the necessary
	 * components.
	 *
	 * @param canvas the canvas to add the components to
	 */
	public SearchPage(Canvas canvas) {
		// Text headers
		new MainHeader(canvas);
		new SearchHeader(canvas);
		new Footer(canvas);

		// Search Bar
		ResultsList rl = new ResultsList(canvas);
		rl.setSize(300, 150);
		SearchInput si = new SearchInput(canvas);

		// Set the search input listener
		si.setListener(canvas, rl);
	}
}
