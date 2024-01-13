// JComboBox is similar to HTML Select tag
// It displays a drop-down list of items for the user to select from.

import javax.swing.*;

public class JComboBoxDemo extends JFrame {

  JComboBoxDemo() {
    setTitle("JComboBox Demo");
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);

    JLabel label = new JLabel("Select your fav programming languge");
    label.setBounds(10, 20, 100, 10);
    add(label);

    String languages[] = { "C", "C++", "Java", "Javascript" };
    JComboBox<String> comboBox = new JComboBox<>(languages);
    comboBox.setBounds(100, 20, 80, 20);

    add(comboBox);

    setVisible(true);
  }

  public static void main(String[] args) {
    new JComboBoxDemo();
  }
}
