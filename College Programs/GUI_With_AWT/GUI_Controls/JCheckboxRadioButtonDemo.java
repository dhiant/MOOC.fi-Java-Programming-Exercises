import java.awt.GridLayout;
import javax.swing.*;

public class JCheckboxRadioButtonDemo extends JFrame {

  JCheckboxRadioButtonDemo() {
    setTitle("Checkbox and RadioButton Demo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 200);

    // Create a label
    JLabel label = new JLabel("Select your preferences:");
    add(label);

    // Create checkboxes
    JCheckBox checkBox1 = new JCheckBox("Option 1");
    add(checkBox1);

    JCheckBox checkBox2 = new JCheckBox("Option 2");
    add(checkBox2);

    JCheckBox checkBox3 = new JCheckBox("Option 3");
    add(checkBox3);

    // Create radiobuttons
    JRadioButton radioButton1 = new JRadioButton("Choice 1");
    add(radioButton1);

    JRadioButton radioButton2 = new JRadioButton("Choice 2");
    add(radioButton2);

    JRadioButton radioButton3 = new JRadioButton("Choice 3");
    add(radioButton3);

    setLayout(new GridLayout(4, 2, 20, 30));
    // Create a button
    JButton button = new JButton("Submit");
    add(button);

    setVisible(true);
    // setLayout(null);

  }

  public static void main(String[] args) {
    // Create a frame to hold the checkbox and radio buttons.
    new JCheckboxRadioButtonDemo();
  }
}
