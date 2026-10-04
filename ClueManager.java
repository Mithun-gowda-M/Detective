public class ClueManager {
    private final String[] clues = {
        "The office door was opened at 2:15 PM.",
        "CCTV shows someone entering the office.",
        "A torn piece of paper was found near the printer.",
        "A suspect's ID card was found inside the office.",
        "The printer was used shortly before the question paper disappeared."
    };

    private final boolean[] collected = new boolean[clues.length];

    public void displayAvailableClues() {
        System.out.println("=== Available Clues ===");
        for (int i = 0; i < clues.length; i++) {
            String status = collected[i] ? "[Collected]" : "[Not Collected]";
            System.out.println((i + 1) + ". " + clues[i] + " " + status);
        }
    }

    public void collectClue(int clueNumber) {
        int index = clueNumber - 1;

        if (index < 0 || index >= clues.length) {
            System.out.println("Invalid clue number! Please choose a number between 1 and " + clues.length + ".");
            return;
        }

        if (collected[index]) {
            System.out.println("Clue #" + clueNumber + " has already been collected!");
        } else {
            collected[index] = true;
            System.out.println("Successfully collected Clue #" + clueNumber + ": " + clues[index]);
        }
    }

    public void displayCollectedClues() {
        System.out.println("=== Collected Clues ===");
        boolean anyCollected = false;

        for (int i = 0; i < clues.length; i++) {
            if (collected[i]) {
                System.out.println((i + 1) + ". " + clues[i]);
                anyCollected = true;
            }
        }

        if (!anyCollected) {
            System.out.println("No clues have been collected yet.");
        }
    }

    public static void main(String[] args) {
        ClueManager manager = new ClueManager();
        manager.displayAvailableClues();
        manager.collectClue(1);
        manager.displayCollectedClues();
    }
}

