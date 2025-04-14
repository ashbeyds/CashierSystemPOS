package pak;

import javax.swing.*;
import java.awt.*;

public class StockMonitoringFrameDontInclude extends JFrame {

    public StockMonitoringFrameDontInclude() {
        setTitle("Stock Monitoring");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Stock Monitoring Window", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(label, BorderLayout.CENTER);

        add(panel);
    }
}
