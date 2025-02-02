package snakegame.design;
// This is the main menu screen.

//  imports the Swing library for building graphical user interfaces (GUIs) using components like buttons, labels, and panels
// for Swing components like JFrame, JPanel, and JButton.
import javax.swing.*;
// imports the Abstract Window Toolkit, which provides the graphics and layout management functionality for GUI components.
// for AWT components like Color, Font, and Graphics.
import java.awt.*;

/*
This line declares the Home class, which extends the JFrame class from the Swing library.
JFrame represents a window with standard decorations like title bars, borders, etc.
By extending JFrame, the Home class becomes a window that can be displayed in the game.
*/

//JFrame is a class in Java's Swing library that is used to create a window or frame in a graphical user interface (GUI) application
public class Home extends JFrame {
    public Home() {
        // Frame design
        // Sets the title of the window to "Snake Chase".
        setTitle("Snake Chase");
        //  Sets the size of the window to 800 pixels wide and 600 pixels tall.
        setSize(800, 600);
        // Ensures that the application will close when the window is closed.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Centers the window on the screen when it is opened.
        setLocationRelativeTo(null);
        //  the user can not resizing the window.
        setResizable(false);

        // snake game Main panel
        /*

        Creates a JPanel (a container for UI components) and overrides
        its paintComponent method to customize its appearance

        # JPanel is a container in Java's Swing library, used to organize and hold other graphical components
        (like buttons, text fields, labels, etc.) within a window (JFrame). It is a subclass of JComponent

        */

        JPanel mainPanel = new JPanel() {
            /*
            Overrides the paintComponent method to draw custom content on the panel.
            Calls super.paintComponent(g) to ensure the panel is properly rendered.

            # You can customize the appearance of a JPanel by overriding the paintComponent(Graphics g) method,
             allowing you to draw custom graphics (like shapes, images, etc.) inside the panel.
            */
            // #Inside the paintComponent() method, you can use the Graphics object (g) to draw shapes, images, or any custom graphics.
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);  // #Always call super to ensure proper renderin

                // Home page background image
                /*
                Loads an image (background.png) from the Images folder and draws it on the panel,
                scaling it to fit the panel's dimensions.

                # ImageIcon is a class in Java's Swing library that is used to display images in
                 graphical user interface (GUI) components, such as labels, buttons, or panels.
                */

                ImageIcon background = new ImageIcon("Images/background.png");
                // #drawImage => This method is part of the Graphics class and is used to draw an image on the screen.
                // # Syntax: void drawImage(Image img, int x, int y, int width, int height, ImageObserver observer)
                g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), null);
                // # background is an instance of ImageIcon
                // # getWidth() and getHeight() are methods of the component (like a JPanel or JFrame) and return the current width and height of the component.
                // # This is the ImageObserver. It is used to handle notifications when the image has been loaded or changed. In most cases, you can pass null here because it's not necessary for basic drawing tasks.
            }
        };
        // Sets the layout of mainPanel to null, allowing manual positioning of components using setBounds.
        mainPanel.setLayout(null);
        // mainPanel is a JPanel object that acts as the container for other components, such as buttons, labels, and other UI elements.
        // Start Game Button
        // Creates a button labeled "START GAME".
        JButton startGameButton = new JButton("START GAME");
        // Sets the button's background color to red and text color to white.
        startGameButton.setBackground(Color.RED);
        startGameButton.setForeground(Color.WHITE);
        // Sets the button's font to Arial, bold, and size 18.
        startGameButton.setFont(new Font("Arial", Font.BOLD, 18));
        // Disables the focus border around the button when it is selected.
        startGameButton.setFocusPainted(false);
        // Positions the button at (300, 200) with a size of 200x50 pixels.
        startGameButton.setBounds(300, 200, 200, 50);
        /*
         Adds an action listener to the button. When clicked:
         dispose() closes the current window (Home).
         SwingUtilities.invokeLater ensures the new window (GameFrame) is created and displayed on the Event Dispatch Thread.
         A new GameFrame object is created and made visible.
        */
        startGameButton.addActionListener(e -> {
            dispose(); // Close page
            SwingUtilities.invokeLater(() -> {
                GameFrame gameFrame = new GameFrame();
                gameFrame.setVisible(true);
            });
        });

        // Premium Membership Button
        JButton premiumButton = new JButton("Premium Membership");
        premiumButton.setBackground(Color.YELLOW);
        premiumButton.setForeground(Color.BLACK);
        premiumButton.setFont(new Font("Arial", Font.BOLD, 16));
        premiumButton.setFocusPainted(false);
        premiumButton.setBounds(300, 300, 200, 50);
        /*
        Adds an action listener to the button. When clicked:

        A PremiumDialog is created to handle premium membership confirmation.

        If the user confirms the purchase (premiumDialog.isConfirmed()):

        The current window (Home) is closed.

        A new JFrame (premiumFrame) is created for the premium game.

        A PremiumGamePanel (game logic) and ButtonPanel (control buttons) are added to the frame.

        The frame is packed, centered, and made visible.
        */
        premiumButton.addActionListener(e -> {
            // # Open the premium dialog
            PremiumDialog premiumDialog = new PremiumDialog(this);
            if (premiumDialog.isConfirmed()) {
                dispose(); // # Close the home screen
                SwingUtilities.invokeLater(() -> {
                    // # Open the premium game screen
                    JFrame premiumFrame = new JFrame("Premium Snake Chase");
                    premiumFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    // # BorderLayout is one of the built-in layout managers in Java's Swing library. It arranges components in five regions: North, South, East, West, and Center.
                    premiumFrame.setLayout(new BorderLayout());
                    premiumFrame.setResizable(false);


                    PremiumGamePanel premiumGamePanel = new PremiumGamePanel();
                    premiumFrame.add(premiumGamePanel, BorderLayout.CENTER);

                    ButtonPanel buttonPanel = new ButtonPanel(premiumGamePanel, premiumFrame);
                    premiumFrame.add(buttonPanel, BorderLayout.EAST);


                    // premiumFrame.pack(); is a convenient method that automatically adjusts the window size to fit the components inside it based on their preferred sizes.
                    // # The method premiumFrame.pack(); is used in Java's Swing library to resize the frame to fit the preferred size of its components.
                    premiumFrame.pack();
                    // # In other words, pack() ensures that the window is large enough to contain all the components (buttons, labels, text fields, etc.) that you have added to it
                    premiumFrame.setLocationRelativeTo(null);
                    premiumFrame.setVisible(true);
                });
            }
        });

        // Adding buttons to the main panel
        // Adds the Start Game and Premium Membership buttons to the mainPanel.
        mainPanel.add(startGameButton);
        mainPanel.add(premiumButton);

        // Adding main panel to the frame
        // Adds the mainPanel to the JFrame (window).
        add(mainPanel);
    }

}

/*
The Home class creates the home screen for the Snake game.

It includes:

A background image.

A Start Game button to launch the main game.

A Premium Membership button to access premium features.

The class uses Swing components (JFrame, JPanel, JButton) and custom logic to handle button clicks and transitions between screens.
*/