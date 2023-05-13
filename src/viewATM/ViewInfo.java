package viewATM;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ViewInfo extends JPanel {

    /**
     * Create the panel.
     */
    public ViewInfo(String message) {
        setSize(336, 245);
        setLayout(null);

        JLabel lblNewLabel = new JLabel(message);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNewLabel.setBounds(41, 57, 231, 78);
        add(lblNewLabel);
    }

}
