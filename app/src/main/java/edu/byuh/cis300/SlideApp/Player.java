package edu.byuh.cis300.SlideApp;

// Enum to represent the two players in the game: Player X and Player O
public enum Player {
    X,  // Represents Player X
    O;  // Represents Player O

    // Overrides the default toString() method to return the name of the enum (X or O)
    @Override
    public String toString() {
        return this.name();  // Returns "X" or "O" depending on which player this is
    }
}
