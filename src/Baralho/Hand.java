package Baralho;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;


import static javax.swing.UIManager.getString;

public class Hand {
    public static void main(String[] args) {




        SwingUtilities.invokeLater(() -> {
            //lembrar de mudar para <Card>
            Set<String> selectedCards = new HashSet<>();
            Deck deck = new Deck();
            JButton button = new JButton();
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            int hand_capacity = 7;
            final int selection = 5;
            final Color defaultColor = Color.lightGray;

            frame.setSize(600,600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("teste");
            frame.setLayout(new BorderLayout());
            Card[] card = new Card[hand_capacity];

            panel.setBorder(new EmptyBorder(0,60,50,60));

            deck.shuffle();
            Border defaultBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
            Border selectedBorder = BorderFactory.createDashedBorder(Color.BLACK, 15,3);

            for (int i = 0; i < hand_capacity; ++i) {
                card[i] = deck.dealCard();
                button = new JButton();

                button.setBackground(defaultColor);
                button.setBorder(defaultBorder);

                button.setText(card[i].toString());
                button.addActionListener(e -> {
                    JButton clickedButton = (JButton) e.getSource();
                        System.out.println(selectedCards.size());

                        if (clickedButton.getBackground() == defaultColor && clickedButton.getBorder() == defaultBorder && selectedCards.size()<selection) {
                            selectedCards.add(clickedButton.getText());
                            clickedButton.setBackground(Color.decode("#c5fced"));
                            clickedButton.setBorder(selectedBorder);
                            System.out.println(selectedCards);
                        }
                        else {
                            selectedCards.remove(clickedButton.getText());
                            clickedButton.setBackground(defaultColor);
                            clickedButton.setBorder(defaultBorder);
                            System.out.println(selectedCards);
                        }
                });

                button.setPreferredSize(new Dimension(170,220));
                panel.add(button);

            }

            frame.add(panel, BorderLayout.SOUTH );




            frame.setVisible(true);



        });

    }

}
