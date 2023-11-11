import java.awt.FlowLayout; //верстка элементов в окне
import java.awt.event.ActionListener; //прослушивает события - нажатие мышкой и тд
import java.awt.event.ActionEvent; //реагирует на события которые прослушивает ActionListener (нажатие на конпку и тд)
import java.util.Objects;
import javax.swing.JFrame; //само окно
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane; //всплывающее окно

//  link to the vid - https://www.youtube.com/watch?v=fG_icrKm450&list=PLOf4j-rXg4AhrQSI8TOCEg6ihMWwB9p3O&index=62

public class Button extends JFrame {
    private JButton RegBut;
    private JButton CusBut;

    public Button() {
        super("title");
        setLayout(new FlowLayout());

        RegBut = new JButton("button");
        add(RegBut);

        // Icon brd = new ImageIcon(Objects.requireNonNull(getClass().getResource("well.png")));
        // Icon s = new ImageIcon(Objects.requireNonNull(getClass().getResource("s.png")));

        CusBut = new JButton("cool btn");
        // CusBut.setRolloverIcon(s);
        add(CusBut);

        processingClass processing = new processingClass();

        RegBut.addActionListener(processing);
        CusBut.addActionListener(processing);
    }

    private class processingClass implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            
                // Display a confirmation dialog
                int choice = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure you want to exit?", "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION);

                if (choice == JOptionPane.YES_OPTION) {
                    // Exit the application
                    System.exit(0);
                }
            
        }
    }
}
