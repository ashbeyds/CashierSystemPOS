package pak;

import javax.swing.*;
import java.awt.*;

public class StoreIncomeFrame extends JFrame {

    public StoreIncomeFrame() {
        setTitle("Store Income");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Store Income Window", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(label, BorderLayout.CENTER);

        add(panel);
    }
}
