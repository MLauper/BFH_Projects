package ch.bfh.ti.emailaddr2png;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class EmailToPngGui {

    public static void main(String args[]) throws IOException {

        //jframe
        JFrame frame = new JFrame("E-Mail to PNG");
        frame.setSize(330, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);  //open Form in center

        //components
        JMenuBar bar = new JMenuBar();
        JPanel panel = new JPanel(new BorderLayout());
        JButton button = new JButton("generate PNG");
        final JTextField textField = new JTextField(50);
        JLabel label = new JLabel("Please enter your email-address below:");

        panel.add(label, BorderLayout.PAGE_START);
        panel.add(textField, BorderLayout.CENTER);
        panel.add(button, BorderLayout.PAGE_END);

        frame.setJMenuBar(bar);
        frame.add(panel);
        frame.setVisible(true);


        //link generatebutton to filechooser and imagegenerator
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                JFileChooser savefile = new JFileChooser();
                savefile.setDialogTitle("Specify a file to save");

                int userSelection = savefile.showSaveDialog(null);
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = savefile.getSelectedFile();

                    String filepath = fileToSave.getPath();
                    String email = textField.getText();
                    int length = email.length() * 12 + 30;

                    //call imagegenerator
                    CreateImage i = new CreateImage();
                    try {
                        i.generate(email, filepath, length);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    //message to user
                    JOptionPane.showMessageDialog(null, "Your PNG has been created!", "PNG successfully created", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
