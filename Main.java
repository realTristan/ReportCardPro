import javax.swing.JFrame;

class Main {
    public static void main(String[] args) {
        // Initialize a new JFrame
        JFrame window = new JFrame("Report Card Pro");

        // Establish Canvas
        Canvas content = new Canvas();
        window.setContentPane(content);

        // Set the UI Parameters
        window.setSize(400, 400);
        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}