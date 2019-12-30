package MVCDemo;

import javax.swing.SwingUtilities;

public class SwingMVCDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                createAndShowGUI();
            } catch (Exception e) {
            }
        });
    }

    public static void createAndShowGUI() throws Exception {
        new View();
    }
}
