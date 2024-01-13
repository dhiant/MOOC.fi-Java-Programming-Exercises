package GUI_With_AWT.Menu;

// program to demonstrate the use of check-box, radio-buttons in menuitem

import javax.swing.*;

public class CheckBoxAndButtonsInMenu extends JFrame {

  CheckBoxAndButtonsInMenu() {
    setTitle("CheckBox and Buttons in Menu");
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();

    JMenuBar mb = new JMenuBar();

    JMenu menu = new JMenu("Menu");

    JMenuItem item1 = new JMenuItem("item1");
    JCheckBoxMenuItem checkboxItem = new JCheckBoxMenuItem("Check box");
    JRadioButtonMenuItem male = new JRadioButtonMenuItem("Male");
    JRadioButtonMenuItem female = new JRadioButtonMenuItem("Female");

    ImageIcon icon = new ImageIcon("./icon1.png");
    JMenuItem item2 = new JMenuItem("item 2", icon);

    ButtonGroup gender = new ButtonGroup();
    gender.add(male);
    gender.add(female);
    male.setSelected(true);

    menu.add(item1);
    menu.add(item2);
    menu.add(checkboxItem);
    menu.add(male);
    menu.add(female);

    mb.add(menu);

    panel.add(mb);

    add(panel);

    // setLayout(new BorderLayout());
    setVisible(true);
  }

  public static void main(String[] args) {
    new CheckBoxAndButtonsInMenu();
  }
}
