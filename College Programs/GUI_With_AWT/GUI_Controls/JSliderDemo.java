import javax.swing.*;

public class JSliderDemo extends JFrame {

  JSliderDemo() {
    setTitle("JSlider Demo");
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);

    JLabel label = new JLabel("Select a value:");
    label.setBounds(10, 10, 130, 20);
    add(label);

    JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 5);
    slider.setBounds(150, 10, 300, 20);
    add(slider);

    setVisible(true);
  }

  public static void main(String[] args) {
    new JSliderDemo();
  }
}
