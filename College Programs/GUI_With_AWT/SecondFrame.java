// 3.4 Create AWT Frame by association
// Thus, we instantiate Frame Class inside our constructor here

package GUI_With_AWT;

import java.awt.*;

public class SecondFrame {

  SecondFrame() {
    // create frame here
    Frame f = new Frame("AWT Frame by Association");

    f.setSize(400, 400);
    f.setLayout(null);
    f.setVisible(true);
    f.setBackground(Color.BLUE);

    // create button
    Button button = new Button("Click me");
    button.setBounds(50, 100, 200, 50);
    button.setBackground(Color.ORANGE);

    f.add(button);
  }

  public static void main(String[] args) {
    new SecondFrame();
  }
}
