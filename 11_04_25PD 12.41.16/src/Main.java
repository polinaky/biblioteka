import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main extends JFrame {
    private JPanel jforma;
    private JTextField textField1;
    private JButton clickMeButton;
    private JLabel gramatas;

    Main() {
        setTitle("Gramatas");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setContentPane(jforma); 

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText();
                if (name.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(Main.this, "Lūdzu, ievadi savu vārdu!");
                    return;
                }

                try {
                    String ageStr = JOptionPane.showInputDialog(Main.this, "Ievadiet savu vecumu:");
                    if (ageStr == null) return;
                    int age = Integer.parseInt(ageStr);

                    String genreInput = JOptionPane.showInputDialog(Main.this, "Ievadiet žanru (Romance, Horror, Historical, Detective):");
                    if (genreInput == null) return;

                    String budgetStr = JOptionPane.showInputDialog(Main.this, "Ievadiet savu budžetu:");
                    if (budgetStr == null) return;
                    int budget = Integer.parseInt(budgetStr);

                    StringBuilder result = new StringBuilder("Sveiks, " + name + "!\n\nIeteiktas grāmatas:\n\n");
                    boolean found = false;

                    for (Book book : Book.getTreatments()) {
                        String genre = book.getClass().getSimpleName();
                        boolean ageOK = age >= book.getMinAge();
                        boolean genreOK = genre.equalsIgnoreCase(genreInput);
                        boolean priceOK = book.getPrice() <= budget;

                        if (ageOK && genreOK && priceOK) {
                            result.append(book).append("\n✅ Atbilst visiem kritērijiem!\n\n");
                            found = true;
                        }
                    }

                    if (!found) {
                        result.append("❌ Nav atrastas grāmatas, kas atbilst visiem kritērijiem.");
                    }

                    JOptionPane.showMessageDialog(Main.this, result.toString());

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Main.this, "Lūdzu, ievadiet derīgus skaitļus!", "Kļūda", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }


    public static void main(String[] args) {

        Romance p1 = new Romance("Boba", 10, "Polina", true, 18, 2023, 15, 1);
        Historical t1 = new Historical("Avrora", 150, "Viola Tjf", true, 10, 2020, 10, 21);
        Horror p2 = new Horror("Knopa", 50, "Andris Kuljfk", true, 16, 2017, 8, 10);
        Detective c1 = new Detective("Artis", 290, "Alisa Jacenuka", true, 14, 2018, 20, "frenetic");
        Romance r2 = new Romance("Love Story", 200, "Polina", true, 16, 2024, 18, 3);
        Historical h2 = new Historical("History of Europe", 350, "Polina", true, 4, 2022, 25, 18);
        Horror h3 = new Horror("The Dark Night", 120, "Andris Kuljfk", true, 5, 2019, 12, 15);

        Book.writeFile();

        new Main();
        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║     📚 LAIPNI LŪGTI PROGRAMMĀ!    ║");
        System.out.println("║   Grāmatu ieteikumu sistēma  📖   ║");
        System.out.println("╠═══════════════════════════════════╣");
        System.out.println("║ 👤 Ievadi savu vārdu logā         ");
        System.out.println("║ 📅 Norādi savu vecumu             ");
        System.out.println("║ 🧭 Izvēlies žanru                 ");
        System.out.println("║ 💰 Norādi budžetu                ");
        System.out.println("║                                   ");
        System.out.println("║ 📘 Saņem personalizētus ieteikumus!");
        System.out.println("╚═══════════════════════════════════╝\n");
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}