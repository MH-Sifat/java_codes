package snakegame;
import snakegame.design.Home;

public class Main {
    public static void main(String[] args) {
            Home home = new Home();
            home.setVisible(true);
            /*
             This line calls the setVisible(true) method on the home object.
            In Java Swing (a part of Java used for building graphical user interfaces),
            the setVisible(true) method is used to make the window (or frame) visible to the user.
            */

        /*
        Contribution of This Code:
          This Main class is responsible for initializing and displaying the first screen of the game,
          likely setting up the initial user interface (like the game menu or start page).
          It serves as the foundation to start the game flow, ensuring that the user sees the game’s interface when they launch the application.
         */
    }
}

/*

Connection Between Classes
The Main class starts the game by creating the Home screen.

The Home screen navigates to either GameFrame (basic game) or PremiumGamePanel (premium game).

The GameFrame contains GamePanel and ButtonPanel for game logic and controls.

The GamePanel interacts with Snake, Food, and ScoreManager to manage the game state.

The PremiumGamePanel extends GamePanel to add premium features.

*/