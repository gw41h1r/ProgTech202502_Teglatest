import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeglatestGUI extends JFrame {

    // szövegmezők
    private JTextField aField, bField, cField;
    private JLabel felszinLabel, terfogatLabel;

    public TeglatestGUI() {
        // ablakcím
        setTitle("Téglatest kalkulátor");

        // méret
        setSize(300, 250);

        // bezárkilép
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // középre igazitja
        setLocationRelativeTo(null);

        // 6sor 2oszlop
        JPanel panel = new JPanel(new GridLayout(6, 2, 5, 5));

        // értékmezők
        panel.add(new JLabel("A oldal - szélesség:"));
        aField = new JTextField();
        panel.add(aField);

        panel.add(new JLabel("B oldal - mélység:"));
        bField = new JTextField();
        panel.add(bField);

        panel.add(new JLabel("C oldal - magasság:"));
        cField = new JTextField();
        panel.add(cField);

        // gomb
        JButton calcButton = new JButton("Számítsd ki!");
        panel.add(calcButton);

        // Eeredmények
        felszinLabel = new JLabel("Felszín: ");
        panel.add(felszinLabel);

        terfogatLabel = new JLabel("Térfogat: ");
        panel.add(terfogatLabel);

      
        add(panel);

        // Gomb eseménykezelő
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // oldalak bekérése
                    int a = Integer.parseInt(aField.getText());
                    int b = Integer.parseInt(bField.getText());
                    int c = Integer.parseInt(cField.getText());

                    // téglatest létrehozás
                    Teglatest t = new Teglatest(a, b, c);

                    // eredmény print
                    felszinLabel.setText("Felszín: " + t.getFelszin());
                    terfogatLabel.setText("Térfogat: " + t.getTerfogat());

                } catch (NumberFormatException ex) {
                    // Ha nem ad meg számot
                    JOptionPane.showMessageDialog(null, "Kérlek, csak egész számokat adj meg!");
                }
            }
        });
    }

    // main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TeglatestGUI().setVisible(true);
        });
    }
}
