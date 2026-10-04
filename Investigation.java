
public class Investigation {

    int attempts = 0;
    final int MAX_ATTEMPTS = 3;

    // Search suspect using ID
    public Suspect findSuspectById(Suspect[] suspects, int id) {

        for (Suspect suspect : suspects) {

            if (suspect.id == id) {
                return suspect;
            }
        }

        return null;
    }

    // Investigate a suspect
    public void investigateSuspect(Suspect[] suspects, int id) {

        Suspect suspect = findSuspectById(suspects, id);

        if (suspect != null) {

            System.out.println("Suspect Found!");
            suspect.displayDetails();

        } else {

            System.out.println("Invalid Suspect ID!");8
        }
    }

    // Accusation logic
    public void accuseSuspect(int accusedId, int actualCulpritId) {

        if (attempts >= MAX_ATTEMPTS) {
            System.out.println("All attempts are completed!");
            return;
        }

        attempts++;

        System.out.println("Attempt: " + attempts);

        if (accusedId == actualCulpritId) {

            System.out.println("CASE SOLVED!");
            System.out.println("You identified the culprit.");
            System.out.println("The missing question paper has been recovered.");

            return;

        } else {

            System.out.println("Wrong accusation!");

            if (attempts == MAX_ATTEMPTS) {

                System.out.println("INVESTIGATION FAILED!");
                System.out.println("You have used all three attempts.");
                System.out.println("The culprit escaped.");
            }
        }
    }
}
