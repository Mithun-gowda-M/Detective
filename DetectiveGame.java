```java
public class DetectiveGame {

    public static void main(String[] args) {

        // Create objects
        ClueManager clueManager = new ClueManager();
        Investigation investigation = new Investigation();

        // Create five suspects
        Suspect[] suspects = {
            new Suspect(1, "Alex", "Computer Lab", "Working on a project"),
            new Suspect(2, "Maya", "Library", "Studying"),
            new Suspect(3, "Rahul", "Staff Room", "Meeting a faculty member"),
            new Suspect(4, "Sara", "Canteen", "Having lunch"),
            new Suspect(5, "Arjun", "Department Office", "Collecting documents")
        };

        // Actual culprit
        int actualCulpritId = 5;

        // Predefined menu choices
        int[] choices = {1, 2, 3, 4, 5, 6};

        int i = 0;

        while (i < choices.length) {

            int choice = choices[i];

            System.out.println();
            System.out.println("=================================");
            System.out.println("      DETECTIVE INVESTIGATION");
            System.out.println("=================================");
            System.out.println("1. View Suspects");
            System.out.println("2. Investigate Suspect");
            System.out.println("3. Collect Clue");
            System.out.println("4. View Collected Clues");
            System.out.println("5. Accuse Suspect");
            System.out.println("6. Exit");

            switch (choice) {

                case 1:
                    System.out.println("\n--- ALL SUSPECTS ---");

                    for (Suspect suspect : suspects) {
                        suspect.displayDetails();
                    }
                    break;

                case 2:
                    System.out.println("\n--- INVESTIGATE SUSPECT ---");

                    // Predefined suspect ID
                    int suspectId = 5;

                    investigation.investigateSuspect(
                        suspects,
                        suspectId
                    );
                    break;

                case 3:
                    System.out.println("\n--- COLLECT CLUE ---");

                    clueManager.displayAvailableClues();

                    // Predefined clue number
                    int clueNumber = 4;

                    clueManager.collectClue(clueNumber);
                    break;

                case 4:
                    System.out.println("\n--- COLLECTED CLUES ---");

                    clueManager.displayCollectedClues();
                    break;

                case 5:
                    System.out.println("\n--- ACCUSE SUSPECT ---");

                    // Predefined accused suspect
                    int accusedId = 5;

                    investigation.accuseSuspect(
                        accusedId,
                        actualCulpritId
                    );
                    break;

                case 6:
                    System.out.println("\nInvestigation ended.");
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            // Stop after Exit
            if (choice == 6) {
                break;
            }

            i++;
        }
    }
}
```
