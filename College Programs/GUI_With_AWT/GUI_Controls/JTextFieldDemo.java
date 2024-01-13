import javax.swing.*;

public class JTextFieldDemo extends JFrame {

  JTextFieldDemo() {
    setTitle("JTextField Demo");
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel lFname = new JLabel("First Name");
    lFname.setBounds(10, 20, 100, 10);

    JTextField fname = new JTextField("abc", 20);
    // JTextField fname = new JTextField("abc");
    // JTextField fname = new JTextField(20);
    fname.setBounds(100, 20, 100, 20);

    JLabel lpassword = new JLabel("Password");
    lpassword.setBounds(10, 50, 100, 10);

    JPasswordField password = new JPasswordField("This is password", 20);
    // JPasswordField password = new JPasswordField("This is password");
    // JPasswordField password = new JPasswordField(20);
    password.setBounds(100, 50, 100, 20);

    JLabel lmessage = new JLabel("Message");
    lmessage.setBounds(10, 80, 80, 20);

    JTextArea message = new JTextArea("Write some message here");
    message.setBounds(100, 80, 200, 100);

    add(lFname);
    add(fname);
    add(password);
    add(lpassword);
    add(lmessage);
    add(message);

    setLayout(null);
    setVisible(true);
  }

  public static void main(String[] args) {
    new JTextFieldDemo();
  }
}
