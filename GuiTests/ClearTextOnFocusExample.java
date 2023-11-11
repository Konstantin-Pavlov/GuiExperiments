package GuiTests;
import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClearTextOnFocusExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Clear Text On Focus Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTextField textField = new JTextField("Enter text here", 20);

            // Add FocusListener to clear text on focus
            textField.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (textField.getText().equals("Enter text here")) {
                        textField.setText("");
                    }
                }

                @Override
                public void focusLost(FocusEvent e) {
                    // If you want to do something when focus is lost, you can add code here
                }
            });

            // Add MouseAdapter to select all text on mouse click
            textField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    textField.selectAll();
                }
            });

            // Add the text field to the frame
            frame.setLayout(new FlowLayout());
            frame.add(textField);

            // Set the size of the frame
            frame.setSize(300, 200);

            // Center the frame on the screen
            centerFrameOnScreen(frame);

            // Make the frame visible
            frame.setVisible(true);
        });
    }

    private static void centerFrameOnScreen(JFrame frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);
    }
}
