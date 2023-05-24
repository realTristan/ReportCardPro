package Pages;

import Components.Canvas;

public class SearchPage {
	public SearchPage(Canvas canvas) {
		// Text headers
		Components.Text.drawMainHeader(canvas);
		Components.Text.drawSearchHeader(canvas);
		Components.Text.drawFooter(canvas);

		// Search Bar
		Components.Search.drawBar(canvas, 110, 105);
	}
}
