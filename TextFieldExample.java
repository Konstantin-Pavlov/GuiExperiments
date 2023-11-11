import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TextFieldExample extends JFrame {
    private JTextField textField;

    public TextFieldExample() {
        setTitle("Text Field Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(20);
        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField.setText("");
            }
        });

        getContentPane().add(textField);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TextFieldExample example = new TextFieldExample();
            example.setVisible(true);
        });
    }
}
