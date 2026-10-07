package com.mycompany.digitafastprova;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class DigitaFastProva extends JFrame {

    JTextArea texto;
    HashMap<Integer, JButton> teclas = new HashMap<>();

    public DigitaFastProva() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }

        setTitle("Typing Application");
        setSize(980, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel principal = new JPanel(new BorderLayout(5, 5));
        principal.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        JLabel aviso = new JLabel(
            "<html>Type some text using your keybord. The keys you press will be highlited.<br>" +
            "Note: Clicking the buttons with your mouse will not preform any actions.</html>"
        );

        aviso.setFont(new Font("Arial", Font.PLAIN, 13));

        texto = new JTextArea();
        texto.setFont(new Font("Arial", Font.PLAIN, 18));
        texto.setLineWrap(true);
        texto.setWrapStyleWord(true);
        texto.setEditable(false);

        JScrollPane scroll = new JScrollPane(texto);

        JPanel teclado = new JPanel(null);
        teclado.setPreferredSize(new Dimension(940, 245));

        int y1 = 5;
        int x = 20;

        criarTecla(teclado, "`", KeyEvent.VK_BACK_QUOTE, x, y1, 55);
        x += 59;
        criarTecla(teclado, "1", KeyEvent.VK_1, x, y1, 55);
        x += 59;
        criarTecla(teclado, "2", KeyEvent.VK_2, x, y1, 55);
        x += 59;
        criarTecla(teclado, "3", KeyEvent.VK_3, x, y1, 55);
        x += 59;
        criarTecla(teclado, "4", KeyEvent.VK_4, x, y1, 55);
        x += 59;
        criarTecla(teclado, "5", KeyEvent.VK_5, x, y1, 55);
        x += 59;
        criarTecla(teclado, "6", KeyEvent.VK_6, x, y1, 55);
        x += 59;
        criarTecla(teclado, "7", KeyEvent.VK_7, x, y1, 55);
        x += 59;
        criarTecla(teclado, "8", KeyEvent.VK_8, x, y1, 55);
        x += 59;
        criarTecla(teclado, "9", KeyEvent.VK_9, x, y1, 55);
        x += 59;
        criarTecla(teclado, "0", KeyEvent.VK_0, x, y1, 55);
        x += 59;
        criarTecla(teclado, "-", KeyEvent.VK_MINUS, x, y1, 55);
        x += 59;
        criarTecla(teclado, "=", KeyEvent.VK_EQUALS, x, y1, 55);
        x += 59;
        criarTecla(teclado, "Backspace", KeyEvent.VK_BACK_SPACE, x, y1, 110);

        int y2 = 51;
        x = 20;

        criarTecla(teclado, "Tab", KeyEvent.VK_TAB, x, y2, 90);
        x += 94;
        criarTecla(teclado, "Q", KeyEvent.VK_Q, x, y2, 55);
        x += 59;
        criarTecla(teclado, "W", KeyEvent.VK_W, x, y2, 55);
        x += 59;
        criarTecla(teclado, "E", KeyEvent.VK_E, x, y2, 55);
        x += 59;
        criarTecla(teclado, "R", KeyEvent.VK_R, x, y2, 55);
        x += 59;
        criarTecla(teclado, "T", KeyEvent.VK_T, x, y2, 55);
        x += 59;
        criarTecla(teclado, "Y", KeyEvent.VK_Y, x, y2, 55);
        x += 59;
        criarTecla(teclado, "U", KeyEvent.VK_U, x, y2, 55);
        x += 59;
        criarTecla(teclado, "I", KeyEvent.VK_I, x, y2, 55);
        x += 59;
        criarTecla(teclado, "O", KeyEvent.VK_O, x, y2, 55);
        x += 59;
        criarTecla(teclado, "P", KeyEvent.VK_P, x, y2, 55);
        x += 59;
        criarTecla(teclado, "[", KeyEvent.VK_OPEN_BRACKET, x, y2, 55);
        x += 59;
        criarTecla(teclado, "]", KeyEvent.VK_CLOSE_BRACKET, x, y2, 55);
        x += 59;
        criarTecla(teclado, "\\", KeyEvent.VK_BACK_SLASH, x, y2, 70);

        int y3 = 97;
        x = 20;

        criarTecla(teclado, "Caps", KeyEvent.VK_CAPS_LOCK, x, y3, 100);
        x += 104;
        criarTecla(teclado, "A", KeyEvent.VK_A, x, y3, 55);
        x += 59;
        criarTecla(teclado, "S", KeyEvent.VK_S, x, y3, 55);
        x += 59;
        criarTecla(teclado, "D", KeyEvent.VK_D, x, y3, 55);
        x += 59;
        criarTecla(teclado, "F", KeyEvent.VK_F, x, y3, 55);
        x += 59;
        criarTecla(teclado, "G", KeyEvent.VK_G, x, y3, 55);
        x += 59;
        criarTecla(teclado, "H", KeyEvent.VK_H, x, y3, 55);
        x += 59;
        criarTecla(teclado, "J", KeyEvent.VK_J, x, y3, 55);
        x += 59;
        criarTecla(teclado, "K", KeyEvent.VK_K, x, y3, 55);
        x += 59;
        criarTecla(teclado, "L", KeyEvent.VK_L, x, y3, 55);
        x += 59;
        criarTecla(teclado, ";", KeyEvent.VK_SEMICOLON, x, y3, 55);
        x += 59;
        criarTecla(teclado, "'", KeyEvent.VK_QUOTE, x, y3, 55);
        x += 59;
        criarTecla(teclado, "Enter", KeyEvent.VK_ENTER, x, y3, 110);

        int y4 = 143;
        x = 20;

        criarTecla(teclado, "Shift", KeyEvent.VK_SHIFT, x, y4, 159);
        x += 163;

        criarTecla(teclado, "Z", KeyEvent.VK_Z, x, y4, 55);
        x += 59;
        criarTecla(teclado, "X", KeyEvent.VK_X, x, y4, 55);
        x += 59;
        criarTecla(teclado, "C", KeyEvent.VK_C, x, y4, 55);
        x += 59;
        criarTecla(teclado, "V", KeyEvent.VK_V, x, y4, 55);
        x += 59;
        criarTecla(teclado, "B", KeyEvent.VK_B, x, y4, 55);
        x += 59;
        criarTecla(teclado, "N", KeyEvent.VK_N, x, y4, 55);
        x += 59;
        criarTecla(teclado, "M", KeyEvent.VK_M, x, y4, 55);
        x += 59;
        criarTecla(teclado, ",", KeyEvent.VK_COMMA, x, y4, 55);
        x += 59;
        criarTecla(teclado, ".", KeyEvent.VK_PERIOD, x, y4, 55);
        x += 59;
        criarTecla(teclado, "?", KeyEvent.VK_SLASH, x, y4, 55);

        criarTecla(teclado, "↑", KeyEvent.VK_UP, 800, y4, 55);

        int y5 = 189;

        criarTecla(teclado, "Space", KeyEvent.VK_SPACE, 260, y5, 430);

        criarTecla(teclado, "←", KeyEvent.VK_LEFT, 741, y5, 55);
        criarTecla(teclado, "↓", KeyEvent.VK_DOWN, 800, y5, 55);
        criarTecla(teclado, "→", KeyEvent.VK_RIGHT, 859, y5, 55);

        principal.add(aviso, BorderLayout.NORTH);
        principal.add(scroll, BorderLayout.CENTER);
        principal.add(teclado, BorderLayout.SOUTH);

        add(principal);

        KeyboardFocusManager.getCurrentKeyboardFocusManager()
                .addKeyEventDispatcher(new KeyEventDispatcher() {

            public boolean dispatchKeyEvent(KeyEvent e) {

                JButton botao = teclas.get(e.getKeyCode());

                if (e.getID() == KeyEvent.KEY_PRESSED) {

                    if (botao != null) {
                        botao.setBackground(Color.LIGHT_GRAY);
                        botao.setBorder(BorderFactory.createLoweredBevelBorder());
                    }
                }

                if (e.getID() == KeyEvent.KEY_RELEASED) {

                    if (botao != null) {
                        botao.setBackground(
                            UIManager.getColor("Button.background")
                        );

                        botao.setBorder(
                            UIManager.getBorder("Button.border")
                        );
                    }
                }

                if (e.getID() == KeyEvent.KEY_TYPED) {

                    char c = e.getKeyChar();

                    if (c == '\b') {

                        String atual = texto.getText();

                        if (atual.length() > 0) {
                            texto.setText(
                                atual.substring(0, atual.length() - 1)
                            );
                        }

                    } else if (c == '\n') {

                        texto.append("\n");

                    } else if (c == '\t') {

                        texto.append("    ");

                    } else if (!Character.isISOControl(c)) {

                        texto.append(String.valueOf(c));
                    }
                }

                return false;
            }
        });

        setVisible(true);
    }

    void criarTecla(
        JPanel painel,
        String nome,
        int codigo,
        int x,
        int y,
        int largura
    ) {

        JButton botao = new JButton(nome);

        botao.setBounds(
            x,
            y,
            largura,
            42
        );

        botao.setFocusable(false);

        botao.setFont(
            new Font(
                "Arial",
                Font.PLAIN,
                12
            )
        );

        painel.add(botao);

        teclas.put(
            codigo,
            botao
        );
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
            new Runnable() {

                public void run() {
                    new DigitaFastProva();
                }
            }
        );
    }
}