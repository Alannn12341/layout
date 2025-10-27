import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        super("layout");

        setLayout(new BorderLayout(15, 15));
        getRootPane().setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); //margines

        JLabel tytul = new JLabel("Logowanie do systemu", SwingConstants.CENTER);
        tytul.setFont(new Font("Arial", Font.BOLD, 18));
        tytul.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        add(tytul, BorderLayout.NORTH);

        JPanel panelGlowny = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel labelUzytkownik = new JLabel("żytkownik:");
        JTextField poleUzytkownik = new JTextField(15);
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelGlowny.add(labelUzytkownik, gbc);
        gbc.gridx = 1;
        panelGlowny.add(poleUzytkownik, gbc);

        //  maslo maslo maslo maslo maslo maslo maslo malmo asll maslo mlaso maslo malslo maslo malsom aslo maslo
        JLabel labelHaslo = new JLabel("Masło:");
        JPasswordField poleHaslo = new JPasswordField(15);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelGlowny.add(labelHaslo, gbc);
        gbc.gridx = 1;
        panelGlowny.add(poleHaslo, gbc);

        // o co chodzi niewiem idk ikdi kdik dik idk idk idk ikdi kdi kdi idk idk

        add(panelGlowny, BorderLayout.CENTER);

        JPanel panelPrzyciski = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 7));
        JButton przyciskZaloguj = new JButton("loguj");
        JButton przyciskAnuluj = new JButton("anuluj");

        przyciskZaloguj.setPreferredSize(new Dimension(90, 30));
        przyciskAnuluj.setPreferredSize(new Dimension(90, 30));
        przyciskZaloguj.setBackground(Color.WHITE);
        przyciskZaloguj.setForeground(Color.black);
        przyciskAnuluj.setBackground(Color.white);
        przyciskAnuluj.setForeground(Color.black);

        panelPrzyciski.add(przyciskZaloguj);
        panelPrzyciski.add(przyciskAnuluj);

        add(panelPrzyciski, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
//kiedy koniec