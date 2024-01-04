// 3.4 Create AWT Frame by inheritance
// Thus, we are extending Frame Class here

package GUI_With_AWT;

import java.awt.*;

class FirstFrame extends Frame {

  FirstFrame() {
    // these methods are defined in Frame Class which we are extending above.
    // title of frame
    setTitle("First AWT Application");
    // frame size
    setSize(400, 250);
    setVisible(true);
    setLayout(null);
    setBackground(Color.BLUE);

    // create button
    Button button = new Button("Click me.");
    // button position and width/height
    button.setBounds(30, 100, 80, 30);
    button.setBackground(Color.CYAN);

    // add button to frame
    add(button);
  }

  public static void main(String[] args) {
    // Create a frame object and make it visible to the user
    new FirstFrame();
  }
}
