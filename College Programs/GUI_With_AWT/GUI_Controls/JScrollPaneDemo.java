import java.awt.*;
import javax.swing.*;

public class JScrollPaneDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame("JScrollPane Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);

    // Create a panel
    JPanel panel = new JPanel();

    // Create a text area
    JTextArea textArea = new JTextArea("This is the default message", 50, 50);

    // Create a scroll pane and add the text area to it
    JScrollPane scrollPane = new JScrollPane(textArea);
    scrollPane.setPreferredSize(new Dimension(150, 150));

    // Add the scroll pane to the panel
    panel.add(scrollPane);

    // Add the panel to the frame
    frame.add(panel);

    // Make the frame visible
    frame.setVisible(true);
  }
}
