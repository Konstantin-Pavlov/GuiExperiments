import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lol {
    public static void main(String[] args) {

        // Create a JFrame object
        JFrame frame = new JFrame("самая полезная в мире программа");

        // Create a JPanel for the center area
        JPanel centerPanel = new JPanel(new GridBagLayout());

        // Create a JPanel for the bottom area
        JPanel bottomPanel = new JPanel(new BorderLayout());

        // Create a JLabel object
        JLabel label = new JLabel("<html><center>Внимание!<br> \r\n" + //
                "У вас варятся пельмени.<br> \r\n" + //
                "Отравитесь от экрана и сходите на кухню, пока они не переварились.</center></html>");

        // Create GridBagConstraints to manage component positioning
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.fill = GridBagConstraints.CENTER;

        label.setHorizontalAlignment(JButton.CENTER);
        label.setVerticalAlignment(JButton.CENTER);

        // Create two JButton objects
        JButton button1 = new JButton("Выход");
        JButton button2 = new JButton("Тоже выход");

        // Add an ActionListener to the button
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display a confirmation dialog
                int choice = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION);

                if (choice == JOptionPane.YES_OPTION) {
                    // Exit the application
                    System.exit(0);
                }
            }
        });

        // Add an ActionListener to the button
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display a confirmation dialog
                int choice = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION);

                if (choice == JOptionPane.YES_OPTION) {
                    // Exit the application
                    System.exit(0);
                }
            }
        });

        // Add the label to the center panel
        centerPanel.add(label, constraints);

        // Add the buttons to the bottom panel
        bottomPanel.add(button1, BorderLayout.WEST);
        bottomPanel.add(button2, BorderLayout.EAST);

        // Set the layout manager for the frame
        frame.setLayout(new BorderLayout());

        // Add the center panel to the center area of the frame
        frame.add(centerPanel, BorderLayout.CENTER);

        // Add the bottom panel to the bottom area of the frame
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Set the size of the frame
        frame.setSize(600, 400);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);

    }

}
