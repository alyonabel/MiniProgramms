import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class PrintFile extends JFrame {

    PrintFile() {

        JFrame okno = new JFrame();
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEADING));

        JTextField field_dir = new JTextField("File name", 30);
        container.add(field_dir);

        JButton opendir = new JButton("Open file");
        container.add(opendir);

        JTextArea textarea = new JTextArea(40, 50);
        container.add(textarea);
        textarea.setLineWrap(true);

        JFileChooser fileChooser = new JFileChooser();

        opendir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                fileChooser.setDialogTitle("Directory");

                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int result = fileChooser.showOpenDialog(PrintFile.this);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();

                    try {
                        BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                        textarea.read(input, "Reading file");
                        field_dir.setText(fileChooser.getSelectedFile().getAbsolutePath());
                    } catch (Exception e1) {
                        System.out.println("File isn't readable");
                    }
                } else {
                    System.out.println("Operation is Canceled");

                }
            }
        });

        field_dir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                fileChooser.setDialogTitle("Directory");


                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int result = fileChooser.showOpenDialog(PrintFile.this);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();

                    try {
                        BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                        textarea.read(input, "Reading file");
                        field_dir.setText(fileChooser.getSelectedFile().getAbsolutePath());
                        fileChooser.setCurrentDirectory(file);
                    } catch (Exception e1) {
                        System.out.println("File isn't readable");
                    }
                } else {
                    System.out.println("Operation is Canceled");

                }
            }

        });

    }
}