package GUI_With_AWT.Menu;

import javax.swing.*;

// simple program to create menubar, menus, menu-items

public class MenuDemo extends JFrame {

  MenuDemo() {
    setTitle("JMenu Demo");
    setSize(400, 400);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // create menu bar
    JMenuBar mb = new JMenuBar();
    // set the position & size of menu bar
    mb.setBounds(10, 10, 60, 20);

    // create menus
    JMenu m1 = new JMenu("Menu 1");
    JMenu m2 = new JMenu("Menu 2");

    // create menu items
    JMenuItem item1 = new JMenuItem("item 1");
    JMenuItem item2 = new JMenuItem("item 2");
    JMenuItem item3 = new JMenuItem("item 3");
    JMenuItem item4 = new JMenuItem("item 4");
    JMenuItem item5 = new JMenuItem("item 5");

    // add menu items to corresponding menus
    m1.add(item1);
    m1.add(item2);
    m1.add(item3);

    m2.add(item4);
    m2.add(item5);

    // add menu2 to menu1
    m1.add(m2);

    // add menu1 to menubar
    mb.add(m1);

    // add menubar to frame
    add(mb);

    setVisible(true);
  }

  public static void main(String[] args) {
    new MenuDemo();
  }
}
