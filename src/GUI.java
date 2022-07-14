import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    public JLabel label;
    protected JFrame frame;
    protected JPanel panel;
    protected JButton button1;
    protected JButton button2;
    protected JButton button3;
    protected JButton button4;
    protected JButton button5;
    protected JButton button6;


    public GUI() {
        frame = new JFrame();

        button1 = new JButton("next song");
        button1.addActionListener(this);
        button2 = new JButton("previous song");
        button2.addActionListener(this);
        button3 = new JButton("replay");
        button3.addActionListener(this);
        button4 = new JButton("list of all songs");
        button4.addActionListener(this);
        button5 = new JButton("delete current song");
        button5.addActionListener(this);
        button6 = new JButton("QUIT");
        button6.addActionListener(this);
        label = new JLabel("Playing: ");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(5, 2));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Music Player");
        frame.pack();
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();
        if (button1.equals(source)) {
            label.setText("button1");
        } else if (button2.equals(source)) {
            label.setText("button2");
        } else if (button3.equals(source)) {
            label.setText("button3");
        } else if (button4.equals(source)) {
            label.setText("button4");
        } else if (button5.equals(source)) {
            label.setText("button5");
        } else if (button6.equals(source)) {
            label.setText("button6");
        }

    }

}
