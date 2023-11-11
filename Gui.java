import javax.swing.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gui extends JFrame {
    private JTextField timeField;
    private JButton startButton;
    private JButton exitButton;
    private Timer timer;
    private int remainingTime;

    public Gui() {
        setTitle("Обратный отсчет");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new java.awt.FlowLayout());

        timeField = new JTextField(20);
        startButton = new JButton("Старт");
        exitButton = new JButton("выход");

        add(timeField);
        add(startButton);
        add(exitButton);

        centerFrameOnScreen(this);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startCountdown();
            }
        });

        // Add an ActionListener to the button
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display a confirmation dialog
                int choice = JOptionPane.showConfirmDialog(new Gui(), "Are you sure you want to exit?",
                        "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION);

                if (choice == JOptionPane.YES_OPTION) {
                    // Exit the application
                    System.exit(0);
                }
            }
        });

        // when click in JTextField, delete text in the JTextField
        timeField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                timeField.setText("");
            }
        });

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remainingTime--;
                if (remainingTime >= 0) {
                    timeField.setText(Integer.toString(remainingTime));
                } else {
                    timer.stop();
                    setVisible(true);
                    timeField.setText("Время вышло!");
                }
            }
        });

    }

    private void startCountdown() {
        try {
            remainingTime = Integer.parseInt(timeField.getText());
            timer.start();
            setVisible(false);
        } catch (NumberFormatException ex) {
            timeField.setText("Введите корректное время");
            JOptionPane.showMessageDialog(this, "Invalid text entered.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void centerFrameOnScreen(JFrame frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Gui app = new Gui();
                app.setVisible(true);
            }
        });
    }
}
