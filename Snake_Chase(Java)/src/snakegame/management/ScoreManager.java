package snakegame.management;

import java.io.*;

// Manages the high score by saving and loading it from a file.
public class ScoreManager {
    private static final String SCORE_FILE = "highscore.txt"; // File to store the high score

    public static int loadHighScore() {
        try (BufferedReader reader = new BufferedReader(new FileReader(SCORE_FILE))) {
            return Integer.parseInt(reader.readLine()); // Read the high score from the file
        } catch (IOException | NumberFormatException e) {
            return 0; // Default high score
        }
    }

    public static void saveHighScore(int score) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(SCORE_FILE))) {
            writer.write(String.valueOf(score)); // Write the high score to the file
        } catch (IOException e) {
            System.out.println("Error saving high score: " + e.getMessage());
        }
    }
}

/*
What it does:

Loads the high score from a file.

Saves the high score to a file.
*/