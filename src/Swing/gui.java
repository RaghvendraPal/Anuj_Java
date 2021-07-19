package Swing;

import javax.swing.*;

//class gui{
//    public static void main(String args[]){
//        JFrame frame = new JFrame("My First GUI");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300,300);
//        JButton button = new JButton("Press");
//        frame.getContentPane().add(button); // Adds Button to content pane of frame
//        frame.setVisible(true);
//    }
//}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gui {
    static JButton send;
    static JTextField tf;
    static JLabel label2;
    public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Width : "+dim.width+ "Height + "+dim.height);
        System.out.println("Frame Width : "+frame.getSize().width+" Frame Height : "+frame.getSize().height);
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);

//        frame.setLocationRelativeTo(null);
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//
//        frame.setSize(screenSize.width, screenSize.height);
        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

        JMenuItem m33 = new JMenuItem("Open 1");
        JMenuItem m44 = new JMenuItem("Save as1");
        m2.add(m33);
        m2.add(m44);


        JPanel panel1 = new JPanel();
        JButton center1 = new JButton("Send");
        label2 = new JLabel("Print Text");
        center1.setSize(200, 200);
        center1.setLocation(dim.width/2 - center1.getWidth()/2, 0);
        panel1.setBackground(Color.darkGray);
        panel1.add(center1);
        panel1.add(label2);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        tf = new JTextField(20); // accepts upto 10 characters
        tf.setSize(20,20);
        send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.setBackground(Color.BLUE);
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
//
//        // Text Area at the Center
//        JTextArea ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(panel1);
//        frame.getContentPane().add(BorderLayout.CENTER, ta);

        frame.getContentPane().setBackground(Color.BLUE);
        frame.pack();
        frame.setVisible(true);
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label2.setText(tf.getText());
            }
        });

    }

}