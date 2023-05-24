package Pages;

import Components.*;
import Components.Headers.*;
import Components.Inputs.SearchInput;
import Components.Lists.ResultsList;

public class SearchPage {
	public SearchPage(Canvas canvas) {
		// Text headers
		new MainHeader(canvas);
		new SearchHeader(canvas);
		new Footer(canvas);

		// Search Bar
		ResultsList rl = new ResultsList(canvas, 40, 150, 300, 150);
		SearchInput si = new SearchInput(canvas, 100, 100);

		// Set the search input listener
		si.setListener(canvas, rl);
	}
}
