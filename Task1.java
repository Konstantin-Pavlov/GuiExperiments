import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class Task1 {
    public static void main(String[] args) {
        // Create a JFrame object
        JFrame frame = new JFrame("Center Label with Buttons Frame");

        // Create a JPanel for the center area
        JPanel centerPanel = new JPanel(new GridBagLayout());

        // Create a JLabel object
        JLabel label = new JLabel("Center Label");

        // Create GridBagConstraints to manage component positioning
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.fill = GridBagConstraints.CENTER;

        // Add the label to the center panel
        centerPanel.add(label, constraints);

        // Create a JPanel for the bottom area
        JPanel bottomPanel = new JPanel(new BorderLayout());

        // Create two JButton objects
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

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
        frame.setSize(300, 200);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
