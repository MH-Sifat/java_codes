package snakegame.design;

import snakegame.logic.GamePanel;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {
    public ButtonPanel(GamePanel gamePanel, JFrame parentFrame) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // Use vertical layout
        setBackground(Color.WHITE); // Set background color
        setPreferredSize(new Dimension(150, 600)); // Set size of the panel

        // Create styled buttons
        JButton pauseButton = createStyledButton("Pause", Color.LIGHT_GRAY);
        JButton resumeButton = createStyledButton("Resume", Color.BLUE);
        JButton newGameButton = createStyledButton("New Game",Color.BLACK);
        JButton exitButton = createStyledButton("Exit",Color.RED);

        int buttonWidth = 120;
        int buttonHeight = 50;

        // Set normal and maximum size to button
        Dimension buttonSize = new Dimension(buttonWidth, buttonHeight);
        pauseButton.setPreferredSize(buttonSize);
        pauseButton.setMaximumSize(buttonSize);

        resumeButton.setPreferredSize(buttonSize);
        resumeButton.setMaximumSize(buttonSize);

        newGameButton.setPreferredSize(buttonSize);
        newGameButton.setMaximumSize(buttonSize);

        exitButton.setPreferredSize(buttonSize);
        exitButton.setMaximumSize(buttonSize);

        // Add action listeners to the buttons
        pauseButton.addActionListener(e -> gamePanel.pauseGame());
        resumeButton.addActionListener(e -> gamePanel.resumeGame());
        newGameButton.addActionListener(e -> gamePanel.startGame());
        exitButton.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(parentFrame, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                parentFrame.dispose(); // Close the current frame
                SwingUtilities.invokeLater(() -> {
                    Home homePage = new Home(); // returning to home page
                    homePage.setVisible(true);
                });

            }
        });

        // Add buttons to the panel
        add(Box.createVerticalStrut(20)); // Spacing
        add(pauseButton);
        add(Box.createVerticalStrut(10));
        add(resumeButton);
        add(Box.createVerticalStrut(10));
        add(newGameButton);
        add(Box.createVerticalStrut(10));
        add(exitButton);
        add(Box.createHorizontalStrut(30)); // Spacing

    }

    // Method to create styled buttons
    private JButton createStyledButton(String text,Color backgroundColor) {
        JButton button = new JButton(text);
        button.setBackground(backgroundColor); // set background color
        button.setForeground(Color.WHITE); // set font color
        button.setFocusPainted(false); // remove border focus
        button.setBorderPainted(false); // remove button border
        button.setFont(new Font("Arial", Font.BOLD, 14)); // set font style and size
        return button;
    }
}

/*

What it does:

Creates a panel with buttons for controlling the game.

Buttons include Pause, Resume, New Game, and Exit.


*/