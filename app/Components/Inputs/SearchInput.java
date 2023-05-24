package Components.Inputs;

import Components.Canvas;
import Components.Lists.ResultsList;

public class SearchInput extends Input {
  public SearchInput(Canvas canvas, int x, int y) {
    super(x, y, 150, 30);
    canvas.add(this);
  }

  // Set the listener
  public void setListener(Canvas canvas, ResultsList rl) {
    SearchInput si = this;
    super.addCaretListener(e -> {
      String value = si.getText();
      rl.setStudents(canvas, value);
  });
  }
}
